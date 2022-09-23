package lesson7.interfacedemo;

public class DoodhiHalwa extends Halwa {

	public DoodhiHalwa()
	{
		System.out.println("Doodhi Halwa");
	}
	
	@Override
	public void makeHalwa() {
		// TODO Auto-generated method stub
		System.out.println("Search receipe for Doodhi/Lauki halwa and make it");
	}

	@Override
	public String consume() {
		// TODO Auto-generated method stub
		System.out.println(who_m_i);
		//prepareToEat();
		return "eat when hot or cold but not when ice frozen";
	}

}
