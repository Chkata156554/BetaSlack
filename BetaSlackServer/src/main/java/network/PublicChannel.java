package network;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PublicChannel extends Channel {

    private List<ChatClient> channelUsers = new ArrayList<>();

    public PublicChannel(String name) {
        super(name);
    }

    @Override
    public void join(ChatClient client) {
        channelUsers.add(client);
        System.out.println("New client has joined" + name + "channel.");
        System.out.println("Client in channel " + name + ": " + channelUsers.size());
    }

    @Override
    public void leave(ChatClient client) {
        if(channelUsers.contains(client)){
        channelUsers.remove(client);
            System.out.println("Client has left" + name + "building.");
            System.out.println("Client in channel" + name + ": " + channelUsers.size());
        }
    }

    @Override
    public void broadcast(ChatClient sender, String message) {
        List<ChatClient> recipients = channelUsers.stream()
                .filter(chatClient -> chatClient != sender )
                .collect(Collectors.toList());

        recipients.forEach( recipient -> recipient.sendMessage(message));

    }
}
