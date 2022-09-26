import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmpCollectionDemo {

	public static void main(String[] args) {
		List<Emp> emp =new ArrayList<Emp>();
		emp.add(new Emp(101,"Amit",56000));
		emp.add(new Emp(105,"Pooja",51000));
		emp.add(new Emp(102,"Sumit",46000));
		emp.add(new Emp(106,"Neha",87200));
		emp.add(new Emp(103,"Pratiksha",61000));
		emp.add(new Emp(104,"Amol",43000));
		Iterator i1=emp.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println("After Sorting...............");
		Collections.sort(emp);
		i1=emp.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	}

}
