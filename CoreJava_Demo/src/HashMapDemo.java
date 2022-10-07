//implementing HashMap - Key Value Pair
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Double> hm=new HashMap<String, Double>();
		System.out.println("HashMap : "+hm);
		hm.put("Amit", null);
		hm.put("Pooja", null);
		hm.put("Neha", 72.75);
		hm.put("Prajakta", 78.40);
		hm.put("Amol", 69.75);
		hm.put("Dhruv", 82.40);
		hm.put("Manoj", 65.75);
		hm.put("Dhruv", 89.40);
		hm.put(null, 69.75);
		hm.put(null, 82.40);
		hm.put(null, null);
		System.out.println("HashMap : "+hm);
		Set set =hm.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			Entry me=(Entry)i1.next();
			System.out.println(me.getKey()+ " : "+me.getValue());
		}		
	}
	
	
	

	
	
	
	
	
	
	
	

}
