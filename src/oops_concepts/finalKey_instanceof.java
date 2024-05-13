package oops_concepts;

public class finalKey_instanceof {
	final int val = 10;
	
	final void print() {
		//val=20; //not possible as variable is final
		System.out.println("Final method of parent");
	}
	
	//can be overloaded
	final void print(String msg) {
		
	}

}

/*
 * Not possible as parent class in final
 * class fChild extends finalKey{
	
}*/

class fChild extends finalKey_instanceof{
	int val = 20;
	
	void fChilsPrint() {
		//super.val = 20;  //not possible as variable is final
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		fChild obj = new fChild();
		obj.fChilsPrint();
		System.out.println(obj instanceof fChild);//to check obj belongs to class or not
	}
	
	
	/*
	 * Not possible as final method can not be overriden
	 * @Override
	final void print() {
		System.out.println("Final method of parent");
	}*/
}
