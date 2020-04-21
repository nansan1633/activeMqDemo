/**
 * 
 */
package com.plymer;

import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * @author 自己的名字
 * @date 2020年4月21日
 */
@Component
public class TopicProducer implements CommandLineRunner {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Override
    public void run(String... args) throws Exception {
        send("Topic message");
        System.out.println("Message was sent to the Topic");
    }

    public void send(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }

}


