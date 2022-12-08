package inheritance.multilevelinheritance;

public class MultilevelInhDemo {

	public static void main(String[] args) {
		
		StudentMarks s1=new StudentMarks();
		
		System.out.println("--------------------------------------");
		
		StudentMarks s2=new StudentMarks("Ankita", "Bangalore","TY",67,80,77);
		s2.show();
		
		System.out.println("--------------------------------------");
	}

}
