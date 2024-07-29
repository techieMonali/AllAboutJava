package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.TreeSet;

public class QueueInterface implements Comparable<QueueInterface>{
	int num;
	String name;
	
	QueueInterface(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	public int compareTo(QueueInterface q) {  
	    if(num>q.num){  
	        return 1;  
	    }else if(num<q.num){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	} 
	
	static void priorityQueue(QueueInterface obj1, QueueInterface obj2) {
		System.out.println("******************************Priority Queue*********************************");
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(111);
		arrLst.add(222);
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		pQ.add(33);
		pQ.offer(22);
		pQ.addAll(arrLst);
		pQ.comparator(); //sorts 
		
		System.out.println("Queue after adding elements");
		Iterator itr = pQ.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Queue contains array elements or not? "+pQ.containsAll(arrLst));
		System.out.println("Retrieving head of Queue using 'element()' method : "+pQ.element());
		System.out.println("Retrieving head of Queue using 'peek()' method : "+pQ.peek());
		System.out.println("Retrieving and removing head of Queue using 'poll()' method : "+pQ.poll());
		System.out.println("Retrieving and removing head of Queue using 'remove()' method : "+pQ.remove());
				
		System.out.println("Queue after removing elements");
		itr = pQ.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//To create Queue of Objects we have to use 'compareTo()' method of interface 'Comparable'
		PriorityQueue<QueueInterface> objLst = new PriorityQueue<QueueInterface>();
		objLst.add(obj1);
		objLst.add(obj2);
		System.out.println("Object is present in object list? "+objLst.contains(obj2));
		Iterator qItr = objLst.iterator();
		while (qItr.hasNext()) {
			QueueInterface obj = (QueueInterface) qItr.next();
			System.out.println(obj.num + " " + obj.name);
		}
	}
	
	private static void arrayDeque(QueueInterface obj1, QueueInterface obj2) {
		System.out.println("******************************Array Deque*********************************");
		ArrayList<Integer> arrLst = new ArrayList<>();
		arrLst.add(111);
		arrLst.add(222);
		
		ArrayDeque<Integer> arrDQ = new ArrayDeque<>();
		//adds element at the head of Q
		arrDQ.offerFirst(2);
		arrDQ.addFirst(1);
		arrDQ.push(3); //act as stack
		
		//adds element at the end of Q
		arrDQ.offer(4);
		arrDQ.add(5);
		arrDQ.addLast(6);
		arrDQ.offerLast(7);
		
		//returns head of Q
		System.out.println("Head of the Q by 'peek()': "+arrDQ.peek());
		System.out.println("Head of the Q by 'peekFirst()': "+arrDQ.peekFirst());
		System.out.println("Head of the Q by 'getFirst()': "+arrDQ.getFirst());
		System.out.println("Head of the Q by 'element()': "+arrDQ.element());
		
		//returns last element of Q
		System.out.println("Last element of the Q by 'getLast()': "+arrDQ.getLast());
		System.out.println("Last element of the Q by 'peekLast()': "+arrDQ.peekLast());

		System.out.println("*************Deque before***************");
		Iterator qItr = arrDQ.iterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
		
		System.out.println("Q after Deleting front elments of Q");
		arrDQ.poll();
		arrDQ.pollFirst();
		arrDQ.pop();
		arrDQ.removeFirst();
		qItr = arrDQ.iterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
		
		System.out.println("Q after Deleting end elments of Q");
		arrDQ.removeLast();
		arrDQ.pollLast();
		qItr = arrDQ.iterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
		
		arrDQ.addFirst(1); //this is head
		System.out.println("Q with 'descendingIterator()'");
		qItr = arrDQ.descendingIterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
	}
	
	public static void main(String[] args) {
		QueueInterface obj1 = new QueueInterface(10,"Anjali");
		QueueInterface obj2 = new QueueInterface(20,"Bella");
		priorityQueue(obj1,obj2);
		arrayDeque(obj1,obj2);
	}
}
