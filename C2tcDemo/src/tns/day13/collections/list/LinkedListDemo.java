package tns.day13.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();

		nameList.add("Pooja");
		nameList.add("Ankita");
		nameList.add("Samruddhi");
		nameList.add("Sakshi");
		nameList.add(2, "Lisha");
		nameList.add("Nikita");
		nameList.add("Neha");
		nameList.add("Pooja");
		nameList.add("Neha");
		nameList.add("Samruddhi");
		System.out.println("Name list is as follows\n" + nameList);

		nameList.addFirst("Nidhi");
		nameList.addLast("Trupti");

		System.out.println("Name list is as follows\n" + nameList);
		nameList.add("Sonali");

		System.out.println("Name list is as follows\n" + nameList);

		System.out.println("First Element " + nameList.getFirst());
		System.out.println("Last Element " + nameList.getLast());

		nameList.removeFirst();
		nameList.removeLast();
		System.out.println("Name list after removing first and last element is as follows\n" + nameList);

		Collections.sort(nameList);
		System.out.println("Name list after sorting is as follows\n" + nameList);

		Collections.reverse(nameList);
		System.out.println("reverse Name list is as follows\n" + nameList);

		// Traversing a list in forward manner
		ListIterator<String> li = nameList.listIterator();

		while (li.hasNext())
			System.out.println(li.next());

		System.out.println("---------------------------------------------");
		// Traversing a list in backward manner
		li = nameList.listIterator(nameList.size());
		while (li.hasPrevious()) {
			String name = li.previous();
			if (name.equals("Trupti"))
				li.add("Pragati"); //insert
			if (name.equals("Neha"))
				li.set("Sneha"); //update
			if(name.equals("Nikita"))
				li.remove(); //delete
		}

		System.out.println("Name list is as follows\n" + nameList);
		
		
	}

}
