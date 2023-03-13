//Program to demonstrate Lambda Expression
package com.tnsif.lambdaexpressions;

@FunctionalInterface
interface Message{  
    public void greet(String name);    
 } 
public class WithoutLambdaExpr { 
	  
	    public static void main(String[] args) {  
	        
	    	//without lambda, Message implementation using anonymous class  
	        Message m=new Message(){  
	            public void greet(String name){
	            	System.out.println("Hello "+name);}  	           
	        };  
	        m.greet("Aniket");  
	        
	        //Using Lambda Expression
	        Message m1=(name)->{  
	            System.out.println("Hello "+name);  
	        };  
	        
	        m1.greet("Nikhil");
	    }  
	}  
