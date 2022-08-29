package lesson3.iteration;

public class LabelledBreak {

	public static void main(String[] args) {
	int len = 10;
    int key = 5;
    int k = 0;
    out: {
      for (int i = 0; i < len; i++) 
      {
    	  in:{
        for (int j = 0; j < len; j++) 
        {
          if (i == key) {
            break in;
          }
          k += 1;
        }}
      }
    }
    System.out.println(k);
  }
}
