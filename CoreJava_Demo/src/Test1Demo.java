

public class Test1Demo {

	public static void main(String[] args) {
		Person p1=new Person();
		//p1.name - can't access due to private
		p1.setName("Amit");
		p1.city="Pune";
		System.out.println("Person details Name : "+p1.getName()+"\t City : "+p1.city);

	}

}
