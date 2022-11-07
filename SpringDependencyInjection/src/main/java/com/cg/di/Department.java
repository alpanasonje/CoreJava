package com.cg.di;

public class Department {
	private int deptNo;
	private String name;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + "]";
	}
	public Department(int deptNo, String name) {
		super();
		this.deptNo = deptNo;
		this.name = name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
