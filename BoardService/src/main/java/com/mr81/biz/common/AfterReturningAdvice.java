package com.mr81.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class AfterReturningAdvice {

	public AfterReturningAdvice() {
		// TODO Auto-generated constructor stub
	}
	public void afterReturning(JoinPoint jp){
		Signature signature=jp.getSignature();
		System.out.println(signature.getName());
	}
}
