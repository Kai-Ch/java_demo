package com.demo.jd.superior.mail;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * @Author:kaichenr
 * @Date:2018/7/25 10:14
 * @Description: 纯文本
 **/
public class MailDemo {
    /**
     *
     * @param to         收件人地址
     * @param from       发件人地址
     * @param password   密码
     * @param title      标题
     * @param content    内容
     * @throws GeneralSecurityException
     */
    public void sendMail(String to, String from, String password,String title, String content) throws GeneralSecurityException {
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

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject(title);

            // 设置消息体
            message.setText(content);

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
        MailDemo mailDemo = new MailDemo();
        String content = "签签 你好！";
        String password = "";
        for (int i = 0; i < 10; i++) {
            mailDemo.sendMail("249004246@qq.com", "237745537@qq.com", password,"hello qian qian", content);
        }
    }
}
