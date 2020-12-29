package com.learn.springcloudkafkastram;

import com.learn.springcloudkafkastram.event.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringCloudKafkaStramApplication {

	@Autowired
	private MessageService messageService;
	// http://localhost:5080/account/add
	@RequestMapping("account/add")
	public Map<String,Object> getAccoutn(){
		messageService.sendMsg("account/add");
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("code",200);
		return resMap;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKafkaStramApplication.class, args);
	}

}
