package edu.ucu.ua.MailSystem;

import edu.ucu.ua.MailSystem.MailStrategies.MailStrategy;
import lombok.Getter;

@Getter
public class Mailinfo {
    private Client client;
    private MailStrategy mailCode;

    public Mailinfo(Client client, MailStrategy mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
}
