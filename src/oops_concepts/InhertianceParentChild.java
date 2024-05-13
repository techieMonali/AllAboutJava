package oops_concepts;

public class InhertianceParentChild {

	void print() {
		System.out.println("This is Parent");
	}

}

//single inheritance
class child extends InhertianceParentChild {
	int num = 10;
	/*
	 * void print() { System.out.println("This is eldest child"); }
	 */

	public static void main(String[] args) {
		/*
		 * parent obj = new parent(); obj.print();
		 */
		child cObj = new child();
		cObj.print();
	}

}

//multilevel inheritance
class otherChild extends child {

	void print() {
		System.out.println("This is other child");
		System.out.println("Number from child class " + num);
	}

	public static void main(String[] args) {
		child cObj = new child();
		cObj.print();
		otherChild ocObj = new otherChild();
		ocObj.print();
	}

}

//Hierarchical inheritance
class teen extends InhertianceParentChild {

	void print() {
		System.out.println("This is teen");
	}

	public static void main(String[] args) {
		teen obj = new teen();
		obj.print();
		InhertianceParentChild pObj = new InhertianceParentChild();
		pObj.print();
	}

}