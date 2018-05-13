package com.ifox.springbootwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:54 2018/5/13
 * @Modified By:
 */
@Controller

public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyReponse say(WiselyMessage message) throws Exception
    {
        //等待3秒返回消息内容
        Thread.sleep(3000);
        return new WiselyReponse("欢迎使用webScoket："+message.getName());
    }
}
