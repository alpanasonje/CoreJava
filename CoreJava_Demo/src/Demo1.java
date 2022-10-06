import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo1 {

	public static void main(String[] args)
	{
		Set<String> set=ConcurrentHashMap.newKeySet();
		 ConcurrentHashMap<String, Integer>  mymap = new ConcurrentHashMap<String,  Integer>();   
		// HashMap<String, Integer> mapcon     = new HashMap<>();     
	        mymap.put("AAA", 10);   
	        mymap.put("BBB", 15);   
	        mymap.put("CCC", 25);   
	        mymap.put("DDD", 255);   
	        mymap.put("EEE",30);   
	        System.out.println(" Mappings are: " +mymap);   
	  
	        System.out.println("is 25  present? ::  "  
	                           + mymap.containsValue(255));   
	
	}
}
