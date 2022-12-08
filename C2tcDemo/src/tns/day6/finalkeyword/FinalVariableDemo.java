package tns.day6.finalkeyword;

public class FinalVariableDemo {
	final static int size = 10;
	public static void main(String[] args) {
		FinalVariableDemo f1=new FinalVariableDemo();
		System.out.println(FinalVariableDemo.size);
	//	f1.size=25;
		FinalVariableDemo f2=new FinalVariableDemo();
		System.out.println(FinalVariableDemo.size);
	}

}




/* final keyword
 * define a constant 
 * 
 *  Method Overriding - same name method with same signature in different scope
 * 
 * define final method - can't override it  
 * define final class - can't inherited 
 * 
 */
