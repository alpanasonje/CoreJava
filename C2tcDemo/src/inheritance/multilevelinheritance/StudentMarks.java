package inheritance.multilevelinheritance;

public class StudentMarks extends Student {
	private int sub1,sub2,sub3;

	public StudentMarks() {
		System.out.println("Student Marks Class Default Constructor");
	}

	public StudentMarks(String name, String city, String clas, int sub1, int sub2, int sub3) {
		super(name, city, clas);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		super.per=(sub1+sub2+sub3)/3.0f;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Subject 1 : "+sub1+"\tSubject 2 : "+sub2+"\tSubject 3 : "+sub3);
	}
	

}
