import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set s=new HashSet(); //Hashing - Hash Function 
		System.out.println(s.add(10));
		s.add(20);
		s.add(30);
		s.add(true);
		s.add(12.67);
		s.add("Hello");
		System.out.println(s.add(10));
		System.out.println("HashSet is "+s);
		Set s1=new HashSet();
		s1.add(120);
		s1.add(30);
		s1.add(true);
		s1.add(67);
		s1.add("Hi");
		System.out.println("HashSet 1 "+s1);
		
		System.out.println(s.removeAll(s1)); //SET DIFFERENCE (S-S1)
		System.out.println("HashSet "+s);
		s.clear();
		List a=new LinkedList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(true);
		a.add(12.67);
		a.add("Hello");
		a.add(10);
		System.out.println("LinkedList is "+a);
		s.addAll(a);
		System.out.println("HashSet "+s);
		System.out.println("HashSet 1 "+s1);
		
		System.out.println(s.retainAll(s1)); //SET INTERSECTION
		System.out.println("HashSet "+s);
	
		s.clear();
		s.addAll(a);
		System.out.println("HashSet "+s);
		System.out.println("HashSet 1 "+s1);
		System.out.println(s.addAll(s1)); //SET UNION
		System.out.println("HashSet "+s);
	
	}

}
