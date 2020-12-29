package com.learn.account.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义自定义通道
 */
public interface CustomChannels {
    
    @Input("inboundOrgChanges")//@Input是方法级别的注解，它定义了通道的名称
    SubscribableChannel orgs();//通过@Input注解公开的每个通道必须返会一个SubscribableChannel类
}
