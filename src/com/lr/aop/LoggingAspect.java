package com.lr.aop;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//用AspectJ注释声明切面，还可以用xml配置文件的方式声明。
@Aspect
@Component
@Order(1)//当有多个切面时通过@Order标注设置优先级，数字越小，优先级越高
public class LoggingAspect {
	
	//定义一个方法，声明切入点的表达式，一般地，该方法不需要添加其他代码
	@Pointcut("execution(* com.lr.aop.CalculatorImpl.*(..))")
	public void declareJoinPointExpression() {
		
	}
	//前置通知
	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Method:"+ methodName + "begins with"+ Arrays.asList(args));
	}
	
	//后置通知
	@After("execution(* com.lr.aop.CalculatorImpl.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Method:"+ methodName + " end");
	}
	
	//返回通知
	@AfterReturning(value="declareJoinPointExpression()", 
			returning="result")
	public void afterReturnMethod(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Method:"+ methodName + " return:" + result);
		
	}
	
	//异常通知
	@AfterThrowing(value="declareJoinPointExpression()", 
			throwing="ex")
	public void afterReturnMethod(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Method:"+ methodName + " Exception:" + ex);
		
	}
	
//	@Around("execution(* com.lr.aop.CalculatorImpl.*(..))")
//	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
//		
//		Object result = null;
//		String methodName = proceedingJoinPoint.getSignature().getName();
//		Object[] args = proceedingJoinPoint.getArgs();
//		try {
//			//前置通知
//			System.out.println("Method:"+ methodName + "begins with"+ Arrays.asList(args));
//			result = proceedingJoinPoint.proceed();
//			//返回通知
//			System.out.println("Method:"+ methodName + " return:" + result);
//		} catch (Throwable e) {
//			// TODO: handle exception 
//			//异常通知
//			System.out.println("Method:"+ methodName + " Exception:" + e);
//		}
//		//后置通知
//		System.out.println("Method:"+ methodName + " end");
//		return result;
//	}
}
