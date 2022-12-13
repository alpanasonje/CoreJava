package tns.day7.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {
	/* 8 primitive data types => 8 Wrapper classes and String
	
	 Integer,
	 Character,
	 Float, Boolean, Short, Long, Double, Byte
	 
	 wrapper class - wrap the primitives into objects
	  conversion functions
	  Range Limit
	  */
	
	// Integer i1=new Integer(10);
		
	//Integer 1 int = 4 byte = 4 * 8 bits = 32 bits
	//	-2^31 to 0 to 2^31-1
	 Integer i2=5;
	 System.out.println(i2);
	 System.out.println("Size : "+Integer.SIZE);
	 System.out.println("Lower Range "+Integer.MIN_VALUE);
	 System.out.println("Upper Range "+Integer.MAX_VALUE);
	 
	 Character ch='a';
	 System.out.println("Size : "+Character.SIZE);
	
	 
	 Float f=45.30f;
	 
	 i2=f.intValue();
	 System.out.println("Float to Integer Conversion : "+i2);
	 
	 String s="125";
	 
	 Integer i3=Integer.parseInt(s);
	 System.out.println("String to Integer Conversion : "+i3);
	 
	 s="12.5";
	 Float ff=Float.parseFloat(s);
	 System.out.println("String to Float Conversion : "+ff);
	 
	 ff=55.9f;
	 
	}

}
