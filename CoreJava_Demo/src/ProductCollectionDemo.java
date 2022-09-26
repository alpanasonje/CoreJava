import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ProductCollectionDemo {

	public static void main(String[] args) {
		List<Product> list1=new ArrayList<Product>();
		list1.add(new Product("NoteBook",600,10,101));
		list1.add(new Product("Pen",400,7,106));
		list1.add(new Product("Book",950,12,103));
		list1.add(new Product("Diary",800,15,102));
		Iterator<Product> i1=list1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println("Sorting of Products....");
		System.out.println("Enter on which order you want to sort...");
		System.out.println("1. Product Name ");
		System.out.println("2. Product Price ");
		System.out.println("3. Product Id ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			Collections.sort(list1,new SortByProductName());
			break;
		case 2:
			Collections.sort(list1,new SortByProductPrice());
			break;
		case 3:
			Collections.sort(list1,new SortByProductId());
			break;
		}
		i1=list1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	}

}
