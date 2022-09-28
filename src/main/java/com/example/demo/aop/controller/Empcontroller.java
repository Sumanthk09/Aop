package com.example.demo.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aop.service.Empservice;
import com.example.demo.aop.dto.Employee;
@RestController
public class Empcontroller 
{
	@Autowired
	Empservice es;
	@GetMapping("/getemps")
	public List<Employee> getempdetails()
	{
		return es.getemps();
	}
}
