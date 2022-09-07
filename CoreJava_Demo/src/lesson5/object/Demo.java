package lesson5.object;

class Student 
{
	private int rno;
	private String name;
	private float per;
	private String contactNo;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	public String getContactNo()
	{
		return contactNo;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + ", contactNo=" + contactNo + "]";
	}
	
}

public class Demo {
	public static void main(String args[])
	{
		/*Student s1=new Student();
		s1.setRno(1);
		s1.setName("Abhijit");
		s1.setPer(78);
		s1.setContactNo("9887676761");
		System.out.println(s1);
		Student s2=new Student();
		s1.setRno(2);
		s1.setName("Neelam");
		s1.setPer(81);
		s1.setContactNo("8887676761");
		System.out.println(s2);
		*/
		/*length(): length of string
		indexOf(): searches an occurrence of a char, or string within other string
		substring(): Retrieves substring from the object
		trim(): Removes spaces
		valueOf(): Converts data to string
		isEmpty(): Added in Java 6 to check whether string is empty or not
		concat(String s)*/ 
		
		String str1=new String("Java Programming");
		System.out.println("str1 is : "+str1);
		System.out.println("Length : "+str1.length());
		System.out.println("Index of P : "+str1.indexOf("P"));
		System.out.println("Substring : "+str1.substring(5));
		System.out.println("Substring : "+str1.substring(5,12));
		System.out.println("valueOf : "+str1.valueOf(5));
		System.out.println("Concate : "+str1.concat(" Training"));
		String ss="Hello";
		int n=ss.indexOf("l")+1;
		System.out.println(ss.indexOf("l",n));
		System.out.println("first occurrance of a in Java Programming :  "+str1.indexOf("a"));
		System.out.println("Last occurrance of a in Java Programming :  "+str1.lastIndexOf("a"));
		System.out.println(str1.charAt(5));
		str1="   String    ";
		System.out.println(str1+str1.length());
		System.out.println(str1.trim()+str1.trim().length());
		
		String s1="Java";
		String s2="Fullstack";
		String s3=s1 +" " +s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}
}
