package com.example.demo.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Empconfig 
{
	@Before(value = "execution(* com.example.demo.aop.service.*.*(..))")
	public void serviceemployeebefore(JoinPoint jp)
	{
		System.out.println("serviceemployeebefore");
	}
	
	@Before(value = "execution(* com.example.demo.aop.config.*.*(..))")
	public void configemployeebefore(JoinPoint jp)
	{
		System.out.println("configemployeebefore");
	}
	@After(value = "execution(* com.example.demo.aop.config.*.*(..))")
	public void configemployeeafter(JoinPoint jp)
	{
		System.out.println("configemployeeafter");
	}
	@After(value = "execution(* com.example.demo.aop.service.*.*(..))")
	public void serviceemployeeafter(JoinPoint jp)
	{
		System.out.println("serviceemployeeafter");
	}
}
