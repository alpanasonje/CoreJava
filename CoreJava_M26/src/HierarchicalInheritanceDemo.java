package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalInheritanceDemo {
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(80, 5, 5);
		mb.applyBreak(5);
		mb.accelerate(10);
		System.out.println(mb);
		ElectricBike eb=new ElectricBike(80,0,3000,5000);
		System.out.println(eb);
	}
}
