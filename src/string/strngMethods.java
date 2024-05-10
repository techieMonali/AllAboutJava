package string;

public class strngMethods {
	static String str = "hello! World"; //creating string using string literal
	static String str1 = "hello! World";
	static String str2 = "hello! Universe";
	static String strng = new String("hello! World"); //creating string using new keyword
	static String strng1 = new String("hello! World");
	static String strng2 = new String("hello! Universe");
	
	static void checkEqual() {
		/*for String literal == and equal() works but for String object with new keyword == operator does not
		work at all*/
		System.out.println("*******Comaprison of string literals******");
		System.out.println("(hello! World==hello! World) : "+(str==str1));
		System.out.println("(hello! World==hello! Universe) : "+(str==str2));
		System.out.println("(hello! World.equals(hello! World)) : "+(str.equals(str1)));
		System.out.println("(hello! World.equals(hello! Universe)) : "+(str.equals(str2)));
		System.out.println();
		System.out.println("********Comaprison of string objects*******");
		System.out.println("(hello! World==hello! World) : "+(strng==strng1)); //we cannot compare string objects with == Operators
		System.out.println("(hello! World==hello! Universe) : "+(strng==strng2));
		System.out.println("(hello! World.equals(hello! World)) : "+(strng.equals(strng1)));
		System.out.println("(hello! World.equals(hello! Universe)) : "+(strng.equals(strng2)));
		System.out.println();
		System.out.println("String literal == String Object : "+(str==strng));
		System.out.println("String Object == String Literal : "+(strng==str));
		System.out.println("String literal.equals(String Object) : "+(str.equals(strng)));
		System.out.println("String Object.equals(String Literal) : "+(strng.equals(str)));
	}
	
	static void strMethods() {
		System.out.println("**************String methods**************");
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.concat(str1));
		str = str.concat(str1);
		System.out.println(str);
		System.out.println(str.contains("hel"));
		System.out.println(str.contentEquals(str1));
		System.out.println(str.endsWith("rld"));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.indent(2));
		System.out.println(str.indexOf("W"));
		System.out.println(str.indexOf("l", 7));
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());//whitespace present
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.repeat(2));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replaceAll("[a-z]", "0"));
		System.out.println(str.replace("h", "H"));
		System.out.println(" hello ".strip());
		System.out.println(str.trim());
		System.out.println("hello".compareTo("hello"));//returns 0 because they are same
		System.out.println("hello".compareTo("hell"));//s1>s2 returns 1
		System.out.println("hell".compareTo("hello"));//s1<s2 returns -1

		String[] strArr = str.split(" ");
		System.out.println("String array");
		System.out.println(strArr.length);
		for(String str:strArr) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEqual();
		strMethods();
	}

}
