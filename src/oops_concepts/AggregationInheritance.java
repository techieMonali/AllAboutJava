package oops_concepts;

public class AggregationInheritance {

}

class address{
	String country;
	String city;
	
	address(String country,String city){
		this.country = country;
		this.city = city;
	}
}

class emp{
	address add;
	
	emp(address add){
		this.add = add;
	}
	void print() {
		System.out.println(add.country+" "+add.city);
	}
	
	public static void main(String[] args) {
		address objct = new address("India","Pune");
		emp obj = new emp(objct);
		obj.print();
	}
}
