package com.example.SpringBoot.Employee;

public class Employee {

	private String ename;
	private String empno;
	private String job;
	
	

	public Employee() {
		
	}
	
	public Employee(String ename, String empno, String job) {
		super();
		this.ename = ename;
		this.empno = empno;
		this.job = job;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
}
