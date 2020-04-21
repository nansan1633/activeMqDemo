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
public class Consumer {

	
	
	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		System.out.println(text+" consumer");
	}
	
	
	@JmsListener(destination = "sample.queue")
	public void receiveQueue2(String text) {
		System.out.println(text+" consumer2");
	}
	
	@JmsListener(destination = "sample.queue")
	public void receiveQueue3(String text) {
		System.out.println(text+" consumer3");
	}
}
