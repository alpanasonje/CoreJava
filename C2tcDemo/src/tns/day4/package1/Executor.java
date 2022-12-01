//accessing same package class
package tns.day4.package1;

public class Executor {
	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();	//private member can't accessible
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//private member can't accessible
		//b1.varPrivate=31; 
		
		
		b1.varProtected=41;
		b1.methodProtected();
		
		b1.varPublic=21;
		b1.methodPublic();
	}

}
