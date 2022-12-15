package tns.day11.exceptions;

public class UsingFinally1 {
	public static int show(int a[])
	{
		int i,sum=0;
		try
		{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		a[3]=12;
		}
		catch(Exception e)
		{
			System.out.println("Error...."+e.getMessage());
		}
		finally
		{
			System.out.println("In Finally Block");
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println("Sum of array elements : "+show(a));
	}

}
