import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		treeSet.add("true");
		treeSet.add("false");
		System.out.println("Contents of treeset");
		Iterator iterator = treeSet.iterator(); // obtaining iterator object
		while (iterator.hasNext()) { // to iterate thru collection.
		Object object = iterator.next();
		System.out.print(object + "\t");
	}
	}
}
