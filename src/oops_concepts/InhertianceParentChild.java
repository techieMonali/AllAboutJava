package oops_concepts;

/*
 * two ways to build inheritance
 * 1.extends
 * 2.implements
 */

interface inheritance{
	String msg="Welcome";
}


public class InhertianceParentChild implements inheritance{

	void print() {
		System.out.println("This is Parent "+msg);
	}

}

//single inheritance parent->child
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

//multilevel inheritance parent->child->otherChild
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

//Hierarchical inheritance parent->teen
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