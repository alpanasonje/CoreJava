

interface I1
{
	public String msg="Hello";
	void show(String name);
}

//class Greetinmg implementing an interface I1
class Greeting implements I1
{
	@Override
	public void show(String name) {
		System.out.println(msg+ " "+name);
		
	}
	
}

//one interface can extend another interface but can't extend from a class
interface I2 extends I1
{
	void display();
}

//is it possible to implement one interface from another interface? 
//No, An interface cannot implement another interface  
/*1. An interface contains only abstract methods i.e method without body
2. If a class implements an interface then class must provide 
body for all abstract methods of an interface
*/
//interface I3 implements I1

interface I3
{
	public int c=5;
}

//class Greets implementing an interface I2
class Greets implements I2
{
	@Override
	public void show(String name) {
			
	}

	@Override
	public void display() {
	}
}

//Multiple Inheritance
class MIdemo implements I1,I3
{

	@Override
	public void show(String name) {
		for(int i=0;i<c;i++)
			System.out.println(msg+" "+name);
		
	}
	
}

class mix extends Greets implements I1,I2,I3
{
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		//I1 i=new I1(); 
		I1 i=new Greeting();
		i.show("B23 Batch Students");

	}

}
