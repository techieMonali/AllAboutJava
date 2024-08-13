package collection;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapInterface {
	
	static void HashMap() {
		HashMap<Integer,Character> sbhm = new HashMap<>();
		sbhm.put(5, 'Z');
		sbhm.put(2, 'C');
		
		HashMap<Integer,Character> hm = new HashMap<>();
		hm.putAll(sbhm);
		hm.put(0, 'A');
		hm.put(1, 'B');
		System.out.println("HashMap contains key '5' : "+hm.containsKey(5));
		
		for(int key:hm.keySet()) {
			System.out.println("Key : "+key+" and Value : "+hm.get(key));
		}
		
		LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
		TreeMap<Integer,Character> thm = new TreeMap<>();
		Hashtable<Integer,Character> ht = new Hashtable<>();
	}

	public static void main(String[] args) {
		HashMap();
	}

}
