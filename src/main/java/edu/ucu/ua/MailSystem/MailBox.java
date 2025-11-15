package edu.ucu.ua.MailSystem;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mailinfo> infos;

    public MailBox() {
        this.infos = new ArrayList<Mailinfo>();
    }

    public void addMailInfo(Mailinfo info) {
        this.infos.add(info);
    }

    public void sendAll(String senderEmail, String senderName) {
        infos.stream()
                .forEach(info -> MailSender.sendMail(info, senderEmail, senderName));
    }
}
