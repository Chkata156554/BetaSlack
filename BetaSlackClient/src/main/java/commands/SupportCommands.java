package commands;

public enum SupportCommands {
    UNKNOWN(""),
    ADD_CHANNEL("/addchannel"),
    JOIN_CHANNEL("/joinchannel"),
    LOGIN("/login"),
    REGISTER("/register"),
    CHANGE_USERNAME("/changeusername");

    private String stringValue;

    SupportCommands(String val) {
        stringValue = val;
    }

    public static SupportCommands fromString(String string) {
        String trimmedString = string.trim();

        switch (trimmedString.toLowerCase()) {
            case "/addchannel":
                return ADD_CHANNEL;
            case "/joinchannel":
                return JOIN_CHANNEL;
            case "/login":
                return LOGIN;
            case "/register":
                return REGISTER;
            case "/changeusername":
                return CHANGE_USERNAME;
            default:
                return UNKNOWN;
        }
    }
}
