//Without using Exception Handling
public class WithoutExceptionHandling {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 }; //length 3
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i]); 
		//updating array elements
		a[0]=1000;
		a[3]=3000; //throws exception
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i]); 
	}

}
