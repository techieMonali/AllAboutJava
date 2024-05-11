package oops_concepts;

public class staticKeyword {
	static int num =0;
	int no = 0;
	
	staticKeyword(){
		num++;
		no++;
	}
	
	void print() {
		System.out.println("Value of static variable : "+num); //it stores static variable in memory only once 
		//and updates value only
		System.out.println("Value of non-static variable : "+no);//it stores non-static variable in memory 
		//everytime instance gets created
	}

	public static void main(String[] args) {
		staticKeyword obj = new staticKeyword();
		obj.print();
		staticKeyword obj1 = new staticKeyword();
		obj1.print();
		System.out.println(staticKeyword.num);
	}

}
