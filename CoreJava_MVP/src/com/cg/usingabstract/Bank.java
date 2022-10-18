package com.cg.usingabstract;

public interface Bank {
	static final float MINBAL=5000;
	public void deposit(float amount);
	public void withdraw(float amount);
}
