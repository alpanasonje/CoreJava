import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> hm=new TreeMap<String, Double>();
		System.out.println("TreeMap : "+hm);
		hm.put("Amit", null);
		hm.put("Pooja", null);
		hm.put("Neha", 72.75);
		hm.put("Prajakta", 78.40);
		hm.put("Amol", 69.75);
		hm.put("Dhruv", 82.40);
		hm.put("Manoj", 65.75);
		hm.put("Dhruv", 89.40);
	/*	hm.put(null, 69.75);
		hm.put(null, 82.40);
		hm.put(null, null);* null keys not allowed*/
		
		System.out.println("TreeMap : "+hm);
		Set set =hm.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			Entry me=(Entry)i1.next();
			System.out.println(me.getKey()+ " : "+me.getValue());
		}	
		
		//Backed Collection
		SortedMap<String,Double> sm=hm.subMap("Dhruv", "Pooja");
		System.out.println(sm);
		hm.put("Esha", 87.20);
		hm.put("Farheen", 69.30);
		
		System.out.println(hm);
		System.out.println(sm);
		TreeMap tm=new TreeMap();
		tm.put(12, "Pune");
		tm.put(15, "Nashik");
		tm.put(01, "Mumbai");
		tm.put(04, "Mumbai");
		tm.put(11, "Pune");
		System.out.println(tm);
		
		TreeMap tm1=new TreeMap();
		//tm1.put(new Product("T-Shirt",560,10,101),500);
		//ClassCastException , Key - Number/String/Date Class implements Comparable interface
		tm1.put(new Emp(101,"Amit",56000),"Sales");
		tm1.put(new Emp(105,"Pooja",51000),"Purchase");
		tm1.put(new Emp(102,"Sumit",46000), "Sales");
		tm1.put(new Emp(106,"Neha",87200),"HR");
		tm1.put(new Emp(103,"Pratiksha",61000),"Account");
		tm1.put(new Emp(104,"Amol",43000),"HR");
		System.out.println(tm1);
		
		
	}

}
