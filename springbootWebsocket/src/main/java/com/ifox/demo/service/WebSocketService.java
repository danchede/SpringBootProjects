package com.ifox.demo.service;

import org.springframework.stereotype.Service;

import com.ifox.demo.bean.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@Service
public class WebSocketService {

    @Autowired
    //使用SimpMessagingTemplate 向浏览器发送消息
    private SimpMessagingTemplate template;

    public void sendMessage() throws Exception{
        for(int i=0;i<10;i++)
        {
            Thread.sleep(1000);
            template.convertAndSend("/topic/getResponse",new Response("Welcome,yangyibo !"+i));
            System.out.println("----------------------yangyibo"+i);
        }
    }

}