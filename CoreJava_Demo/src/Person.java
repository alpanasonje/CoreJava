public class Person {
	//instance members
	private String name;
	// String city; default not allowed in diff package non subclass(P1)
	protected String city;
	//class member
	static int cnt;

public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Person [name=" + name + ", city=" + city + "]";
}

}
