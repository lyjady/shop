package com.example.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRocketmqProducerApplicationTests {

	@Autowired
	private RocketMQTemplate rocketMQTemplate;

	@Test
	void contextLoads() {
		rocketMQTemplate.convertAndSend("SpringBootTopic", "this is rocketmq spring boot starter message");
	}

}
