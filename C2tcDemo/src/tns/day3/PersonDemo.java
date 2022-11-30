package tns.day3;

class Person
{
	String name;
	String city;
	void getData()
	{
		name="Amit";
		city="Pune";
	}
	void accept(String nm, String c)
	{
		name=nm;
		city=c;
	}
	void show()
	{
		System.out.println("Person Details are : Name - "+name+"   City - "+city);
	}	
}

public class PersonDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.getData();
		p1.show();
		
		Person p2=new Person();
		p2.accept("Parth", "Mumbai");
		p2.show();

	}

}
