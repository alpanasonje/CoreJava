package lesson3;

class CharDemo {
	public static void main(String args[]) {
		//declaration and initialization of character array of size 10
		char a[] = {'a', 'b', '5', '?', 'A', ' ','\t','2','Z','%'}; 
//		datatype name[]=new datatype[size]
		System.out.println("Size : "+a.length);
		a[4]='T';
		for(int i=0; i<a.length; i++) 
		{
			if(Character.isDigit(a[i])) 
				System.out.println(a[i] + " is a digit.");
  			if(Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is whitespace.");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is uppercase.");
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is lowercase.");
			if (!Character.isLetterOrDigit(a[i]) && !Character.isWhitespace(a[i]))
				System.out.println(a[i]+" is a specical symbol");
					
				
			
		}
	}
}