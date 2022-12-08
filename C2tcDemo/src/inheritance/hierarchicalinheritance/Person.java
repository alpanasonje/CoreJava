package inheritance.hierarchicalinheritance;

public class Person {
	private String name;
	private String city;

	public Person() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="Pune";
	}

	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public void show() {
		System.out.println("Name : " + name + "\tCity " + city);
	}

}
