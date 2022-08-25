package com.sky;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.sky.aop.ApplicationService;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Call");
		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		ApplicationService service = (ApplicationService) beanfactory.getBean(ApplicationService.class);

		service.processApplication();
	}

}
