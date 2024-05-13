package Programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1st way
		System.out.print("Enter the 1st Number : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the 2nd Number : ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the 3rd Number : ");
		int number3 = sc.nextInt();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println(number1+" Number is largest number");
		}else if(number2 > number3 && number2 > number1) {
			System.out.println(number2+" Number is largest number");
		}else {
			System.out.println(number3+" Number is largest number");
		}

		//2nd way
		int largest = number1 > number2 ? number1 : number2;
		largest = number3 > largest ? number3 : largest;
		System.out.println(largest+" Number is largest number");
	}

}
