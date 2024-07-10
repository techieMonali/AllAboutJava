package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class arrayPrograms {

	int arr[] = { 20, 10, 5, 28, 4 };

	static void sort(int arr[]) {
		System.out.println("Length of array : " + arr.length);

		// ********Ascending order*******//
		System.out.println("First way to sort numbers");
		Arrays.sort(arr);
		System.out.println("Second minimum number : " + arr[1]);

		for (int i : arr) {
			System.out.println(i);
		}

		int newArr[] = { -30, 10, 5, 20, 43, 12 };
		System.out.println("Second way to sort numbers");
		for (int i = 0; i < newArr.length; i++) {

			for (int j = i + 1; j < newArr.length; j++) {
				int tmp = 0;
				if (newArr[i] > newArr[j]) {
					tmp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = tmp;
				}
			}
			System.out.println(newArr[i]);
		}

		// *******Descending order**************//
		int dNwArr[] = { -30, 10, 5, 20, 43, 12 };
		System.out.println("Descending sort numbers");
		for (int i = 0; i < dNwArr.length; i++) {

			for (int j = i + 1; j < dNwArr.length; j++) {
				int tmp = 0;
				if (dNwArr[i] < dNwArr[j]) {
					tmp = dNwArr[i];
					dNwArr[i] = dNwArr[j];
					dNwArr[j] = tmp;
				}
			}
			System.out.println(dNwArr[i]);
		}

	}

	// multi-dimentional array
	static void mltdmnlArr(int arr[][]) {

		/*
		 * 5 6 23 24 1 2 12 34
		 */

		int rowLength = arr.length;
		int colLength = arr[0].length;

		/*
		 * step 1: get whole row a[0][0],a[0][1] and add step 2: do it till column size
		 */

		for (int i = 0; i < rowLength; i++) {
			int add = 0;
			for (int j = 0; j < colLength; j++) {
				add = add + arr[i][j];
			}
			System.out.println("Addition of " + i + " row element : " + add);
		}

		for (int i = 0; i < colLength; i++) {
			int add = 0;
			for (int j = 0; j < rowLength; j++) {
				add = add + arr[j][i];
			}
			System.out.println("Addition of " + i + " column element : " + add);
		}

	}

	/*
	 * addition of two 2D arrays and save in 3rd array 2 4 10 9 0 1 3 5 3 2 5 3 8 9
	 * 0 5 6 7
	 * 
	 * expected output 11 4 12 5 10 6 13 12 7
	 * 
	 * And then sort new matrices with rows expected output 4 11 11 5 6 10 7 13 15
	 */
	public static void addMatrics() {
		int arrA[][] = { { 2, 4, 10 }, { 3, 5, 3 }, { 8, 6, 0 } };
		int arrB[][] = { { 9, 0, 2 }, { 2, 5, 3 }, { 5, 6, 7 } };
		int arrC[][] = new int[3][3];

		System.out.println("Addition of matrics is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print(arrC[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("Matrics row sort is:");
		int temp = 0;
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 2; b++) {
				if (arrC[a][b] > arrC[a][b + 1]) {
					temp = arrC[a][b];
					arrC[a][b] = arrC[a][b + 1];
					arrC[a][b + 1] = temp;
				}
				if (b == 1 && arrC[a][b] < arrC[a][b - 1]) {
					temp = arrC[a][b];
					arrC[a][b] = arrC[a][b - 1];
					arrC[a][b - 1] = temp;
				}
			}
		}

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.print(arrC[a][b] + " ");
			}
			System.out.println(" ");
		}

	}

	/*
	 * calculate frequency of element in array
	 */

	static void countApprnc() {
		int arr[] = { 2, 3, 4, 3, 5, 5, 6, 7, 1, 2, 3 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (hm.containsKey(key)) {
				hm.put(key, hm.get(key) + 1);
			} else {
				hm.put(key, 1);
			}
		}

		Set<Integer> keys = hm.keySet();

		for (int key : keys) {
			System.out.println(key + " : " + hm.get(key));
		}
	}

	/*
	 * addition of all array elements
	 */
	static void add() {
		int arr[] = { 12, 43, 12, 0, 46 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

	/*
	 * Input array {0,9,1,3,2,7,6,5,8} Pairs with sum as 8 Output pairs -
	 * [0,8],[1,7],[2,6], [3,5]
	 */
	static void sumEight() {
		int arr[] = { 0, 9, 1, 3, 2, 7, 6, 5, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int a = arr[i];
				int b = arr[j];
				if (Integer.sum(a, b) == 8) {
					System.out.println("[" + a + "," + b + "]");
				}
			}
		}
	}

	/*
	 * input arr = (12,34,0,45,0,46,2,0,3,0,0)
	 * output arr = (12,34,45,46,2,3,0,0,0,0,0)
	 */

	static void nonZeroEle() {
		int arr[] = { 12, 34, 0, 45, 0, 46, 2, 0, 3, 0, 0 };

		int nwArr[] = new int[arr.length];
		int j = 0;
		int cnt = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				nwArr[cnt] = arr[i];
				cnt--;
			} else {
				nwArr[j] = arr[i];
				j++;
			}
		}
		for (int k : nwArr) {
			System.out.println(k);
		}
	}
	
	/*
	 * count number of times number has appeared
	 * input arr = [2,2,1,2,1,4,5,5,6,8,9,8]
	 * 
key is 1 value is : 2
key is 2 value is : 3
key is 4 value is : 1
key is 5 value is : 2
key is 6 value is : 1
key is 8 value is : 2
key is 9 value is : 1
	 * 
	 */
	static void cntNumTms() {
		int arr[]= {2,2,1,2,1,4,5,5,6,8,9,8};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int key = arr[i];
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == key) {
					cnt++;
				}
			}			
			hm.put(key, cnt);
		}
		Set<Integer> keys = hm.keySet();
		for(int key:keys) {
			System.out.println("key is "+key+" value is : "+hm.get(key));
		}
	}
	
	
	public static void main(String[] args) {
		/*
		sumEight();
		add();
		countApprnc();
		int arr[] = { 10, 5, 20, 43, 12 };
		addMatrics();
		sort(arr); // way to pass array as a argument mltdmnlArr(new
		int tD[][] = { { 5, 6 }, { 23, 64 }, { 1, 2 }, { 12, 34 } };

		// return new int[] {};

		// ArrayIndexOutOfBoundsException scenario(negative index and when index
		// value is more than array size)
		try {
			System.out.println("Testing array out of bound exception");
			for (int j = 0; j < arr.length + 1; j++) {
				System.out.println(arr[j]);// Index 5 out of bounds for length 5
			}

			for (int j = -1; j < arr.length; j++) {
				System.out.println(arr[j]); // Index -1 out of bounds for length 5
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
		}
		 
		nonZeroEle();
		*/
		cntNumTms();
	}

}
