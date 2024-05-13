package Programs;

import java.util.Scanner;

public class NumberOfDigitEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int countEven = 0;
		int countOdd = 0;
		while(number != 0) {
			if((number % 10) % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			number = number / 10;
		}
		System.out.println("Count of Even Digits in Number is : "+countEven);
		System.out.println("Count of Odd Digits in Number is : "+countOdd);
	}

}
