package com.mr81.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

	public AroundAdvice() {
		// TODO Auto-generated constructor stub
	}
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("����� ����");
		Object reurnobj = pjp.proceed(); 
		System.out.println("����� ������"); 
		return reurnobj;
	}
}
