package com.example.demo.aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.aop.repo.Emprepo;
import com.example.demo.aop.dto.Employee;

@Service
public class Empservice 
{
	@Autowired
	Emprepo er;

	public List<Employee> getemps() {
		// TODO Auto-generated method stub
		return er.getEmps();
	}
	
}
