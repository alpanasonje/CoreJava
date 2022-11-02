package lession7;

class Student
{
	private int rno;
	private String name;
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	public void finalize() throws Throwable
	{
		System.out.println("Object Destroyed");
	}
}
public class GCDemo {

	public static void main(String[] args) {
		Student s1=new Student(10,"Amit");
		System.out.println(s1);
		s1=null;
		System.gc();

	}

}
