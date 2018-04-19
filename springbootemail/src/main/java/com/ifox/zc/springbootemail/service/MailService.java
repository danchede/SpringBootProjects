package com.ifox.zc.springbootemail.service;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:33 2018/4/19
 * @Modified By:
 */
public interface MailService {
     void sendSimpleMail(String to, String subject, String content);

     void sendHtmlMail(String to, String subject, String content);

     void sendAttachmentsMail(String to, String subject, String content, String filePath);

     void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

}
