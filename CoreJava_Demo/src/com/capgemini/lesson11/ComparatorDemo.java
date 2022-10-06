package com.capgemini.lesson11;

import java.util.*;

class Emp implements Comparable {
	int EmpID;
	String Ename;
	double Sal;
	static int i;

	public Emp() {
		EmpID = i++;
		Ename = "Unknown";
		Sal = 0.0;
	}

	public Emp(String ename, double sal) {
		EmpID = i++;
		Ename = ename;
		Sal = sal;
	}

	public String toString() {
		return "EmpID : " + EmpID + "\t" + "Ename : " + Ename + "\t" + "Sal : "
				+ Sal;
	}

	public int compareTo(Object o) {
		if (this.Sal == ((Emp) o).Sal)
			return 0;
		else if (this.Sal > ((Emp) o).Sal)
			return 1;
		else
			return -1;
	}
}

class ComparatorDemo {
	public static void main(String[] args) {
		Emp e1 = new Emp("harry", 40000.00);
		Set<Emp> ts1 = new TreeSet<Emp>();
		ts1.add(new Emp("harry", 40000.00));
		ts1.add(new Emp("Mary", 20000.00));
		ts1.add(new Emp("Peter", 50000.00));
		// ts1.add(new Employee("richard",70000.00));

		Iterator itr = ts1.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element + "\n");
		}
		System.out.println();

	}
}
