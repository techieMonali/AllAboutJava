package oops_concepts;

class parent {
	int anlIncome = 200000;
	
	void displayAge(int age) {
		System.out.println("Age of parent : "+age);
	}
	
	void displayName(String name) {
		System.out.println("Name of parent : "+name);
	}
}

class children extends parent{
	int noOfChilds=2;
	
	
	void displayAge(int age) {
		System.out.println("Age of child : "+age);
	}
	
	void viewEducation(String grade) {
		System.out.println("Grade : "+grade);
	}
	
	public static void main(String args[]) {
		System.out.println("******Upcasting*******");
		parent obj = new children();
		obj.displayAge(10);
		obj.displayName("hellen");
		//obj.viewEducation(""); //not possible
		children obj1 = new children();
		obj1.viewEducation("6th");
		obj1.displayName("julie");
		System.out.println("******Downcasting*******");
		//children obj2 = new parent();//we get java.lang.ClassCastException
		parent pObj = new children();
		children obj3 =(children)pObj;
		obj3.displayAge(12);
		obj3.viewEducation("7th");
		obj3.displayName("robert");
	}
}
