package org.spring.family.springbootkafkaconsumer.consumer.kafkaconsumer;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @KafkaListener(topics = {"order"},groupId = "test-group-kafka" )
    public void receive(String message){
        System.out.println("app_log--消费消息:" + message);
    }
}
