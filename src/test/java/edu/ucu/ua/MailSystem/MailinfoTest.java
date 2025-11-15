package edu.ucu.ua.MailSystem;

import edu.ucu.ua.MailSystem.MailStrategies.GreetingMailStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailinfoTest {
    
    @Test
    void testMailinfoCreation() {
        Client client = Client.builder()
            .name("Test")
            .email("test@example.com")
            .build();
        
        Mailinfo mailinfo = new Mailinfo(client, new GreetingMailStrategy());
        
        assertEquals(client, mailinfo.getClient());
        assertNotNull(mailinfo.getMailCode());
    }
}
