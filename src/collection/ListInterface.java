package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class student implements Comparable<student>{
	String name;
	int age;
	
	student(String name, int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class ListInterface {
	int num;
	String str;
	
	ListInterface(int no,String msg){
		this.num = no;
		this.str = msg;
	}
	
	//arrayList
	static void arrayList() {
		List<Integer> intList = new ArrayList();
		intList.add(12);
		intList.add(1);
		intList.add(56);
		intList.add(2, 34);
		//intList.clear(); //clears whole list
		System.out.println(intList.contains(2));
		System.out.println(intList.indexOf(12));
		System.out.println(intList.isEmpty());
		System.out.println(intList.lastIndexOf(56));
		
		//sorting
		//intList.sort(null);//sorts list
		Collections.sort(intList);
		
		Iterator lstItr = intList.iterator();
		System.out.println("Using Iterator:");
		while(lstItr.hasNext()) {
			System.out.println(lstItr.next());
		}
		intList.set(3, 67);
		intList.remove(0);
		
		System.out.println("Using for-each loop after removing element:");
		for(int num:intList) {
			System.out.println(num);
		}
	
		Object[] arr = intList.toArray();
		System.out.println("After coverting into array:");
		for(Object obj:arr) {
			System.out.println(obj);
		}		
	}

	static void objectList(ListInterface obj1, ListInterface obj2, ListInterface obj3) {
		ArrayList<ListInterface> objList = new ArrayList<ListInterface>();
		objList.add(obj1);
		objList.add(obj2);
		objList.add(obj3);
		
		Iterator lstItr = objList.iterator();
		System.out.println("Using Iterator:");
		while(lstItr.hasNext()) {
			ListInterface obj = (ListInterface)lstItr.next();
			System.out.println(obj.num+" "+obj.str);
		}
	}
	
	
	public static void main(String[] args) {
		arrayList();
		ListInterface obj1 = new ListInterface(23,"hello");
		ListInterface obj2 = new ListInterface(46,"hello world");
		ListInterface obj3 = new ListInterface(92,"hey");
		
		objectList(obj1,obj2,obj3);
		
		/*
		 * Accept student details and sort them by their age
		 */
		
		ArrayList<student> studLst = new ArrayList<>();
		studLst.add(new student("Ajay", 14));
		studLst.add(new student("Vijay", 13));
		studLst.add(new student("Sanjay", 15));
		
		System.out.println("*****List before*****");
		for (student st : studLst) {
			System.out.println(st.name + " " + st.age);
		}  
		System.out.println("*****List after*****");
		Collections.sort(studLst);
		for (student st : studLst) {
			System.out.println(st.name + " " + st.age);
		}  
	}

}
