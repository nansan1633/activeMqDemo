/**
 * 
 */
package com.plymer;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * 
 * @author 自己的名字
 * @date 2020年4月21日
 */
@Service
public class TopicConsumerService {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Topic topic;

	@Autowired
	private Queue queue;

	public void sendTopic(String msg) {
		synchronized (this) {
			System.err.println("service topic :");
			this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
		}
		
	}

	public void sendQueue(String msg) {
		synchronized (this) {
			System.err.println("service queue :");
			this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
		}
	}

}
