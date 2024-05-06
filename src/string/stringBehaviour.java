package string;

public class stringBehaviour {
	
	static void strngConcat() {
		System.out.println(28+23+"hello");
		System.out.println(23+23+"hey"+23+34);
		System.out.println("hello! "+"world");
		String s="hello";
		String str = new String(" world");
		System.out.println(s+23+45+str);
		System.out.println(s.concat(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strngConcat();
	}

}
