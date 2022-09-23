

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	//	Collection ->List ->ArrayList, LinkedList, Vector
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("ArrayList is : "+a1);
		System.out.println("size of ArrayList is : "+a1.size());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println("ArrayList is : "+a1);
		System.out.println("size of ArrayList is : "+a1.size());
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			int i=(int)i1.next();
			System.out.println(i+" "+i*i);
		}
		a1.add(new Integer(30));
		a1.add(new Integer(40));
		System.out.println("ArrayList is : "+a1);
		System.out.println("size of ArrayList is : "+a1.size());
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Java");
		a2.add("Hibernate");
		a2.add("Spring boot");
		a2.add("React");
		System.out.println("ArrayList is : "+a2);
		System.out.println("size of ArrayList is : "+a2.size());
		Iterator i2=a2.iterator();
		while(i2.hasNext())
		{
			String str=i2.next().toString();
			System.out.println("Length of "+str+" is "+str.length());
		}
		Product p=new Product("T-Shirt",12,120,101);
		//a1.add(p);
		//a1.addAll(a2);
		System.out.println("ArrayList is : "+a1);
		System.out.println("ArrayList is : "+a2);
		
		//Generic
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Angular");
		a3.add("css");
		System.out.println("ArrayList "+a3);
	//	a3.add(new Integer(10));
		//a3.add(p);
		a3.addAll(a2);
		System.out.println(a3);
		System.out.println("a3 contains a2 : "+a3.containsAll(a2));
		a2.remove("React");
		System.out.println("a2 is "+a2);
		System.out.println(a3.containsAll(a2));
		a3.removeAll(a2);
		System.out.println(a3);
		a3.clear();
		System.out.println("ArrayList is : "+a3);
		System.out.println("size of ArrayList is : "+a3.size());
		System.out.println("ArrayList is : "+a2);
		System.out.println("size of ArrayList is : "+a2.size());
		i2=a2.iterator();
		while(i2.hasNext())
		{
			String str=i2.next().toString();
			if(str.equals("Spring boot"))
				i2.remove();
		}	
		System.out.println("ArrayList is : "+a2);
		System.out.println("size of ArrayList is : "+a2.size());
		System.out.println("a1 : "+a1);
		System.out.println(a1.remove(a1.size()-1)+" element removed ");
		System.out.println("a1 : "+a1);
		System.out.println(a1.remove(new Integer(35)));
		System.out.println("a1 : "+a1);
		Object obj[]=a1.toArray();
		for(Object o:obj)
			System.out.println(o);
		ArrayList aa=new ArrayList();//empty list
		System.out.println("aa "+aa+" Size "+aa.size());
		aa=new ArrayList(a1); //list with all elements of a1
		System.out.println("aa "+aa+" Size "+aa.size());
		System.out.println("Element at index 4 is "+aa.get(4));
		aa=new ArrayList(20); //dynamic capacity is 20 but it can be increased automatically when elements gets added 
		int a[]=new int[5]; // size is fixed(5) static 
		System.out.println("aa "+aa+" Size "+aa.size());
		System.out.println(aa.get(123));
		/*returns element at given index - get(index) 
		returns boolean to check whether element is present or not - contains(element)*/
	}

}
