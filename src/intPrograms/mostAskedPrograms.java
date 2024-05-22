package intPrograms;

import java.util.Random;
import java.util.Scanner;

public class mostAskedPrograms {

	/*
	 * print 1 23 456 78910
	 */
	static void printPyramid() {
		int cnt = 1;

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(cnt);
				cnt++;
				if (j == i) {
					System.out.println();
				}
			}
		}
	}

	/*
	 * swap numbers using third variable and print random number
	 */

	private static void swap(int firstNum, int secondNum) {
		int temp = 0;
		System.out.println("Numbers before swiping : " + firstNum + " " + secondNum);
		temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		System.out.println("Numbers after swiping : " + firstNum + " " + secondNum);
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("Random number between 0-99: " + num);
	}

	/*
	 * print prime numbers from 1 to n, accept n from console
	 */
	private static void prime(int n) {
		
		for(int i=1;i<=n;i++) {
			int NotPrime=0;
			int prime=0;
			if(i==2) {
				System.out.println(i+" number is prime");
			}
			for(int j=2;j<i;j++) {
				if(i%1==0 && i%i==0 && i%2>0) {
					if(i%j==0) {
						NotPrime++;
						break;
					}else {
						prime++;
					}
				}
			}
			if(prime>0 && NotPrime==0) {
				System.out.println(i+" number is prime");
			}
		}
	}

	public static void main(String[] args) {
		printPyramid();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:"); int firstNum = sc.nextInt();
		System.out.println("Enter second number:"); int secondNum = sc.nextInt();
		swap(firstNum,secondNum);

		System.out.println("Enter 'n' number:");
		int n = sc.nextInt();
		prime(n);
	}

}
