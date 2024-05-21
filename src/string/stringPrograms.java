package string;

import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringPrograms {
	
	static void stringReverse() {
		String str = "hello, world!";
		
		//one way
		StringBuilder sB = new StringBuilder(str);
		System.out.println(sB.reverse());
		
		//using for loop
		char ch;
		String nstr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			ch = str.charAt(i);
			nstr = nstr + ch;
		}
		System.out.println(nstr);
	}
	
	static void checkPalindrome() {
		String str = "nitin";
		String str1 ="0120";
		int cnt=1;
		//one way
		for(int i=0;i<str.length()/2;i++) {
			char firstCh = str.charAt(i);
			//System.out.println(firstCh);
			char lastCh = str.charAt(str.length()-cnt);
			//System.out.println(lastCh);
			if(firstCh!=lastCh) {
				System.out.println("It's not palindrome");
				break;
			}
			cnt++;
			System.out.println("String is palindrome");
		}
		//other way
		char ch;
		String nstr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			ch = str.charAt(i);
			nstr = nstr + ch;
		}
		if(str.equals(nstr)) {
			System.out.println("String is palindrome");
		}else
			System.out.println("It's not palindrome");
	}

	static void StringToInt() {
		String strng="10";
		//one way
		int num = Integer.parseInt(strng);
		System.out.println("String to integer value conversion : "+num);
		//other way
		int no = Integer.valueOf(strng);
		System.out.println("String to integer value conversion : "+no);
	}
	
	static void intToString() {
		int num=100;
		//one way
		String str = String.valueOf(num);
		System.out.println("Integer to string value conversion : "+str);
		//other way
		String strng = Integer.toString(num);
		System.out.println("Integer to string value conversion : "+strng);
	}
	
	//one way
	static void charCount() {
		String str = "hello world";
		char ch[] = str.toCharArray();
		int cnt;
		
		for(int i=0;i<ch.length;i++) {
			cnt=0;
			
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
				}
			}
			System.out.println(ch[i]+" occured "+cnt+" times");
		}
	}
	
	//other Way to count characters
	static void charCountHashMap() {
		String str = "hello world";
		char ch[] = str.toCharArray();
		
		HashMap<Character,Integer> hM = new HashMap<Character,Integer>();
		for(char chr:ch) {
			if(hM.containsKey(chr)) {
				hM.put(chr, hM.get(chr)+1);
			}else
				hM.put(chr, 1);
		}
		Set<Character> key = hM.keySet();
		for(Character chr:key) {
			System.out.println(chr+" occured "+hM.get(chr));
		}
	}
	
	//print duplicate characters with index values
	static void charNdIndx() {
		String str = "hello world";
		char[] chrArr = str.toCharArray();
		HashMap<Character,Integer> hshMap = new HashMap<Character,Integer>();
		
		for(char ch:chrArr) {
			if(hshMap.containsKey(ch)) {
				hshMap.put(ch, hshMap.get(ch)+1);
			}else
				hshMap.put(ch, 1);
		}
		Set<Character> keys = hshMap.keySet();
		for(Character ch:keys) {
			System.out.println(ch+":"+hshMap.get(ch));
			if(hshMap.get(ch)>1) {
				int index = str.indexOf(ch);
				System.out.println("Index : "+index);
				int cnt = hshMap.get(ch)-1;
				do {
					index = index+1;
					System.out.println("Index : "+str.indexOf(ch, index));
					cnt--;
				}while(cnt!=0);
			}
		}
	}
	
	static void wordCount() {
		String str = " hey world! I love you 123";
		
		String[] strArr = str.split(" ");
		int cnt = strArr.length;
		
		for(String strng:strArr) {
			
			if(strng==" " || strng=="") {
				cnt--;
			}
			System.out.println("String : "+strng);
		}		
		System.out.println("Total word count : "+cnt);
	}
	
	//using wrapper class
	static void sumOfNumFrmString() {
		String str = "2435dgdfg 24 sdfd34d6nf asd 35 f78";
		String tempSum = "0";
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				tempSum+=ch;
			}else {
				sum+=Integer.parseInt(tempSum);
				tempSum="0";
			}
		}
		System.out.print("Addition of number present in string is : ");
		System.out.print(sum + Integer.parseInt(tempSum));
	}
	
	//using pattern and matcher
	static void sumNumberString() {
		String str = "32ds 34 sdf234rsfdf 235";
		String regex = "[0-9]+";
		int sum =0;
		
		Pattern pat = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher mtch = pat.matcher(str);
		
		while(mtch.find()) {
			System.out.println("found number : "+mtch.group(0));
			sum+=Integer.parseInt(mtch.group(0));
		}
		System.out.println("sum:"+sum);
	}
	
	//remove all special characters from string
	static void rmvSpclChr() {
		String str = "!@asdf$@#23%46$#7szdcf%*&&(";
		
		String fltrdStr = str.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(fltrdStr);
	}
	
	static void charOccurence() {
		String str ="**|*****|**|**"; //find the * occurrence between |
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='|') {
				if(i!=str.length()-1) {
					int firstIndex = i;
					try {
						int lastIndex = str.indexOf('|', i+1);
						int length = str.substring(firstIndex, lastIndex).length()-1;
						System.out.println(length);
					}catch(StringIndexOutOfBoundsException e) {
						
					}
				}
					
			}
		}
	}
	
	static void wordOccurence() {
		String str = "hello hey hello how are you.you look good";
		String regex = "[. ]";
		int cnt=1;
		String []arr = str.split(regex);
		
		HashMap<String,Integer> hshMap = new HashMap<String,Integer>();
		
		for(String strng:arr) {
			if(hshMap.containsKey(strng)) {
				hshMap.put(strng, hshMap.get(strng)+1);
			}else
				hshMap.put(strng, 1);
		}
		
		Set<String> keys = hshMap.keySet();
		for(String str2:keys) {
			System.out.println(str2+":"+hshMap.get(str2));
		}
	}
	
	//vowel count
	static void vowelCnt() {
		String str = "hello world this is really good for you";
		char ch[] = str.toCharArray();
		HashMap<Character,Integer> hM = new HashMap<Character,Integer>();
				
		for(char chr:ch) {
				if(chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u') {
					if(hM.containsKey(chr)) {
						hM.put(chr, hM.get(chr)+1);
					}else
						hM.put(chr, 1);
				}
		}		
	
		Set<Character> key = hM.keySet();
		for(Character chr:key) {
			System.out.println(chr+" occured "+hM.get(chr));
		}
	}
	
	//string swap with and without 3rd variable
	static void stringSwap() {
		String str1="hello";
		String str2 = "hey";
		int index = str1.length();
		
		str1 = str1+str2;
		System.out.println(str1);
		
		str2 = str1.substring(0, index);
		str1 = str1.substring(index);
		System.out.println(str2);
		System.out.println(str1);
	}
	
	/*
	 * print
	 * 1234*
	 * 123*5
	 * 12*45
	 * 1*345
	 * *2345
	 */
	static void printFormat() {
		String str1="12345";
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.replace(str1.charAt(i), '*'));
		}
	}
	
	/*
	 * print
	 * 1
	 * 23
	 * 456
	 * 78910
	 */
	static void printPyramid() {
		int numRows = 4;
		int numCols = 4;
		int cnt = 1;
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(cnt);
					cnt++;
					if(j==i) {
						System.out.println();
					}
			}
		}
		
	}
	
	public static void main(String[] args) {
		/*stringReverse();
		checkPalindrome();
		StringToInt();
		intToString();
		charCount();
		charCountHashMap();
		wordCount();
		sumOfNumFrmString();
		sumNumberString();
		rmvSpclChr();
		charNdIndx();
		charOccurence();
		wordOccurence();
		vowelCnt();
		stringSwap();
		printFormat();*/
		printPyramid();
	}

}
