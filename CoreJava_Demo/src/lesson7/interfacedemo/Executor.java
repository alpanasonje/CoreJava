package lesson7.interfacedemo;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * We cannot create object of an abstract class
		 * hence, Food f=new Food(); is invalid. 
		 */
		System.out.println("Creating object of carrot halwa");
		Food carrot_halwa=new CarrotHalwa();
		System.out.println("-------------------------------------------------");
		System.out.println("Creating object of doodhi halwa");
		Food doodhi_halwa=new DoodhiHalwa();
		System.out.println("-------------------------------------------------");
		System.out.println("Creating object of Ice Cream");
		Food ice_cream=new IceCream();
		
		System.out.println(carrot_halwa.consume());
		/*
		 * However, carrot_halwa.makeHalwa() will not work
		 * because reference is of "Food" where "makeHalwa()"
		 * is not declared
		 * Hence, creating another object of CarrotHalwa and
		 * assigning it to reference of CarrotHalwa
		 */
		System.out.println("-------------------------------------------------");
		System.out.println("Creating object of CarrotHalwa using reference of CarrotHalwa");
		CarrotHalwa carrot_halwa1=new CarrotHalwa();
		carrot_halwa1.makeHalwa();
		System.out.println(carrot_halwa1.consume());
		
	}

}
