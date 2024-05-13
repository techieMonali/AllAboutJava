package oops_concepts;

abstract class ab{
	//can be overload
	abstract void print();
	abstract void print(String msg);
	void print(int num) {
		System.out.println(num);
	}
}

/*Not possible to add abstract methods inside normal class
 * class scnd{
	abstract void dprint() {
		
	}
}*/

abstract class abc{
}
interface intrfc{
	int num=10;
	String msg="Hello";
	int sum();
}

interface intrfc1{
	float number = 20;
}

public class abstraction extends ab implements intrfc, intrfc1{

	public static void main(String[] args) {
		abstraction obj = new abstraction();
		obj.print();
		obj.print(10);
		obj.print("Monali");
		obj.sum();//interface method
		System.out.println(obj.number); //other interface
	}

	@Override
	void print() {
		System.out.println("Abstract print");
	}

	@Override
	void print(String msg) {
		System.out.println("Abstract print "+msg);
	}
	
	@Override
	void print(int num) {
		System.out.println(num+10);
	}

	@Override
	public int sum() {
		System.out.println(msg);
		return num+20;
	}

}
