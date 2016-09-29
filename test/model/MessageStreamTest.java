package model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MessageStreamTest {

    private MessageStream testStream = new MessageStream();
    private Message testMessage = new Message("source", "message");

    @Test
    public void shouldAddMessageToStream() {
        testStream.addEntry(testMessage);
        List<Message> messages = testStream.getMessages();
        assertEquals(messages.size(), 1);
        assertEquals(messages.get(0), testMessage);
    }

}