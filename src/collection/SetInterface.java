package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetInterface {
	int num;
	String name;
	
	SetInterface(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	
	static void hashSet(SetInterface obj1, SetInterface obj2) {
		System.out.println("*********************HashSet*********************");
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(40);
		arrLst.add(50);
		
		HashSet<Integer> hS = new HashSet<>();
		
		hS.add(10);
		hS.add(20);
		hS.add(30);
		hS.add(30);//this value will not get add as it is duplicate value
		hS.add(0);
		hS.add(null);
		hS.addAll(arrLst);
		System.out.println("HashSet contains 'null' or not : "+hS.contains(null));
		System.out.println("HashSet contains Collection or not : "+hS.containsAll(arrLst));
		
		System.out.println("Set values before");
		hS.forEach(System.out::println);//one more way to interate 
		System.out.println("HashCode value : "+hS.hashCode());
		hS.remove(10);// removing value '10'
		
		System.out.println("After removing value 10 ");
		Iterator itr = hS.iterator();
		while(itr.hasNext()) {
			System.out.println("Element : "+itr.next());
		}
		
		HashSet<SetInterface> objLst = new HashSet<>();
		objLst.add(obj1);
		objLst.add(obj2);
		
		System.out.println("HashSet of Objects");
		Iterator objItr = objLst.iterator();
		while(objItr.hasNext()) {
			SetInterface obj = (SetInterface) objItr.next();
			System.out.println(obj.num+":"+obj.name);
		}
	}

	static void linkedHashSet(SetInterface obj1, SetInterface obj2) {
		System.out.println("*********************LinkedHashSet*********************");
		HashSet<String> hS = new HashSet<>();
		hS.add("Sam");
		hS.add("Gina");
		
		LinkedHashSet<String> lHs = new LinkedHashSet<>();
		lHs.add(null);
		lHs.add(null);//duplicate element hence will not get added
		lHs.add("");
		lHs.add("Alice");
		lHs.add("Benny");
		lHs.addAll(hS);
		
		System.out.println("LinkedHashSet of elements");
		Iterator itr = lHs.iterator();
		while(itr.hasNext()) {
			System.out.println("Element : "+itr.next());
		}
		
		LinkedHashSet<SetInterface> objLst = new LinkedHashSet<>();
		objLst.add(obj1);
		objLst.add(obj2);
		
		System.out.println("LinkedHashSet of Objects");
		Iterator objItr = objLst.iterator();
		while(objItr.hasNext()) {
			SetInterface obj = (SetInterface) objItr.next();
			System.out.println(obj.num+":"+obj.name);
		}
	}
	
	public static void treeSet() {
		System.out.println("*********************treeSet*********************");
		HashSet<Character> hS = new HashSet();
		hS.add('A');
		hS.add('D');
		
		TreeSet<Character> tS = new TreeSet();
		tS.add('A');
		tS.add('A');//duplicates are not allowed
		//tS.add(null); //null not allowed returns NullPointerException
		tS.add('C');
		tS.add('B');
		tS.addAll(hS);
		
		Iterator itr = tS.iterator();
		while(itr.hasNext()) {
			System.out.println("Element : "+itr.next());
		}
		
		System.out.println("TreeSet contains HashSet : "+tS.containsAll(hS));
		tS.remove('B');
		System.out.println("Checking if TreeSet contains character 'B' near to top or not using ceiling() : "+tS.ceiling('B'));
		System.out.println("Checking if TreeSet contains character 'E' near to end or not using floor() : "+tS.floor('E'));
		System.out.println("Checking if TreeSet contains character below 'D' or not using higher() : "+tS.higher('D'));
		System.out.println("Checking if TreeSet contains character below 'B' or not using lower() : "+tS.lower('B'));
		System.out.println("Last Element of set : "+tS.last());
		NavigableSet<Character> dSItr = tS.descendingSet();
		System.out.println("Set in reverse order using 'descendingSet()' : "+dSItr);
		System.out.println("Set in reverse order using 'descendingIterator()' :");
		Iterator dItr = tS.descendingIterator();
		while(dItr.hasNext()) {
			System.out.println("Element : "+dItr.next());
		}
		System.out.println("Elements less than 'D' :"+tS.headSet('D'));
		System.out.println("Elements greater than 'B' :"+tS.tailSet('A'));
		System.out.println("First element of set : "+tS.first());
		System.out.println("Subset : "+tS.subSet('A', 'D'));
	}
	
	public static void main(String[] args) {
		SetInterface obj1 = new SetInterface(12,"Rahul");
		SetInterface obj2 = new SetInterface(11,"Sanjay");
		
		hashSet(obj1,obj2);
		linkedHashSet(obj1,obj2);
		treeSet();
	}

}
