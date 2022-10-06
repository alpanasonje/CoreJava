package com.capgemini.lesson12;

public class Executor {

	public static void main(String[] args) {
		
		//create a sender to send string message
		Sender<String> stringSender = new Sender<String>();
		stringSender.setMessage("Hello from Java!");
		stringSender.sendMessage();
		
		//create an email object to be sent using sender
		Email myEmail = new Email();
		myEmail.setFrom("test@igate.com");
		myEmail.setTo("admin@igate.com");
		myEmail.setSubject("Need to block cafeteria for personal event");
		myEmail.setBody("To celebrate IGATE birthday!");
		
		//create a sender to send this email
		Sender<Email> emailSender = new Sender<Email>();
		emailSender.setMessage(myEmail);
		emailSender.sendMessage();
		
		
	}
}
