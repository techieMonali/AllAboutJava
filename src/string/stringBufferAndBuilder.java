package string;

public class stringBufferAndBuilder {
	
	static void stringBuffMethods() {
		StringBuffer str = new StringBuffer(); //default
		StringBuffer str1 = new StringBuffer(10); //with initial capacity
		StringBuffer str2 = new StringBuffer("hey "); //with initial capacity
		
		str.append("hello"); //append is to add string 
		str1.append(" world!");
		str2.append(str+""+str1);
		System.out.println("String after concatination : "+str2);
		
		System.out.println("String capacity of String 'hello world!' :"+str2.capacity());
		System.out.println("String length of String 'hello world!' :"+str2.length());
		System.out.println("Character at 0 index of str2 : "+str2.charAt(0));
		System.out.println("str2 compare to str1 : "+str2.compareTo(str1));
		System.out.println("In str2, index of word 'hello' is : "+str2.indexOf("hello"));
		System.out.println("Substring of string 'hey hello world!' : "+str2.substring(0,3));
		str2.insert(0, 123);
		System.out.println("str2 after inserting 123 : "+str2);
		str2.replace(0, 3, "");
		System.out.println("str2 after replacing 123 with null string : "+str2);
		System.out.println(str2.reverse());
		System.out.println(str2.reverse());
		str2.delete(0, 3);
		str2.deleteCharAt(0);
		System.out.println(str2);
	}
	
	static void stringBldrMethods() {
		StringBuilder str = new StringBuilder(); //default
		StringBuilder str1 = new StringBuilder(10); //with initial capacity
		StringBuilder str2 = new StringBuilder("hey "); //with initial capacity
		
		str.append("hello"); //append is to add string 
		str1.append(" world!");
		str2.append(str+""+str1);
		System.out.println("String after concatination : "+str2);
		
		System.out.println("String capacity of String 'hello world!' :"+str2.capacity());
		System.out.println("String length of String 'hello world!' :"+str2.length());
		System.out.println("Character at 0 index of str2 : "+str2.charAt(0));
		System.out.println("str2 compare to str1 : "+str2.compareTo(str1));
		System.out.println("In str2, index of word 'hello' is : "+str2.indexOf("hello"));
		System.out.println("Substring of string 'hey hello world!' : "+str2.substring(0,3));
		str2.insert(0, 123);
		System.out.println("str2 after inserting 123 : "+str2);
		str2.replace(0, 3, "");
		System.out.println("str2 after replacing 123 with null string : "+str2);
		System.out.println(str2.reverse());
		System.out.println(str2.reverse());
		str2.delete(0, 3);
		str2.deleteCharAt(0);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		System.out.println("*****************String Buffer******************");
		stringBuffMethods();
		System.out.println("*****************String Builder******************");
		stringBldrMethods();
	}
	

}
