package lesson4;

public class SwitchEnum {
	enum Choice { Choice1, Choice2, Choice3 }
	  public static void main(String[] args) {
	    Choice ch = Choice.Choice2;

	    switch(ch) {
	      case Choice1:
	        System.out.println("Choice1 selected");
	        break;
	     case Choice2:
	       System.out.println("Choice2 selected");
	       break;
	     case Choice3:
	       System.out.println("Choice3 selected");
	       break;
	    }
	    
	   
	  }

}
