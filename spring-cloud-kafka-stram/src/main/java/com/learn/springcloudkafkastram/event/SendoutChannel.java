package com.learn.springcloudkafkastram.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

public interface SendoutChannel {

    @Output("outboundOrg")
    MessageChannel outboundOrg();
    
}
