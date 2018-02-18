package kr.ayukawa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
