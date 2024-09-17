package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting implements Comparator<sorting> {
	static String name;
	static int age;
	
	sorting(String name, int age){
		name = this.name;
		age = this.age;
	}
	
	public static void listSorting() {
		ArrayList<String> arrlst = new ArrayList<>();
		arrlst.add("Ben");
		arrlst.add("Alex");
		arrlst.add("Balthezar");
		
		Collections.sort(arrlst);
		System.out.println(arrlst);
		
		
		
		Collections.sort(objLst, new sorting(name, age));
		
	}

	public static void main(String[] args) {
		System.out.println("****************************list sorting**********************************");
		listSorting();
		
		ArrayList<Object> objLst = new ArrayList<>();
		sorting obj1 = new sorting("Ariel", 10);
		sorting obj2 = new sorting("Rose", 15);
		sorting obj3 = new sorting("Denny", 12);
	}

}
