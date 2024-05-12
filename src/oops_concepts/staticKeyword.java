package oops_concepts;

/*
 * Static can be
 * 1.Variable
 * 2.Nested Class
 * 3.Method
 * 4.Block
 */

public class staticKeyword {
	static int num =0;
	int no = 0;
	
	staticKeyword(){
		num++;
		no++;
	}
	
	void print() {
		System.out.println("Value of static variable : "+num); //it stores static variable in memory only once 
		//and updates value only
		System.out.println("Value of non-static variable : "+no);//it stores non-static variable in memory 
		//everytime instance gets created
	}
	
	static void test() {
		System.out.println("Static method");
	}
	
	static {
		System.out.println("This is static block.This will always execute before main method");
	}
	
	//can be overload
	static void test(int i) {
		System.out.println("overloaded static method "+i);
	}

	//main() method is static to avoid create object for it and to save memory, it can be overloaded but
	//JVM picks the default one while execution
	public static void main(String[] args) {
		staticKeyword obj = new staticKeyword();
		obj.print();
		staticKeyword obj1 = new staticKeyword();
		obj1.print();
		System.out.println(staticKeyword.num);
		test();
		test(1);
		main();
	}
	
	static void main() {
		staticKeyword obj = new staticKeyword();
		obj.print();
		System.out.println("Second main method");
	}
}

class B extends staticKeyword{
	@Override
	void print() {
		System.out.println("hello");
	}
	
	//method overriding will be not allowed as methos is static
	/*@Override
	void test(int i) {
		System.out.println("overloaded static method "+i);
	}*/
	
	//only nested classes can be static in nature
	static class c{
		void print() {
			
		}
		static class d extends c{
			@Override
			void print() {
				
			}
		}
	}
}
