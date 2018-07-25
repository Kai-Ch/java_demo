package com.jd.superior.main;

import com.sun.mail.util.MailSSLSocketFactory;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @Author:kaichenr
 * @Date:2018/7/25 10:49
 * @Description:
 **/
public class AdjunctMailDemo {
    /**
     * @param to       收件人地址
     * @param from     发件人地址
     * @param password 密码
     * @param title    标题
     * @param content  内容
     */
    public void sendMail(String to, String from, String password, String title, String content, String path) throws GeneralSecurityException {
        // 指定发送邮件的主机为 localhost
        String host = "smtp.qq.com";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject(title);

            // 创建消息部分
            BodyPart messageBodyPart = new MimeBodyPart();
            // 消息
            messageBodyPart.setText(content);

            // 创建多重消息
            Multipart multipart = new MimeMultipart();
            // 设置文本消息部分
            multipart.addBodyPart(messageBodyPart);

            // 附件部分
            messageBodyPart = new MimeBodyPart();
            String filename = path;
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            // 完整消息
            message.setContent(multipart);

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws GeneralSecurityException {
        AdjunctMailDemo adjunctMailDemo = new AdjunctMailDemo();
        String content = "签签 你好!";
        String path = "C:\\Users\\kaichenr\\Desktop\\图片\\nhh.jpg";
        String password = "";
        for (int i = 0; i < 10; i++) {
            adjunctMailDemo.sendMail("249004246@qq.com", "237745537@qq.com", password, "hello qian qian", content, path);
        }
    }

}
