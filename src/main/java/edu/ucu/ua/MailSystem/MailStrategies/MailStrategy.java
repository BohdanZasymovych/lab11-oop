package edu.ucu.ua.MailSystem.MailStrategies;

import edu.ucu.ua.MailSystem.Client;

public interface MailStrategy {
    public String generateSubject(Client client);
    public String generateBody(Client client);
}
