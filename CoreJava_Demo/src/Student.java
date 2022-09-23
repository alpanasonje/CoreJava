
public class Student {
	//data members
    String name;
    int rollno;
    String clas;
    float per;
    static int cnt=0;
    //methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student();
      s1.rollno=10;
      s1.name="Aniket";
      s1.clas="FY";
      s1.per=67;
      Student.cnt++;
      Student s2=new Student();
      s2.rollno=11;
      s2.name="Pankaj";
      s2.clas="SY";
      s2.per=72;
      Student.cnt++;
      System.out.println(s1.rollno+"\t"+s1.name+"\t"+s1.per+"\t"+s1.clas);
      System.out.println(s2.rollno+"\t"+s2.name+"\t"+s2.per+"\t"+s2.clas);
      System.out.println("total Students "+Student.cnt);
	}

}
