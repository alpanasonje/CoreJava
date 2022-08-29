
import java.util.Scanner;

public class SwitchDemo {
    public void show()
    {
    	System.out.println("++++++++++++++++++++");
    }
	public static void main(String[] args) {
		int mno; //int - primitive type
		
		Scanner sc=new Scanner(System.in); //Scanner - class, sc - object
	//	System.out.println("Enter the Month Number : ");
	//	mno=sc.nextInt();
		//System.out.println("You entered "+mno);
		/*switch(mno)
		{
		case 1: System.out.println("Jan");  
				break;
		case 2: System.out.println("Feb");
				break;
		case 3: System.out.println("Mar");  
				break;
		case 4: System.out.println("Apr");
				break;
		case 5: System.out.println("May");  
				break;
		case 6: System.out.println("Jun");
				break;
		case 7: System.out.println("Jul");  
				break;
		case 8: System.out.println("Aug");
				break;
		case 9: System.out.println("Sept");  
				break;
		case 10: System.out.println("Oct");
				break;
		case 11: System.out.println("Nov");  
				break;
		case 12: System.out.println("Dec");
				break;
		default:System.out.println("Invalid Month Number");
		}
		switch(mno)
		{
			case 1,3,5,7,8,10,12: System.out.println("31 Days");
					break;
			case 2: System.out.println("28 or 29(leap year) Days");
					break;
			case 4,6,9,11: System.out.println("30 Days");
					break;
			default:System.out.println("Invalid Month Number");
		}*/
		String mname;
		System.out.println("Enter Month Name : ");
		mname=sc.next();
		switch(mname)
		{
			case "jan","mar","may","jul","aug","oct","dec":System.out.println("31 days");	
														break;
			case "feb": System.out.println("28 or 29(leap year) days");
						break;
			case "apr","sep","jun","nov":System.out.println("30 days");	
										break;
				default:System.out.println("Invalid Month");
		}
				System.out.println("-----------------------------------------");
	}

}
class demo
{
	
}
