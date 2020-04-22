/**
 * 
 */
package com.plymer;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

/**
 * 类描述： xxxxxxxxxxxxxxxx
 * @author 自己的名字
 * @date 2020年4月22日
 */
@Component
@EnableJms
public class JmsConfiguration {
    @Value("${spring.activemq.broker-url}")
    private String url;
    @Value("${spring.activemq.user}")
    private String user;
    @Value("${spring.activemq.password}")
    private String password;

//    public RedeliveryPolicy redeliveryPolicy(){
//        RedeliveryPolicy redeliveryPolicy=   new RedeliveryPolicy();
//        //是否在每次尝试重新发送失败后,增长这个等待时间
//        redeliveryPolicy.setUseExponentialBackOff(true);
//        //重发次数,默认为6次,这里设置为10次,-1表示不限次数
//        redeliveryPolicy.setMaximumRedeliveries(-1);
//        //重发时间间隔,默认为1毫秒,设置为10000毫秒
//        redeliveryPolicy.setInitialRedeliveryDelay(10000);
//        //表示没有拖延只有UseExponentialBackOff(true)为true时生效
//        //第一次失败后重新发送之前等待10000毫秒,第二次失败再等待10000 * 2毫秒
//        //第三次翻倍10000 * 2 * 2，以此类推
//        redeliveryPolicy.setBackOffMultiplier(2);
//        //是否避免消息碰撞
//        redeliveryPolicy.setUseCollisionAvoidance(true);
//        //设置重发最大拖延时间360000毫秒 表示没有拖延只有UseExponentialBackOff(true)为true时生效
//        redeliveryPolicy.setMaximumRedeliveryDelay(360000);
//        return redeliveryPolicy;
//    }
//
//    public ConnectionFactory connectionFactory(){
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(url);
//        connectionFactory.setUserName(user);
//        connectionFactory.setPassword(password);
//        //设置重发属性
//        connectionFactory.setRedeliveryPolicy(redeliveryPolicy());
//        return connectionFactory;
//
//    }
//    /**
//     * JMS 队列的监听容器工厂
//     */
//    @Bean(name = "jmsTopicListener")
//    public DefaultJmsListenerContainerFactory jmsTopicListenerContainerFactory() {
//        DefaultJmsListenerContainerFactory factory =
//                new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory());
//        factory.setPubSubDomain(true);
//        factory.setSessionTransacted(true);
//        factory.setAutoStartup(true);
//        //开启持久化订阅
//        factory.setSubscriptionDurable(true);
//        //重连间隔时间
//        factory.setRecoveryInterval(1000L);
//        factory.setClientId("mysub");
//        return factory;
//    }
}

