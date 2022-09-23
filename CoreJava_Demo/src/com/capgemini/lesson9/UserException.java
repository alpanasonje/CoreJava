package com.capgemini.lesson9;
import java.lang.Exception;

class ApplicationException extends Exception {
    private int detail;
    ApplicationException(int a) {
        detail = a;
     }
	 ApplicationException(String args) {
		super(args);
	 }
     public String toString()      {
        return "ApplicationException["+detail+"]";
     }
}
class UserException {
     static void compute(int a) throws ApplicationException {
	     System.out.println("called compute("+a+")");
		 if (a>10)
			throw new ApplicationException(a);
	     System.out.println("Normal Exit");
     }

	public static void main(String arg[]) {
		try {
			compute(1);
			compute(20);
		} catch (ApplicationException e) {
			System.out.println("caught  "+e);
        }
	}  
}

