
package com.capgemini.lesson6.basic;

public class Person 
{
   private String name;
   private String contactNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
   public String toString() {
	   return "Person[name : "+name+"\tContact No : "+contactNo+"]";
   }
   
   
}
