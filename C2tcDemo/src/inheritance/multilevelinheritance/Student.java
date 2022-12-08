//single inheritance with super keyword
package inheritance.multilevelinheritance;

public class Student extends Person
{
	private String clas;
	protected float per;
	public Student() {
		System.out.println("Student class default constructor");
		clas="FY";
	
	}
	public Student(String clas) {
		this.clas = clas;
	}
	
	public Student(String name, String city,String clas )
	{
		//private members can't inherited into child class
		/*
		 * super.name=name; super.city=city;
		 */
		super(name,city);
		this.clas = clas;
	
	}
	
	public void show()
	{
		super.show();
		System.out.println("Class : "+clas+"\t Percentage "+per);
	}
	
}
