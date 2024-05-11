package oops_concepts;

public class cnstrctr {
	String message,userName;
	
	//two types of constructors
	cnstrctr(){}//default constructor/no argument constructor
	
	//Parameterized constructor
	cnstrctr(String msg){
		message=msg;
	}
	
	//constructor Overloading
	cnstrctr(String msg, String usrNm){
		message=msg;
		userName=usrNm;
	}
	
	void print() {
		System.out.println(message+" "+userName);
	}
	
	public static void main(String[] args) {
		cnstrctr obj = new cnstrctr("Welcome");
		obj.print();
		obj = new cnstrctr("Welcome","Monali");
		obj.print();
	}

}
