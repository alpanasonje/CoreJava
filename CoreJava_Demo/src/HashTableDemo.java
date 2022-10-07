//implementing Hashtable 
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Double> ht = new Hashtable<String, Double>();
		ht.put("Saurav", 78.50);
		ht.put("Abhijit", 71.50);
		ht.put("Pratik", 85.50);
		ht.put("Jessy", 58.50);
		ht.put("Hatim", 68.50);
		ht.put("Sagar", 62.50);
		System.out.println("Hash Table : " + ht);
		Enumeration<String> e1 = ht.keys();
		while (e1.hasMoreElements()) {
			String s = e1.nextElement();
			System.out.println("Key = Value\t" + s + " = " + ht.get(s));
		}
		
		System.out.println("Value of Pratik is "+ht.get("Pratik"));

	}

}
