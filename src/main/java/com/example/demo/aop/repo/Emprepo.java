package com.example.demo.aop.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.aop.dto.Employee;

@Repository
public class Emprepo 
{
	public List<Employee> getEmps()
	{
		return Arrays.asList(
				new Employee(100, "anil", 951523451l, 70000),
				new Employee(101, "joshi", 951233472l, 90000),
				new Employee(102, "harish", 851323452l, 70000)
				);
	}
}
