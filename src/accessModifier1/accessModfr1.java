package accessModifier1;

import accessModifier.*;

public class accessModfr1{
	
	public static void main(String args[]) {
		accessModfr obj = new accessModfr();
		System.out.println(obj.publcVar1);
		//System.out.println(obj.prvtVar1);  // will not be accessible outside package
		//System.out.println(obj.prtctdVar1); // will not be accessible outside package
		//System.out.println(obj.dfltVar1); // will not be accessible outside package
	}
}

class accessModfr3 extends accessModfr{
	
	public static void main(String args[]) {
		accessModfr3 obj = new accessModfr3();
		System.out.println(obj.publcVar1);
		//System.out.println(obj.prvtVar1);  // will not be accessible outside package by subclass
		System.out.println(obj.prtctdVar1);
		//System.out.println(obj.dfltVar1); // will not be accessible outside package by subclass
	}
}
