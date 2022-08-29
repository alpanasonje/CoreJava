package lesson3;

public class AllDataTypesInJava {

	
	// Instance variable or properties 
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floatVariable;
	double doubleVariable;
	char charVariable;
	boolean booleanVariable;

	// Special method having same name with class name and no returntype
	// called as Constructor
	
	public AllDataTypesInJava() {
		// TODO Auto-generated constructor stub
		System.out.println("Default values are ::==>");
		System.out.println("default value of 'byte' is  ::==>" + byteVariable);
		System.out.println("default value of 'short' is  ::==>" + shortVariable);
		System.out.println("default value of 'int' is  ::==>" + intVariable);
		System.out.println("default value of 'long' is  ::==>" + longVariable);
		System.out.println("default value of 'float' is  ::==>" + floatVariable);
		System.out.println("default value of 'double' is  ::==>" + doubleVariable);
		System.out.println("default value of 'char' is  ::==>" + charVariable);
		System.out.println("default value of 'boolean' is  ::==>" + booleanVariable);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Ranges....................................................");
		System.out.println("min value of 'byte' is  ::==>" + Byte.MIN_VALUE + " and max value is "+ Byte.MAX_VALUE);
		System.out.println("min value of 'short' is  ::==>" + Short.MIN_VALUE + " and max value is "+ Short.MAX_VALUE);
		System.out.println("min value of 'int' is  ::==>" + Integer.MIN_VALUE + " and max value is "+ Integer.MAX_VALUE);
		System.out.println("min value of 'long' is  ::==>" + Long.MIN_VALUE + " and max value is "+ Long.MAX_VALUE);
		System.out.println("min value of 'float' is  ::==>" + Float.MIN_VALUE + " and max value is "+ Float.MAX_VALUE);
		System.out.println("min value of 'double' is  ::==>" + Double.MIN_VALUE + " and max value is "+ Double.MAX_VALUE);
		System.out.println("min value of 'char' is  ::==>" + Character.MIN_VALUE + " and max value is "+ Character.MAX_VALUE);
		
		/* Boolean have only true and false as values. No min or max value hence, 
		code in following line will not work */
		//System.out.println("min value of 'boolean' is  ::==>" + Boolean.MIN_VALUE + " and max value is "+ Boolean.MAX_VALUE);
		System.out.println("Boolean does not have min or max value");	
		
		System.out.println("----------------------------------------------------------");
		System.out.println("What happens when range is crossed");
		System.out.println("Following lines will create compilation errors ....");
		System.out.println(" byteVariable=127+1; \n byteVariable=-128-1");
		/*
		 * byteVariable=127+1; byteVariable=-128-1;
		 */
		
		System.out.println("----------------------------------------------------------");
		System.out.println("What can be incremented and how");
		System.out.println("Integer is incremented "+ ++intVariable); //pre increment
		System.out.println("Integer is incremented again"+ (intVariable++)); //post increment
		System.out.println("Integer is incremented again "+ (intVariable=intVariable+ 1));
		System.out.println("Integer is incremented again... "+ (intVariable+= 1));
		
		System.out.println("Byte is incremented "+ ++byteVariable);
		System.out.println("Byte is incremented again... "+ (byteVariable+= 1));
		System.out.println("Following code doesn't work! Compilation error!!");
		System.out.println("System.out.println(\"Byte is incremented again \"+ (byteVariable=byteVariable+ 1)");
		System.out.println("It is because, it means byte=byte+int and hence invalid");
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit object to test above logic
		AllDataTypesInJava a1=new AllDataTypesInJava();
	
	}
}
