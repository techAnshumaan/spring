package com.sriman.spring.core.di.test;

import com.sriman.spring.core.di.bean.Robot;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Scientist {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        Robot robo = factory.getBean("robo",Robot.class);
        robo.startUp();
    }
}
