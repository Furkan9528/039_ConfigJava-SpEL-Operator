package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext appCtx =new  ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		
		Operatorler operatorler = appCtx.getBean("operatorlerBean", Operatorler.class);
		
		System.out.println(operatorler.isEqualTest());
		
		System.out.println(operatorler.isAndTest());
		
		
		
		/*
		 * System.out.println(operatorler.isEqualTest());
		 * 
		 * System.out.println(operatorler.isNotEqualTest());
		 * 
		 * System.out.println(operatorler.isLessThanTest());
		 * 
		 * System.out.println(operatorler.isLessThanOrEqualTest());
		 * 
		 * System.out.println(operatorler.isAndTest());
		 * 
		 * System.out.println(operatorler.getAddStringTest());
		 * 
		 * System.out.println(operatorler.getExponentialTest());
		 * 
		 */
	}

}
