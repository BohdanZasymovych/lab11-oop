package edu.ucu.ua.MailSystem.MailStrategies;

import edu.ucu.ua.MailSystem.Client;

public class GiftMailStrategy implements MailStrategy{
    public String generateSubject(Client client) {
        String greeting = "Gift for " + client.getName();

        return greeting;
    }

    public String generateBody(Client client) {
        String body = String.format(
            "<h1>Hello %s!</h1>" +
            "<p>We have a special gift for you!</p>",
            client.getName()
        );

        return body; 
    }
}
