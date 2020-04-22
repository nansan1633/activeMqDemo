/**
 * 
 */
package com.plymer;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * @author 自己的名字
 * @date 2020年4月21日
 */
@Controller
@RequestMapping
public class HelloController {
	
	
	@Resource
	private TopicConsumerService topicConsumerService;
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "name 11";
		
	}
	
	
	@GetMapping("/topic")
	@ResponseBody
	public String topic(String name) {
		
	
		long start,end;
		start = System.currentTimeMillis();
		for(int i=0;i<1;i++) {
			topicConsumerService.sendTopic(i+"");
		}
		
		
		end = System.currentTimeMillis();  
		System.out.println("start time:" + start+ "; end time:" + end+ "; Run Time:" + (end - start) + "(ms)");
	
		return "topic test";
		
	}
	
	@GetMapping("/queue")
	@ResponseBody
	public String queue(String name) {
		long start,end;
		start = System.currentTimeMillis();
		for(int i=0;i<1;i++) {
			topicConsumerService.sendQueue(i+"");
		}
		
		
		end = System.currentTimeMillis();  
		System.out.println("start time:" + start+ "; end time:" + end+ "; Run Time:" + (end - start) + "(ms)");
	
		
		return "queue test";
		
	}
	
}
