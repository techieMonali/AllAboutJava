package oops_concepts;

public class superKey {
	int num = 10;
	
	superKey(){
		System.out.println("Defualt constructor");
	}

	superKey(String msg){
		System.out.println(msg);
	}
	
	void print() {
		System.out.println("Parent method");
	}

}

class superChild extends superKey{
	int num = super.num; //parent class variable
	
	superChild(){
		super(); //parent class constructor
	}
	
	void print() {
		super.print(); //parent class method
	}
	
	
	public static void main(String[] args) {
		superChild obj = new superChild();
		System.out.println(obj.num);
		obj.print();
	}
}
