package tns.day13.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//ordered set
		LinkedHashSet<String> courseSet =new LinkedHashSet<String>();
		courseSet.add("Core Java");
		courseSet.add("HTML");
		courseSet.add("React");
		courseSet.add("J2EE");
		courseSet.add("JFS");
		courseSet.add("Angular");
		courseSet.add("Hibernate");
		System.out.println("Course Set is "+courseSet);

	//	Collections.sort(courseSet); CTE

		ArrayList<String> list=new ArrayList(courseSet);
		Collections.sort(list);
		System.out.println(list);
	}

}
