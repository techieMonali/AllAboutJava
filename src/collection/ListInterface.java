package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	int num;
	String str;
	
	ListInterface(int no,String msg){
		this.num = no;
		this.str = msg;
	}
	
	/**************************ArrayList**************************/
	static void arraylist(ListInterface obj1, ListInterface obj2) {
		ArrayList<String> arrList = new ArrayList<>();
		//adding other list to check collection related methods
		LinkedList<String> lnkdList = new LinkedList<>();
		lnkdList.add("Charlie");
		lnkdList.add("Chase");
		
		System.out.println("------------ArrayList------------");
		//adding elements
		arrList.add("Ariel");
		arrList.add(0, "Aarya");
		arrList.addAll(lnkdList); //linkedlist will get add at the end
		arrList.addAll(0, lnkdList);//linkedlist will get add at index 0 i.e. at beginning
		System.out.println("Is 'Charlie' String present in ArrayList ? "+arrList.contains("Charlie"));
		Iterator itr = arrList.listIterator();
		System.out.print("Arraylist after adding all elements : ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		ArrayList<String> clnArLst = (ArrayList<String>) arrList.clone(); //a clone of arraylist instance
		System.out.println("'clnArLst' ArrayList is clone of ArrayList 'arrList' : "+clnArLst);
		arrList.clear();
		System.out.println("Size of Arraylist : "+clnArLst.size());
		System.out.println("Arraylist after clearning : "+arrList);
		
		//creating object list
		ArrayList<Object> objArrList = new ArrayList<>();
		objArrList.add(obj1);
		objArrList.add(obj2);
		System.out.println("Checking if object list contains obj1 or not : "+objArrList.contains(obj1));
		
		System.out.println("Using ListIterator for Objects");
		Iterator arrItr = objArrList.listIterator();
		while(arrItr.hasNext()) {
			ListInterface obj = (ListInterface)arrItr.next();
			System.out.println(obj.num+" "+obj.str);
		}
	}
	
	/**************************LinkedList**************************/
	static void linkedList(ListInterface obj1, ListInterface obj2, ListInterface obj3) {
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(1);
		arrLst.add(2);
		
		LinkedList<Integer> lnkLst = new LinkedList<>();
		
		System.out.println("------------LinkedList------------");
		lnkLst.add(10);
		lnkLst.add(0,0);
		lnkLst.addAll(arrLst);
		lnkLst.addAll(0, lnkLst);
		lnkLst.addFirst(-1);
		lnkLst.addLast(100);
		
		System.out.println("LinkedList elements are : "+lnkLst);
		LinkedList<Integer> clnLnkLst = (LinkedList<Integer>) lnkLst.clone();
		System.out.println("Cloned LinkedList elements are : "+clnLnkLst);
		lnkLst.clear();
		System.out.println("Linkedlist after clearning : "+lnkLst);
		System.out.println("Size of LinkedList : "+clnLnkLst.size());
		clnLnkLst.removeAll(arrLst);
		System.out.println("After removing collection elements are : "+clnLnkLst);
		
		
		/**********
		 * Sort student with age in easiest way
		 */
		LinkedList<ListInterface> objlnkLst = new LinkedList<>();
		objlnkLst.add(obj1);
		objlnkLst.add(obj2);
		objlnkLst.add(obj3);
		
		int arrAge[]= new int[objlnkLst.size()];
		for(int i=0;i<objlnkLst.size();i++) {
			arrAge[i]=objlnkLst.get(i).num;
		}
		Arrays.sort(arrAge);
		for(int no:arrAge) {
			System.out.println(no);
		}

		int cnt=0;
		for(int i=0;i<arrAge.length;i++) {
			if(arrAge[i]!=objlnkLst.get(i).num) {
				int exVal = arrAge[i];
				cnt++;
				for(int j=0;j<arrAge.length;j++) {
					if(objlnkLst.get(j).num==exVal) {
						ListInterface obj = objlnkLst.get(i);
						objlnkLst.add(i,objlnkLst.get(j));
					}
				}
			}
		}
		for(int i=0;i<cnt;i++) {
			objlnkLst.removeLast();
		}
			
		System.out.println(objlnkLst.size());
		Iterator lnklstItr = objlnkLst.iterator();
		while(lnklstItr.hasNext()) {
			ListInterface obj = (ListInterface) lnklstItr.next();
			System.out.println(obj.num+" "+obj.str);
		}
	}
	
	
	
	//arrayList, LinkedList, Vector, Stack
	static void AllListClasses() {
		LinkedList<Integer> lList = new LinkedList<>();
		Vector<String> vList = new Vector<>();
		Stack<Character> sList = new Stack<>();
		
		//adding element with add(element)
		lList.add(1);
		vList.add("LINDA");
		
		sList.add('A');
		sList.push('B');
		
		//adding element with add(index,element)
		
		lList.add(0,0);
		vList.add(0,"SHELLY");
		sList.add(0,'a');
		Object[] arr = lList.toArray();
		System.out.println(arr.length);
		System.out.println(sList.isEmpty());
		
		
		System.out.println("");
		System.out.println("LinkedList : ");
		for(int i:lList) {
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Vector : ");
		for(String str:vList) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("Stack : ");
		Iterator itr = sList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
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
		ListInterface obj1 = new ListInterface(15,"hello");
		ListInterface obj2 = new ListInterface(14,"hello world");
		ListInterface obj3 = new ListInterface(13,"hello universe");
		
		arraylist(obj1, obj2);
		linkedList(obj1, obj2, obj3);
		//AllListClasses();
		
		/*
		ListInterface obj3 = new ListInterface(92,"hey");
		
		objectList(obj1,obj2,obj3);
		
		/*
		 * Accept student details and sort them by their age
		 *
		
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
		*/
	}

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
}
