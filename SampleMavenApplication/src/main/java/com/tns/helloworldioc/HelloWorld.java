package com.tns.helloworldioc;

public class HelloWorld {
	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void sayHello(String name) {
		System.out.println(msg+" "+name);
	}
}