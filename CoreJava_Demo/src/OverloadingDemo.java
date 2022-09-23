

public class OverloadingDemo {
	//Method Overloading - writing/defining same name method with different signature within the same scope
	//different signature will include 1)No. of Parameters/arguments 2) different data types 3) order of parameters type
	//Method/Constructor Overloading is example of compiletime polymorphism/early binding/static binding 
	 public int  cal_addition(int a, int b) 
	    {
	    	return a+b;
	    }
	 public int  cal_addition(int a1)
	    {
	    	return a1+0;
	    }
	 public int  cal_addition(int n, char ch1)
	    {
	    	return ch1+n;
	    }	    
	 public int  cal_addition(char ch1,int n)
	    {
	    	return ch1+n;
	    }
	public static void main(String[] args) {
		OverloadingDemo o1=new OverloadingDemo();
		System.out.println(o1.cal_addition(10)); //line 10 binds at compile time 
		System.out.println(o1.cal_addition('A', 3)); //line 18
		System.out.println(o1.cal_addition(5, '%')); //line 14
		System.out.println(o1.cal_addition(10, 20));//line 6
	}
}
