package edu.ucu.ua.MailSystem;

import edu.ucu.ua.MailSystem.MailStrategies.GreetingMailStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailStrategiesTest {
    
    @Test
    void testGreetingMailStrategy() {
        Client client = Client.builder()
            .name("John")
            .email("john@example.com")
            .build();
        
        GreetingMailStrategy strategy = new GreetingMailStrategy();
        String subject = strategy.generateSubject(client);
        String body = strategy.generateBody(client);
        
        assertNotNull(subject);
        assertTrue(body.contains("John"));
    }
}
