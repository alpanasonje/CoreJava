//Program to demonstrate creating generic class
package com.tnsif.generics;

public class SenderDemo {

	public static void main(String[] args) {
		Sender<String> stringSender =new Sender<String>();
		stringSender.setMessage("Hello! How are you?"); //Message as String 
		
		Sender<Person> personSender =new Sender<Person>();
		personSender.setMessage(new Person("Amit","Pune")); //Message as Person Object

		stringSender.sendMessage();
		personSender.sendMessage();
	}

}
