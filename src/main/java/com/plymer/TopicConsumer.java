/**
 * 
 */
package com.plymer;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

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
    //containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic1(String text) {
        System.out.println("topic: "+text);
    }

    @JmsListener(destination = "sample.topic", containerFactory = "jmsListenerContainerTopic")
    //containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic2(String text) {
        System.out.println("topic2: "+text);
    }
    
    
    @JmsListener(destination = "sample.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive(TextMessage msg) throws JMSException {
    	//public void receive(TextMessage msg,Session session) throws JMSException {
        try {
            System.out.println("-- 接收到消息 -- " + msg.getText());
            if (msg.getText().contains("2"))
                throw new JMSException("");
            msg.acknowledge();
        } catch (JMSException e) {
            System.out.println("-----测试重发-----");
            //session.rollback();
        }
    }

    
}

