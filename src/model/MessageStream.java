package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection of messages for the log or chat
 */
public class MessageStream {

    /**
     * Stored list of messages.
     */
    private List<Message> messages;


    public MessageStream() {
        this.messages = new ArrayList<>();
    }

    /**
     * Adds a message to the ArrayList of messages.
     * @param message   Message to be added to the stream
     */
    public void addEntry(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return Collections.unmodifiableList(messages);
    }
}
