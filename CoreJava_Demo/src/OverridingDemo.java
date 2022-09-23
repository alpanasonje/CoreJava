
//Method Overriding - same name method with same signature in parent and child class
//also called as Runtime Polymorphism/Late binding/dynamic binding
class Animal
{
	public void eat()
	{
		System.out.println("Animal eats Grass/Bones");
	}
}
class Dog extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Dog eats Bones");
	}
}

class Cow extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Cow eats Grass");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Animal a1;
		Dog d1;
		Cow c1;
		
		a1=new Animal();
		a1.eat(); //Animal
		d1=new Dog();
		d1.eat(); //Dog
		c1=new Cow();
		c1.eat();//Cow
			
		a1=new Dog();
		a1.eat();//Dog
		
		a1=new Cow();
		a1.eat();//Cow
		

	}

}
