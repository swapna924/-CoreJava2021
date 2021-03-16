package wrapperClasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[]args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Alex",101);
		map.put("Tina",102);
		map.put("Alex",105);
		map.put( "John",103);
		map.put("kim",104);
		map.put("Sam", 106);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys: "+keySet);
		System.out.println();
		
		/*for (String obj : keySet) {
			System.out.println(obj);
		}*/
		
		Collection<Integer> values = map.values();
		System.out.println("Values: "+values);
		System.out.println();
		
		/*for (Integer obj1 : values) {
			System.out.println(obj1);
			
		}*/
		for (String key : keySet) {
			System.out.println("keys: "+key+"\t"+" values: "+map.get(key));
			
		}
		System.out.println();
		System.out.println("keys: "+keySet);
	}
	
		
}