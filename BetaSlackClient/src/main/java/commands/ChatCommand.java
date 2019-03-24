package commands;

import lombok.Getter;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Getter
public abstract class ChatCommand {
    protected String sender;

    protected ChatCommand(){
        try {
            sender = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new IllegalStateException
                    ("Could not create a command. No internet connection.", e);
        }

    }
}
