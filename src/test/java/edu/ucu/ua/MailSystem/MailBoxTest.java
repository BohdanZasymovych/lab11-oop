package edu.ucu.ua.MailSystem;

import edu.ucu.ua.MailSystem.MailStrategies.GreetingMailStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    
    @Test
    void testAddMailInfo() {
        MailBox mailBox = new MailBox();
        Client client = Client.builder()
            .name("Alice")
            .email("alice@example.com")
            .build();
        
        Mailinfo info = new Mailinfo(client, new GreetingMailStrategy());
        
        assertDoesNotThrow(() -> mailBox.addMailInfo(info));
    }
}
