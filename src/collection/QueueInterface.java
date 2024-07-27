package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class QueueInterface {

	static void allQueue() {
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		ArrayDeque<Integer> dQ = new ArrayDeque<>();

		pQ.add(1);
		pQ.add(1);//allowed
		pQ.add(2);
		pQ.add(4);
		pQ.add(3);
		//pQ.add(null); not allowed as NULL values are not acceptable
		
		dQ.add(11);
		dQ.add(21);
		dQ.add(31);
		dQ.add(41);
		//dQ.add(null);   not allowed as NULL values are not acceptable
		
		pQ.addAll(dQ);
		System.out.println(pQ.containsAll(dQ));
		System.out.println(pQ.isEmpty());
		System.out.println(pQ.offer(5));
		
		System.out.println("Priority Queue Before");
		for(int i:pQ) {
			System.out.println(i);
		}

		System.out.println("Size of Queue : "+pQ.size());
		System.out.println("Queue to string : "+pQ.toString());
		System.out.println("Returns head of queue : "+pQ.element()); //returns NoSuchElementException if Q is empty
		System.out.println("Returns head of queue : "+pQ.peek()); //returns null if Q is empty
		System.out.println("Returns and removes head of the queue : "+pQ.poll());//returns null if Q is empty
		System.out.println("Returns and removes head of the queue : "+pQ.remove());//returns NoSuchElementException
		//if Q is empty
		System.out.println("Priority Queue after modification");
		for(int i:pQ) {
			System.out.println(i);
		}
	
		dQ.addFirst(0);
		dQ.addLast(3);
		Iterator itr=dQ.descendingIterator();//only deque has 
		System.out.println("Deque in decending order:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Deque before removing elements");
		itr=dQ.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		dQ.removeFirst();
		dQ.removeLast();
		dQ.pop(); //same as removeFirst()
		dQ.d
		System.out.println("Deque After");
		
		for(int i:dQ) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		allQueue();
	}

}
