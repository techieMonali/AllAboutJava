package collection;

import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class mapInterface {
	
	static void HashMap() {
		System.out.println("********************************HashMap*******************************");
		HashMap<Integer,Character> sbhm = new HashMap<>();
		sbhm.put(5, 'Z');
		sbhm.put(2, 'C');
		
		HashMap<Integer,Character> hm = new HashMap<>();
		hm.putAll(sbhm);
		hm.put(0, 'A');
		hm.put(1, 'B');
		hm.put(6, null);
		hm.put(null, null);
		//hm.put(null, null);
		hm.putIfAbsent(1, null);		
		
		System.out.println("HashMap contains key '5' : "+hm.containsKey(5));
		System.out.println("HashMap contains key 'C' : "+hm.containsValue('C'));
		System.out.println("Hashmap before : "+hm.entrySet());
		System.out.println("With compute functions trying to update values");
		hm.compute(6 , (key,val) -> 'H');
		hm.computeIfAbsent(null, val -> 'I');
		hm.computeIfAbsent(3, val -> 'G');
		hm.computeIfPresent(2, (key, val) -> val.toUpperCase('C'));
		System.out.println("Hashmap after : "+hm.entrySet());
		System.out.println("value of key 6 : "+hm.get(6));
		System.out.println("Hashcode of hashmap : "+hm.hashCode());
		System.out.println("Size of HashMap : "+hm.size());
		System.out.println("HashMap keys : "+hm.keySet());
		System.out.println("HashMap values : "+hm.values());
		
		//return count of each
		String str[]= {"JAVA", ".net", "JAVA", "Python", ".net"};
		HashMap<String,Integer> hashMp = new HashMap<>();
		for(int i=0;i<str.length;i++) {
			int strngCnt = 1; 
			if (hashMp.containsKey(str[i]) == false) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i] == str[j]) {
						strngCnt++;
					}
				}
				hashMp.put(str[i], strngCnt);
			}
		}
		System.out.println(hashMp);
		
		HashMap<Character,Character> hm1 = new HashMap<>();
		hm1.put('Z', 'B');
		hm1.put('C', 'D');
		hm1.put('B', 'A');
		hm1.put('D', 'C');
		
		System.out.println(hm1);
	}
	static void linkedHashMap() {
		System.out.println("************************************LinkedHashMap**********************************");
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(2, "Akash");
		lhm.put(1, "Raunak");
		lhm.put(0, "Gabriel");
		lhm.replace(0, "rosy");		
		//lhm.replace(0, "roy", "ABC"); //will fail as old value does not match
		lhm.replace(0, "rosy", "ABC");
		
		System.out.println("LinkedHashMap before : "+lhm);
		lhm.replaceAll((key, value)->"ABC");
		System.out.println("LinkedHashMap has key 9 or not? if not return XYZ : "+lhm.getOrDefault(9, "XYZ"));
		System.out.println("LinkedHashMap has key 2 or not? if not return space : "+lhm.getOrDefault(2,""));
		System.out.println("LinkedHashMap after : "+lhm);
	}
	
	static void treeMap() {
		System.out.println("************************************TreeMap**********************************");
		LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
		lhm.put(3, 'A');
		lhm.put(4, null);
		
		TreeMap<Integer,Character> thm = new TreeMap<>();
		thm.put(0, 'A');
		thm.put(-1, null);
		thm.put(1, null);
		thm.putIfAbsent(2, 'B');
		thm.putAll(lhm);
		//thm.put(null, null); //not possible
		System.out.println("Map : "+thm);
		System.out.println("Least key-value entry than -2 if present : "+thm.ceilingEntry(-2));
		System.out.println("Least key-value entry than 5 if present : "+thm.floorEntry(5));
		System.out.println("Least key than -2 if present : "+thm.ceilingKey(-2));
		System.out.println("Least key of map less than 5 : "+thm.floorKey(5));
		System.out.println("Key set in descending order : "+thm.descendingKeySet());
		System.out.println("Map in descending order : "+thm.descendingMap());
		Set<Entry<Integer, Character>> st = thm.entrySet() ;
		System.out.println("Map to Set : "+st);
		System.out.println("First entry of map : "+thm.firstEntry());
		System.out.println("Last entry of map : "+thm.lastEntry());
		System.out.println("First key of map : "+thm.firstKey());
		System.out.println("Last key of map : "+thm.lastKey());
		System.out.println("Map entries which are less than key 2 : "+thm.headMap(2));
		System.out.println("Map entries which are less than key 2 also include entry of 2 : "+thm.headMap(2, true));
		System.out.println("Higher entry of map : "+thm.higherEntry(3));
		System.out.println("Higher key of map : "+thm.higherKey(3));
		System.out.println("Lower entry of map : "+thm.lowerEntry(0));
		System.out.println("Lower key of map : "+thm.lowerKey(0));
		System.out.println(thm.tailMap(1));
		System.out.println("TreeMap values : "+thm.values());
		System.out.println("TreeMap keys : "+thm.keySet());
		System.out.println("SubMap entries : "+thm.subMap(1, 3));
		System.out.println("Navigable Key Set : "+thm.navigableKeySet());
		thm.pollFirstEntry();
		System.out.println("After removing first entry : "+thm);
		thm.pollLastEntry();
		System.out.println("After removing last entry : "+thm);
		
		Hashtable<Integer,Character> ht = new Hashtable<>();
	}
	
	static void hshTbl() {
		System.out.println("************************************HashTable**********************************");
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(3, "Ben");
		lhm.put(4, "Cain");
	
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		//ht.put(0, null); //not allowed
		ht.put(0, "Aby");
		ht.put(2, "Aby");
		ht.putAll(lhm);
		System.out.println(ht);
	}
	
	static void cncrntHshmp() {
		System.out.println("************************************ConcurrentHashMap**********************************");
		ConcurrentHashMap<Integer,String> cHm = new ConcurrentHashMap<>();
		cHm.put(3, "Ben");
		cHm.put(4, "Cain");
		//cHm.put(null, "as");
		System.out.println(cHm);
		
	}

	public enum Days {
		Monday, Tuesday, Wednesday, Thursday
	};

	static void enm() {
		System.out.println("************************************EnumMap**********************************");
		EnumMap<Days,Integer> enm = new EnumMap<Days,Integer>(Days.class);

	}
	public static void main(String[] args) {
		HashMap();
		linkedHashMap();
		treeMap();
		hshTbl();
		cncrntHshmp();
	}

}
