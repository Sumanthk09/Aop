package com.example.demo.aop.dto;

public class Employee 
{
	int id;
	String name;
	long phonenumber;
	int sal;
	
	public Employee(int id, String name, long phonenumber, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
