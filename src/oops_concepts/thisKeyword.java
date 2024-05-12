package oops_concepts;

/*
 * this keyword is used for
 * 1.to invoke current class constructor - this()
 * 2.to invoke current class method -this.method_name()
 * 3.to invoke current class instance variables - this.classVar=constructor_var
 */
public class thisKeyword {
	String msg;
	int year;
	
	thisKeyword(){
		System.out.println("Default constructor");
		
	}
	
	/*this will print output - null0
	thisKeyword(String msg, int year){
		msg=msg;
		year=year;
	}*/
	
	//this will print run time provided values
	thisKeyword(String msg, int year){
		this(); //to invoke constructor inside constructor
		this.msg=msg;
		this.year=year;
		this.print(); //to invoke current class method
	}
	
	void print1() {
		this.print(); //to invoke method
	}
	
	void print() {
		System.out.println(msg+year);
	}
}

class thisKeyword_1 {
	
	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword("hello ",2024);
		
		obj.print();
		obj.print1();
		//thisKeyword obj1 = new thisKeyword();
	}
}
