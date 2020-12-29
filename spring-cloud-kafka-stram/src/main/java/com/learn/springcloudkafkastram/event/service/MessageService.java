package com.learn.springcloudkafkastram.event.service;

import com.learn.springcloudkafkastram.event.SendoutChannel;
import jdk.Exported;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@EnableBinding(SendoutChannel.class)
public class MessageService {
    @Autowired
    private SendoutChannel sendoutChannel;

    public void sendMsg(String s) {
        MessageChannel messageChannel = sendoutChannel.outboundOrg();
        Map<String,Object> messageMap = new HashMap<>();
        messageMap.put("id",1);
        messageMap.put("m",s);
        messageChannel.send(MessageBuilder.withPayload(messageMap).build());
    }
}
