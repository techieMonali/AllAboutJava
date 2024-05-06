package accessModifier;

public class accessModfr {
	static public int publcVar=2;
	static private int prvtVar=3;
	static protected int prtctdVar=5;
	static int dfltVar=4;
	
	public int publcVar1=2;
	private int prvtVar1=3;
	protected int prtctdVar1=5;
	int dfltVar1=4;
	
	static void print() {
		System.out.println(publcVar);
		System.out.println(prvtVar);
		System.out.println(prtctdVar);
		System.out.println(dfltVar);
	}
	
	public static void main(String args[]) {
		//all access modifiers are accessible within class
		System.out.println("all access modifiers are accessible within class");
		print();
	}
}

class other extends accessModfr{
	static void print() {
		System.out.println(publcVar);
	//	System.out.println(prvtVar); private member will be accessible only within same class
		System.out.println(prtctdVar);
		System.out.println(dfltVar);
	}
	
	public static void main(String args[]) {
		System.out.println("all access modifiers except Private are accessible outside class");
		print();
	}
}
