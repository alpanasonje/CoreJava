package lession7;

public class FunDemo {

	static void changeNumber(int n)
	{
		n=10;
	}
	//not changed as strings are immutable
	static void changeName(String s)
	{
		s="Nitin";
	}
	static void changeStudent(Student st)
	{
		//st=new Student();
		st.setName("pooja");
	}
	public static void main(String[] args) {
		String s1="Mohan";
		int no=5;
		System.out.println("Before ChangeNumber " +no);
		System.out.println("Before changeName "+s1);
		changeNumber(no);
		changeName(s1);
		System.out.println("After ChangeNumber " +no);
		System.out.println("After changeName "+s1);
		Student st1=new Student(11,"Priya");
		System.out.println(st1);
		changeStudent(st1);
		System.out.println(st1);
	}

}
