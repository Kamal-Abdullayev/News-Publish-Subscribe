package com.newspubsub.notification.service;

import javax.mail.*;
import javax.mail.internet.*;

import com.newspubsub.notification.dto.SendMailRequest;
import com.newspubsub.notification.util.EmailContent;
import com.sun.mail.smtp.SMTPTransport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Properties;

@RequiredArgsConstructor
@Service
@Slf4j
public class SendMessageService {

    @Value("${spring.mail.host}")
    private String host;
    @Value("${spring.mail.username}")
    private String username;
    @Value("${spring.mail.password}")
    private String password;

    public void sendMail(SendMailRequest mailRequest) {
        Properties props = System.getProperties();
        props.put("mail.smtps.host", host);
        props.put("mail.smtp.auth", "true");


        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(username));
            InternetAddress[] address = InternetAddress.parse(mailRequest.email(), false);
            msg.setRecipients(Message.RecipientType.TO, address);

            msg.setSubject("Hello");
            msg.setSentDate(new Date());

            Multipart mp = new MimeMultipart();
            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(EmailContent.HTML, "text/html");
            mp.addBodyPart(htmlPart);
            msg.setContent(mp);


            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
            t.connect(host, username, password);
            t.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Response: " + t.getLastServerResponse());

            log.info("Email have been send to: {}", mailRequest.email());
            t.close();
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
