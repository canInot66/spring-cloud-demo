package com.learn.account.event.service;

import com.learn.account.event.CustomChannels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.util.Map;

@EnableBinding(CustomChannels.class)
public class MessageConsumer {
    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @StreamListener("inboundOrgChanges")
    public void receive(Map<String, Object> paramMap) {
        logger.info("receive msg：{}", paramMap);
    }
}
