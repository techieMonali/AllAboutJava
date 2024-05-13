package oops_concepts;

public class encapsulation {
	private int num;
	private String name;
	
	void setNum(int num) {
		this.num = num;
	}
	
	void setName(String name) {
		this.name = name;
	}

	int getNum() {
		return num;
	}
	
	String getName() {
		return name;
	}
}

class encapsulationChild extends encapsulation{
	
	//we can avoid extending parent class
	public static void main(String[] args) {
		encapsulationChild obj = new encapsulationChild();
		//we can directly define value of private members or we can use setter as below
		obj.setName("Monali");
		obj.setNum(10);
		System.out.println(obj.getName()+" "+obj.getNum());
	}
}
