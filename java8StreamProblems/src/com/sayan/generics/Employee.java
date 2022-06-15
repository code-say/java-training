package com.sayan.generics;

public class Employee {

	private int empId;
	private String empname;
	private int deptId;
	private String status = "active";
	private int salary;
	
	public Employee(int empId, String empname, int deptId, String status, int salary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
