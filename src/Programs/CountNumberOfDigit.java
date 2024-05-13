package Programs;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count of Digits in Number is : "+count);
	}

}
