package basics;

//type of non-primitive data-type
interface intr {
	int no = 5;
	char iCh = 'b';
}

public class basic implements intr {

	// primitive data-types (total 8)

	// integer data-types
	static short sNum = 12345;
	static int iNum = 1234567890;
	static long lNum = 1234567890;

	static char ch = 'a'; // single character defined in single quote

	static float fNum = 363534.123f;
	static double dNum = 123456.123456789;

	// implicit type casting-automatic casting
	static float fToi = iNum;

	// explicit type casting-forcefully
	static int iTof = (int) fNum;

	static boolean result;
	static byte bt;

	// non-primitive data-types
	static String str = "Hello, All!";
	static int[] arr = { 23, 57, 98 };

	static void operators() {
		// arithmetic operators
		int a = 5, b = 7;
		System.out.println("Operator + : " + (a + b));
		System.out.println("Operator - : " + (a - b));
		System.out.println("Operator * : " + (a * b));
		System.out.println("Operator / : " + (b / a));
		System.out.println("Operator % : " + (b % a));

		// logical operators(&&,||) and equality operators(==,!=), if loop
		if (b / a == 1 && b % a == 2) {
			System.out.println("Operators ==,&& : True");
		}
		if (a + b != 12 || b % a == 2) {
			System.out.println("Operators !=,|| : True");
		}
		// comparison
		System.out.println("Operator a<b " + (a < b));
		System.out.println("Operator a>b " + (a > b));
		System.out.println("Operator a<=b " + (a <= b));
		System.out.println("Operator a>=b " + (a >= b));

		// unary operator(++,--) and break & continue, for loop
		for (int i = 0; i <= 3; i++) {
			System.out.println("Value of i : " + i);
			if (i == 2) {
				break;
			}
			continue; // will not continuecl
		}

	}

	static void loops() {
		int i = 0;

		// do-while loop
		do {
			i++;
			System.out.println("do-while loop: " + i);
		} while (i == 2);

		// while loop
		while (i < 4) {
			i++;
		}
		System.out.println("while loop: " + i);

		System.out.println("Switch loop");
		switch (i) {
		case 0:
			System.out.println("It's 0");
			break;
		case 4:
			System.out.println("It's 4");
			break;
		default:
			System.out.println("It's default case");
			break;
		}
		
		//if-else,if-else if
		if(i==3) {
			i++;
		}else if(i==4){
			System.out.println("Inside else-if");
		}else {
			System.out.println("Inside else");
		}
	}

	public static void main(String[] args) {
		System.out.println("*****Primitive data-types*****");
		System.out.println("Short value : " + sNum);
		System.out.println("Int value : " + iNum);
		System.out.println("Long value : " + lNum);
		System.out.println("Ch value : " + ch);
		System.out.println("Float value : " + fNum);
		System.out.println("Double value : " + dNum);
		System.out.println("Boolean value : " + result);
		System.out.println("Byte value : " + bt);

		// after changing value
		result = true;
		bt = 123;
		System.out.println("After changing value");
		System.out.println("Boolean value : " + result);
		System.out.println("Byte value : " + bt);

		System.out.println("*****Non-primitive data-types*****");
		System.out.println("String value : " + str);
		System.out.println("integer value from interface: " + no);
		System.out.println("character value from interface: " + iCh);

		System.out.println("Array");
		// for each loop
		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println("*****Type casting*****");
		System.out.println("Implicit type casting: " + fToi);
		System.out.println("Explicit type casting: " + iTof);

		operators();
		loops();
	}

}
/* OUTPUT
 * 
 * *****Primitive data-types*****
Short value : 12345
Int value : 1234567890
Long value : 1234567890
Ch value : a
Float value : 363534.12
Double value : 123456.123456789
Boolean value : false
Byte value : 0
After changing value
Boolean value : true
Byte value : 123
*****Non-primitive data-types*****
String value : Hello, All!
integer value from interface: 5
character value from interface: b
Array
23
57
98
*****Type casting*****
Implicit type casting: 1.23456794E9
Explicit type casting: 363534
Operator + : 12
Operator - : -2
Operator * : 35
Operator / : 1
Operator % : 2
Operators ==,&& : True
Operators !=,|| : True
Operator a<b true
Operator a>b false
Operator a<=b true
Operator a>=b false
Value of i : 0
Value of i : 1
Value of i : 2
do-while loop: 1
while loop: 4
Switch loop
It's 4
Inside else-if
 */
