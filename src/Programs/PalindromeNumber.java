package Programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// 1st Method
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int num = number;
		int reverseNumber = 0;
		while(num != 0) {
			reverseNumber = reverseNumber * 10 + num % 10 ;
			num = num / 10;
		}
		if(number == reverseNumber) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}
}
