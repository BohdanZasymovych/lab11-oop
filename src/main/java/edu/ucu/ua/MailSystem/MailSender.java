package edu.ucu.ua.MailSystem;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Emailv31;

import edu.ucu.ua.MailSystem.MailStrategies.MailStrategy;

public class MailSender {
    public static void sendMail(Mailinfo info, String senderEmail, String senderName) {
        MailjetClient client = new MailjetClient(API_KEY, API_SECRET, new ClientOptions("v3.1"));  
        MailjetRequest request = MailInfoToMailjetRequest(info, senderEmail, senderName);
        
        MailjetResponse response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }

    private static MailjetRequest MailInfoToMailjetRequest(Mailinfo info, String senderEmail, String senderName) {
        Client client = info.getClient();
        MailStrategy mailStrategy = info.getMailCode();

        MailjetRequest request = new MailjetRequest(Emailv31.resource)
            .property(Emailv31.MESSAGES, new JSONArray()
                    .put(new JSONObject()
                            .put(Emailv31.Message.FROM, new JSONObject()
                                    .put("Email", senderEmail)
                                    .put("Name", senderName))
                            .put(Emailv31.Message.TO, new JSONArray()
                                    .put(new JSONObject()
                                            .put("Email", client.getEmail())
                                            .put("Name", client.getName())))
                            .put(Emailv31.Message.SUBJECT, mailStrategy.generateSubject(client))
                            .put(Emailv31.Message.HTMLPART, mailStrategy.generateBody(client))
                    )
            );

        return request;
    }
}
