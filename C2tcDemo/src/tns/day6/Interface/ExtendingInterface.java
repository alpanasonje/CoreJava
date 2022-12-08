package tns.day6.Interface;

/*can we implement one interface from another? -> No
can we extend one interface from another? -> Yes*/

/*public interface ExtendingInterface implements InterfaceOne
{

}*/

interface ExtendingInterface extends InterfaceOne {
	String greet(String name);
}