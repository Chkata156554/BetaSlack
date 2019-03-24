package network;

import java.util.Objects;

public abstract class Channel {
    protected String name;

    protected Channel(String name){
        this.name = name;
    }
    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;
        Channel channel = (Channel) o;
        return Objects.equals(name, channel.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public abstract void join(ChatClient client);
    public abstract void leave(ChatClient client);
    public abstract void broadcast(ChatClient sender,String message);
}
