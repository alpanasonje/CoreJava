//single inheritance with super keyword
package inheritance.singleinheritance;

public class Student extends Person
{
	String clas;
	float per;
	public Student() {
		System.out.println("Student class default constructor");
		clas="FY";
		per=70;
	}
	public Student(String clas, float per) {
		this.clas = clas;
		this.per = per;
	}
	
	public Student(String name, String city,String clas, float per )
	{
		//private members can't inherited into child class
		/*
		 * super.name=name; super.city=city;
		 */
		super(name,city);
		this.clas = clas;
		this.per = per;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Class : "+clas+"\t Percentage "+per);
	}
	
}
