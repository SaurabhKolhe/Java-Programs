package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int count = 0;
		if(number > 0) {
			for(int i = 1;i <= number; i++) {
				if(number % i == 0) {
					count++;
				}
			}
			if(count <= 2) {
				System.out.println(number +" number is prime number");
			}else {
				System.out.println(number +" number is not prime number");
			}
		}else {
			System.out.println(number +" number is not prime number");
		}

	}

}
