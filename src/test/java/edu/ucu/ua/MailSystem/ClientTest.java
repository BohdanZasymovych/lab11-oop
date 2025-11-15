package edu.ucu.ua.MailSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    
    @Test
    void testClientBuilder() {
        Client client = Client.builder()
            .name("Alice")
            .age(25)
            .email("alice@example.com")
            .build();
        
        assertEquals("Alice", client.getName());
        assertEquals("alice@example.com", client.getEmail());
    }
}
