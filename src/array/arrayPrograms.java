package array;

import java.util.Arrays;

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
	static void mltdmnlArr() {
		int[][] arr = {{5,6},{23,64},{1,2},{12,34}};
		
		/*
		5  6
		23 24
		1  2
		12 34
		*/
	
		int rowLength = arr.length;
		int colLength = arr[0].length;
		
		/*
		 * step 1: get whole row a[0][0],a[0][1] and add
		 * step 2: do it till column size
		 */
		
		for(int i=0;i<rowLength;i++) {
			int add = 0;
			for(int j=0;j<colLength;j++) {
				add = add + arr[i][j];
			}
			System.out.println("Addition of "+i+" row element : "+add);
		}
		
		for(int i=0;i<colLength;i++) {
			int add = 0;
			for(int j=0;j<rowLength;j++) {
				add = add + arr[j][i];
			}
			System.out.println("Addition of "+i+" column element : "+add);
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 20, 43, 12 };
		sort(arr);
		// ArrayIndexOutOfBoundsException scenario(negative index and when index value
		// is more than array size)
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
		
		mltdmnlArr();
	}

}
