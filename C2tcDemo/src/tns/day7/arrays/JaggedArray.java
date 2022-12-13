package tns.day7.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		//Jagged Array
		String student[][]= {
				{"Amit","C++"},
				{"Amol","C","C++","Python"},
				{"Nisha","Java","Python"},
				{"Nidhi","JFS"}};
		
				
		for(String[] s : student)
		{
			for(String ss:s)
				System.out.print(ss+"\t");
			System.out.println();
		}

	}

}
