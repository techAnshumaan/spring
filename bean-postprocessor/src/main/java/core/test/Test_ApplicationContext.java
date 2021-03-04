package core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.helper.IOCObjectTracer;


public class Test_ApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(IOCObjectTracer.getCount());
	}
}
