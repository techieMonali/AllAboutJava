package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class student implements Comparable<student> {
	String name;
	int age;

	student(String name, int age) {
		this.name = name;
		this.age = age;
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

	ListInterface(int no, String msg) {
		this.num = no;
		this.str = msg;
	}

	/************************** ArrayList **************************/
	static void arraylist(ListInterface obj1, ListInterface obj2) {
		ArrayList<String> arrList = new ArrayList<>();
		// adding other list to check collection related methods
		LinkedList<String> lnkdList = new LinkedList<>();
		lnkdList.add("Charlie");
		lnkdList.add("Chase");

		System.out.println("------------ArrayList------------");
		// adding elements
		arrList.add("Ariel");
		arrList.add(0, "Aarya");
		arrList.addAll(lnkdList); // linkedlist will get add at the end
		arrList.addAll(0, lnkdList);// linkedlist will get add at index 0 i.e. at beginning
		System.out.println("Is 'Charlie' String present in ArrayList ? " + arrList.contains("Charlie"));
		Iterator itr = arrList.listIterator();
		System.out.print("Arraylist after adding all elements : ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		ArrayList<String> clnArLst = (ArrayList<String>) arrList.clone(); // a clone of arraylist instance
		System.out.println("'clnArLst' ArrayList is clone of ArrayList 'arrList' : " + clnArLst);
		arrList.clear();
		System.out.println("Size of Arraylist : " + clnArLst.size());
		System.out.println("Arraylist after clearning : " + arrList);

		// creating object list
		ArrayList<Object> objArrList = new ArrayList<>();
		objArrList.add(obj1);
		objArrList.add(obj2);
		System.out.println("Checking if object list contains obj1 or not : " + objArrList.contains(obj1));

		System.out.println("Using ListIterator for Objects");
		Iterator arrItr = objArrList.listIterator();
		while (arrItr.hasNext()) {
			ListInterface obj = (ListInterface) arrItr.next();
			System.out.println(obj.num + " " + obj.str);
		}
	}

	/************************** LinkedList **************************/
	static void linkedList(ListInterface obj1, ListInterface obj2, ListInterface obj3) {
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(1);
		arrLst.add(2);

		LinkedList<Integer> lnkLst = new LinkedList<>();

		System.out.println("------------LinkedList------------");
		lnkLst.add(10);
		lnkLst.add(0, 0);
		lnkLst.addAll(arrLst);
		lnkLst.addAll(0, lnkLst);
		lnkLst.addFirst(-1);
		lnkLst.addLast(100);
		Collections.sort(lnkLst);

		System.out.println("LinkedList elements are : " + lnkLst);
		LinkedList<Integer> clnLnkLst = (LinkedList<Integer>) lnkLst.clone();
		System.out.println("Cloned LinkedList elements are : " + clnLnkLst);
		lnkLst.clear();
		System.out.println("Linkedlist after clearning : " + lnkLst);
		System.out.println("Size of LinkedList : " + clnLnkLst.size());
		clnLnkLst.removeAll(arrLst);
		System.out.println("After removing collection elements are : " + clnLnkLst);

		/**********
		 * Sort student with age in easiest way without using sort() method
		 */
		LinkedList<ListInterface> objlnkLst = new LinkedList<>();
		objlnkLst.add(obj1);
		objlnkLst.add(obj2);
		objlnkLst.add(obj3);

		int arrAge[] = new int[objlnkLst.size()];
		for (int i = 0; i < objlnkLst.size(); i++) {
			arrAge[i] = objlnkLst.get(i).num;
		}
		Arrays.sort(arrAge);
		for (int no : arrAge) {
			System.out.println(no);
		}

		int cnt = 0;
		for (int i = 0; i < arrAge.length; i++) {
			if (arrAge[i] != objlnkLst.get(i).num) {
				int exVal = arrAge[i];
				cnt++;
				for (int j = 0; j < arrAge.length; j++) {
					if (objlnkLst.get(j).num == exVal) {
						ListInterface obj = objlnkLst.get(i);
						objlnkLst.add(i, objlnkLst.get(j));
					}
				}
			}
		}
		for (int i = 0; i < cnt; i++) {
			objlnkLst.removeLast();
		}

		System.out.println(objlnkLst.size());
		Iterator lnklstItr = objlnkLst.iterator();
		while (lnklstItr.hasNext()) {
			ListInterface obj = (ListInterface) lnklstItr.next();
			System.out.println(obj.num + " " + obj.str);
		}
	}

	/************************** Vector **************************/
	static void vector(ListInterface obj1, ListInterface obj2) {
		// adding other list to check collection related methods
		ArrayList<Character> arrLst = new ArrayList<>();
		arrLst.add('A');
		arrLst.add('B');

		Vector<Character> vctr = new Vector<>();
		// adding elements in vector issue
		vctr.add('C');
		vctr.addAll(0, arrLst);
		vctr.insertElementAt('Z', 0);
		vctr.set(0, 'X');
		vctr.removeElementAt(3);
		// vctr.sort(null); //this also sorts elements
		Collections.sort(vctr);
		Character[] arr = new Character[vctr.size()];
		vctr.toArray(arr);
		System.out.println("Vector to array is");
		for (char ch : arr) {
			System.out.println(ch);
		}
		System.out.println("Sublist of vector :" + vctr.subList(0, 2));
		System.out.println("Capacity is : " + vctr.capacity());

		System.out.println("--------------Vector--------------");
		Enumeration vctrItr = vctr.elements();
		while (vctrItr.hasMoreElements()) {
			System.out.println(vctrItr.nextElement());
		}
		System.out.println("First Element : " + vctr.firstElement());

		Vector<ListInterface> objLst = new Vector<>();
		objLst.addElement(obj1);
		objLst.addElement(obj2);

		System.out.println("Vector object list");
		for (int i = 0; i < objLst.size(); i++) {
			System.out.println(objLst.get(i).num + " " + objLst.get(i).str);
		}
	}

	/************************** Stack **************************/
	static void stack(String expression) {
		char exprsn[] = expression.toCharArray();
		Stack<Character> stckLst = new Stack<>();
		for (char ch : exprsn) {
			stckLst.push(ch);
		}
		System.out.println("Stack Size is : " + stckLst.size());
		for (char ch : stckLst) {
			System.out.print(ch);
		}

		char lstCh = stckLst.peek();
		char fstCh = stckLst.firstElement();
		if (lstCh == '(' || lstCh == '{' || lstCh == '<' || lstCh == '[') {
			System.out.println(" is a Invalid expression");
		} else if (fstCh == ')' || fstCh == '}' || fstCh == '>' || fstCh == ']') {
			System.out.println(" is a Invalid expression");
		} else {
			int rndCnt = 0;
			int sqrCnt = 0;
			int crlCnt = 0;
			int brktCnt = 0;
			int stkSz = stckLst.size();
			for (int i = 0; i < stkSz; i++) {
				char ch = stckLst.pop();

				switch (ch) {
				case ')':
					rndCnt++;
					break;
				case '(':
					rndCnt--;
					break;
				case ']':
					sqrCnt++;
					break;
				case '[':
					sqrCnt--;
					break;
				case '}':
					crlCnt++;
					break;
				case '{':
					crlCnt--;
					break;
				case '<':
					brktCnt++;
					break;
				case '>':
					brktCnt--;
					break;
				}
			}
			if (rndCnt != 0 || sqrCnt != 0 || crlCnt != 0 || brktCnt != 0) {
				System.out.println(" is a Invalid expression");
			} else {
				System.out.println(" is a Valid expression");
			}
		}
	}

	public static void main(String[] args) {
		ListInterface obj1 = new ListInterface(15, "hello");
		ListInterface obj2 = new ListInterface(70, "hello world");
		ListInterface obj3 = new ListInterface(13, "hello universe");

		arraylist(obj1, obj2);
		linkedList(obj1, obj2, obj3);
		vector(obj1, obj2);
		/*
		 * Write program to check if expression is valid or not
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression to check it is valid or not : ");
		stack(sc.nextLine());

		/*
		 * Accept student details and sort them by their age using collection's sort
		 * method
		 */
		System.out.println("Sorting by implementing comparable interface and overriding compareTo method");
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
