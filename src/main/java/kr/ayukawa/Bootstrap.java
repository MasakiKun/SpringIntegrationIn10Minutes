package kr.ayukawa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageChannel input = (MessageChannel)context.getBean("input");
		input.send(MessageBuilder.withPayload("Spring Integration rocks").build());
	}
}
