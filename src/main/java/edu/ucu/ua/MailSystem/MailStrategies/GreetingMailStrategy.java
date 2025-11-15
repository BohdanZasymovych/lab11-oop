package edu.ucu.ua.MailSystem.MailStrategies;

import edu.ucu.ua.MailSystem.Client;

public class GreetingMailStrategy implements MailStrategy {
    public String generateSubject(Client client) {
        String greeting = "Hello, " + client.getName();

        return greeting;
    }

    public String generateBody(Client client) {
        String body = String.format(
            "<h1>Hello %s!</h1>" +
            "<p>Welcome to our amazing service.</p>" +
            "<p>We're glad to have you with us!</p>",
            client.getName()
        );

        return body; 
    }
}
