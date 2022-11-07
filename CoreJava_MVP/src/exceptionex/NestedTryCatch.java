package exceptionex;

public class NestedTryCatch {
	public static float average(int...n)
	{
		int sum=0;
		float avg=0;
		try
		{
			for(int no:n)
				sum+=no;
			avg=sum/n.length;
		}
		catch(Exception e)
		{
			//System.out.println("error "+e);
			throw e; //re-throwing an exception
		}
		return avg;
	}
	public static void main(String[] args) {
		try
		{
		System.out.println("Average is "+average(10,20,30));
		System.out.println("Average is "+average());
		}
		catch(Exception e)
		{
			System.out.println("Error...."+e);
		}
		System.out.println("------------------------------------");
	}
}