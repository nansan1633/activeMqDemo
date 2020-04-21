/**
 * 
 */
package com.plymer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * @author 自己的名字
 * @date 2020年4月21日
 */
@Component
public class TopicConsumer {

    @JmsListener(destination = "sample.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic1(String text) {
        System.out.println("topic: "+text);
    }

    @JmsListener(destination = "sample.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic2(String text) {
        System.out.println("topic2: "+text);
    }
}

