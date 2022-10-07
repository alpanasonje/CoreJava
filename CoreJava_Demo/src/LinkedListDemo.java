//Implement LinkedList Class
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList(); // Empty List - Heterogeneous
		l1.add(10);
		l1.add(true);
		l1.add("java");
		l1.add(true);
		l1.add(55);
		l1.add("Hello");
		l1.add(false);
		l1.add(123.676);
		l1.add(new Date(12 / 04 / 22).toString());
		System.out.println("List l1 is " + l1);
		l1.add(2, "Fullstack");
		System.out.println("List l1 is " + l1);
		System.out.println("First element " + l1.getFirst() + " Last element" + l1.getLast());
		l1.addFirst(555);
		l1.addLast(999);
		System.out.println("List l1 is " + l1);
		System.out.println(l1.remove() + " removed");// removed first
		System.out.println(l1.remove(3) + " removed"); // removed element at index 3
		// System.out.println(l1.remove(547));
		System.out.println(l1.remove("java"));
		System.out.println(l1.remove("C++"));
		System.out.println(l1.removeFirst() + " removed");
		System.out.println(l1.removeLast() + " Removed ");
		System.out.println(l1.removeFirstOccurrence("java") + " removed");
		System.out.println(l1.removeLastOccurrence(true) + " removed ");

		LinkedList l2 = new LinkedList();
		l2.add(true);
		l2.add("java");
		l1.removeAll(l2);
		System.out.println("l2 " + l2);
		System.out.println("l1 " + l1);
		System.out.println("--------------------------------------");
		Iterator i1 = l1.iterator();// list interface
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("--------------------------------------");
		ListIterator li1 = l1.listIterator();// list interface
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}
		System.out.println("--------------------------------------");
		li1 = l1.listIterator(l1.size());// list interface
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		System.out.println("--------------------------------------");
		li1 = l1.listIterator(3);// list interface
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		System.out.println("--------------------------------------");

		li1 = l1.listIterator(3);// list interface
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}
		System.out.println("--------------------------------------");

		i1 = l1.descendingIterator();
		while (i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		System.out.println("--------------------------------------");
		l1.clear();
		System.out.println("l1 " + l1);

	}

}
