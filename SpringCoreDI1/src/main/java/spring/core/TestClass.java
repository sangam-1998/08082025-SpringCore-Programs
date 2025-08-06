package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext as = new ClassPathXmlApplicationContext("conf.xml");
		Object obj = as.getBean("bean");
		
		System.out.println(obj);

	}

}
