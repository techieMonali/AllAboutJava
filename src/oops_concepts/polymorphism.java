package oops_concepts;

public class polymorphism {
	
	//method overloading
	void print(String str) {
		System.out.println(str);
	}
	
	void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		polymorphism obj = new polymorphism();
		
		obj.print();
		obj.print("world");
	}
}

abstract class override{
	
	abstract void print();
	
	void print(String str) {
		System.out.println("String print "+str);
	}
}

class ovrd extends override{

	@Override
	void print() {
		System.out.println("Here is print overriden method");
	}
	
	@Override
	void print(String str) {
		System.out.println("String print "+str);
	}
	
	public static void main(String[] args) {
		ovrd obj = new ovrd();
		
		obj.print();
		obj.print("world");
	}
}