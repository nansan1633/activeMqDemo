/**
 * 
 */
package com.plymer;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.stereotype.Component;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * @author 自己的名字
 * @date 2020年4月21日
 */
@Component
public class ConfigMQ {
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("sample.queue");
	}
	
	@Bean
    public Topic topic() {
        return new ActiveMQTopic("sample.topic");
    }
	
	@Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }


	
	
}
