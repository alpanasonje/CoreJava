package tns.day3;

public class Person {
	
		String name;
		String city;
		void getData()
		{
			name="Amit";
			city="Pune";
		}
		void accept(String nm, String c)
		{
			name=nm;
			city=c;
		}
		void show()
		{
			System.out.println("Person Details are : Name - "+name+"   City - "+city);
		}	
	}

