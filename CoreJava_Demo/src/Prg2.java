
public class Prg2 {

	public static void main(String[] args) {
			
	char ch='A';
	System.out.println("ch = "+ch);
	ch='t';
	System.out.println("ch = "+ch);
	ch=125;
	System.out.println("ch = "+ch);
	ch='9';
	System.out.println("ch = "+ch+" Ascii of "+ch+" is "+(int)ch);
	int n=(int)ch;
	System.out.println("n = "+n);
	ch='^';
	System.out.println("ch = "+ch);
	ch='\t'; //escape sequence
	System.out.println("ch = "+ch+":");
	ch='\\';
	System.out.println("ch = "+ch);
	ch='\'';
	System.out.println("ch = "+ch);
	float per=56.78F;
	System.out.println("per = "+per);
	per=4.6e-4f;
	System.out.println("per = "+per);
	double amt=45776722226.80;
	System.out.println("amt = "+amt);
	long id=1200003765;
	System.out.println("id = "+id);
	int n1=0B1010;
	System.out.println("Binary n1 = "+n1);
	int n2=016;
	System.out.println("octal n2 = "+n2);
	int n3=0x12d;
	System.out.println("Hexadecimal = "+n3);
	boolean flag=true;
	System.out.println("flag = "+flag);
	flag=false;
	System.out.println("flag = "+flag);
	String s1="Hello";
	System.out.println("s1 = "+s1);
	s1=null;
	System.out.println("s1 = "+s1);
	}

}
