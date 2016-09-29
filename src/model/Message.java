package model;

/**
 * Message object that keeps track of the source and content of the message.
 */
public class Message {

    /**
     * Source of the message.
     */
    private String source;

    /**
     * Contents of the message.
     */
    private String message;


    public Message(String source, String message) {
        this.source = source;
        this.message = message;
    }

    public String getSource() {
        return source;
    }

    public String getMessage() {
        return message;
    }
}