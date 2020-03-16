package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrac {
	public static void main(String[] args) {
		Map<String,String> employees = new HashMap<>();
		employees.put("name","Myke");
		employees.put("age","16");
		employees.put("location","Juja");
		employees.put("country","Kenya");
		Set<String> keys = employees.keySet();
		
		for(String k:keys) {
			System.out.println(k+ " "+ employees.get(k));
		}
	}
}
