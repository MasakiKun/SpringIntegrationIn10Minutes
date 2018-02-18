package kr.ayukawa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PollableChannel channel = (PollableChannel)context.getBean("channel");
		channel.send(MessageBuilder.withPayload("Spring Integration rocks").build());
		Message<?> reply = channel.receive();
		System.out.println("received: " + reply);
	}
}
