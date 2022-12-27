package tns.day13.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//sorted set
		TreeSet<Integer> numberSet=new TreeSet<Integer>();
		numberSet.add(50);
		numberSet.add(40);
		numberSet.add(10);
		numberSet.add(30);
		numberSet.add(20);
		
		System.out.println("Number set is "+numberSet);
		
	//	numberSet.add("Hello");// CTE
		
		numberSet.add(null); //RTE 
		System.out.println("Number Set is "+numberSet);
		
	}

}
