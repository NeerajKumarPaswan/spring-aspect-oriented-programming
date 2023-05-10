package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	//* in beginning means all the methods with any access modifier
	//* after PaymentServiceImpl.*-> indicates all the methods in this package
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment started");
	}
	
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment Done");
	}
//in case my method has argument
//	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
//	public void printBefore() {
//		System.out.println("Payment started");
//	}
}
