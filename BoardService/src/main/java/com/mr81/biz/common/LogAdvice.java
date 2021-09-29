package com.mr81.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LogAdvice {

	public LogAdvice() {
		// TODO Auto-generated constructor stub
	}
	public void printLog(JoinPoint jp){
		System.out.println("just printLog()");
		Signature sig = jp.getSignature(); 
		System.out.println(sig.getName());
	}
}
