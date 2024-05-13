package Programs;

import java.util.Scanner;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int sum = 0;
		while(number > 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		
		System.out.println("Sum of Digits in Number is : "+sum);
	}

}
