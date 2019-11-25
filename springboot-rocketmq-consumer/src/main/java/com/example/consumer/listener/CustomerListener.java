package com.example.consumer.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author LinYongJin
 * @date 2019/11/25 22:58
 */
@Component
@RocketMQMessageListener(topic = "SpringBootTopic", consumeMode = ConsumeMode.ORDERLY, consumerGroup = "ShopConsumer")
public class CustomerListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("接收到的消息: " + s);
    }
}
