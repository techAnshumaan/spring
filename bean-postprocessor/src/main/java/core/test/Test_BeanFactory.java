package core.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import core.beans.Bike;
import core.beans.Car;
import core.beans.FighterPlane;
import core.helper.IOCObjectTracer;
import core.helper.InstanceTarckerBeanPostProcessor;

public class Test_BeanFactory {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		InstanceTarckerBeanPostProcessor beanPostProcessor = new InstanceTarckerBeanPostProcessor();
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(beanPostProcessor);
//		Bike bike = factory.getBean("bike",Bike.class);
//		Car car = factory.getBean("car",Car.class);
//		FighterPlane fplane = factory.getBean("fplane",FighterPlane.class);
		
		System.out.println("Number of object is created by IOC is "+IOCObjectTracer.getCount());
	}
}
