package com.tcs.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.tcs.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore()
	{	System.out.println("Payment started...");
	}
	
	@After("execution(* com.tcs.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printdone()
	{	System.out.println("Payment Completed...");
	}
	
	/*
	 * @Before("info()") public void paymentBefore() {
	 * System.out.println("Payment process started xxx..."); }
	 * 
	 * @After("info()") public void paymentAfter() {
	 * System.out.println("Payment process Completed. yyy......"); }
	 * 
	 * @Pointcut("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment(..))"
	 * ) public void info() { }
	 * 
	 * 
	 * @Pointcut("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment(..))"
	 * ) public void info() { }
	 */

}
