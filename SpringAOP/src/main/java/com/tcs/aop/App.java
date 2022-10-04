package com.tcs.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
PaymentService ps= context.getBean("payment",PaymentService.class);
		ps.makePayment(100);
}
}
