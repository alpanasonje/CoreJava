package tns.day7.arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		char[][] ch=new char[][] {{'A','B','C','D','E'},{'a','b','c','d','e'}};
		
		System.out.println("No. of Rows : "+ch.length);
		
		//Index based loop
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
				System.out.print(ch[i][j]+ ", ");
			System.out.println();
		}
		
		//for each loop
		for(char[] c:ch)
		{
			for(char cc:c)
				System.out.print(cc+" ");
			System.out.println();
		}
			
	}

}
