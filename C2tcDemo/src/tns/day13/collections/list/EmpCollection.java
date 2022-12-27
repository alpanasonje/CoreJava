package tns.day13.collections.list;

//Program to demonstrate Collection with user defined objects
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e=new Employee(101,"Pankaj",67000);
		empList.add(e);
		
		e=new Employee(112,"Deepali",71000);
		empList.add(e);
		
		e=new Employee(100,"Neeraj",65000);
		empList.add(e);
		
		System.out.println("Employee Details are as follows\n");
		System.out.println(empList);
		
		//Collections.sort(empList); //CTE
	//	112 100 101
	
	//Lambda Expression
	  Comparator<Employee> comp=(e2,e1) -> e1.getEmpName().compareTo(e2.getEmpName());
	  Collections.sort(empList, comp);
	  
	  System.out.println("Employee Details in descending order of name are as follows\n");
	  System.out.println(empList);
	  
	  Comparator<Employee> comp1=(e2,e1) -> (int)(e1.getSalary()-e2.getSalary());
	  Collections.sort(empList, comp1);
	  
	  System.out.println("Employee Details in descending order of salary are as follows\n");
	  System.out.println(empList);
	 
	 
	}

}
