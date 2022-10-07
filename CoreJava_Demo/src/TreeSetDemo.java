import java.util.Comparator;
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
		System.out.println("Contents of treeset " + treeSet);

		// adding userdefined objects
		Comparator<Person> nameComparator = (p1, p2)->p1.getName().compareTo(p2.getName());
		
		TreeSet treeSet1 = new TreeSet(nameComparator);
		treeSet1.add(new Person("Mitali", "Pune"));
		treeSet1.add(new Person("Mona", "Delhi"));
		treeSet1.add(new Person("Madhur", "Noida"));
		treeSet1.add(new Person("Shilpa", "Amritsar"));
		treeSet1.add(new Person("Nidhi", "Mumbai"));
		treeSet1.forEach(p->System.out.println(p));
		
		
	}
}
