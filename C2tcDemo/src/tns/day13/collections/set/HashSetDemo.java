//Program to demonstrate HashSet
package tns.day13.collections.set;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {
	public static HashSet getNumberSet()
	{
		//unordered set
		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(21);
		numberSet.add(50);
		numberSet.add(250);
		numberSet.add(211);
		numberSet.add(501);
		numberSet.add(21);
		numberSet.add(91);
		numberSet.add(41);
		return numberSet;
	}

	public static void main(String args[]) {
		// unordered and unsorted unique collection - hash function
		HashSet<Integer> numberSet = new HashSet<Integer>();

		numberSet.add(650);
		numberSet.add(50);
		numberSet.add(200);
		numberSet.add(null);
		System.out.println(numberSet.add(100));
		numberSet.add(250);
		System.out.println(numberSet.add(100));

		System.out.println("First Number Set is " + numberSet);

		HashSet<Integer> numberSet1 = getNumberSet();

		System.out.println("Second Number Set is " + numberSet1);
		
			
		//SET Difference (numberSet1 - numberSet)
		numberSet1.removeAll(numberSet);
		System.out.println("Second Number Set is " + numberSet1);
			
		numberSet1=getNumberSet();	
		//SET Intersection (numberSet1 INTERSECTION numberSet) 
		numberSet1.retainAll(numberSet);
		System.out.println("Second Number Set is " + numberSet1);
		
		numberSet1=getNumberSet();
		//SET Union (numberSet1 UNION numberSet)
		numberSet1.addAll(numberSet); 
		System.out.println("Second Number Set is " + numberSet1);
		
		
	//	Collections.sort(numberSet); CTE 
		
	}

}
