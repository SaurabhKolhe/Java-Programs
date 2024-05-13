package Programs;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Using third variable
		System.out.print("Enter the 1st Number : ");
		int number1 = sc.nextInt();
		System.out.print("Enter the 2nd Number : ");
		int number2 = sc.nextInt();
		int temp = number2;;
		number2 = number1;
		number1 = temp;
		System.out.println("1st Number after swapping : "+number1);
		System.out.println("2nd Number after swapping : "+number2);
		
		//Without using third variable
		System.out.print("Enter the 1st Number : ");
		number1 = sc.nextInt();
		System.out.print("Enter the 2nd Number : ");
		number2 = sc.nextInt();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("1st Number after swapping : "+number1);
		System.out.println("2nd Number after swapping : "+number2);
		
		//Without using third variable
		System.out.print("Enter the 1st Number : ");
		number1 = sc.nextInt();
		System.out.print("Enter the 2nd Number : ");
		number2 = sc.nextInt();
		number1 = number1 * number2;
		number2 = number1 / number2;
		number1 = number1 / number2;
		System.out.println("1st Number after swapping : "+number1);
		System.out.println("2nd Number after swapping : "+number2);
		
		//Without using third variable
		System.out.print("Enter the 1st Number : ");
		number1 = sc.nextInt();
		System.out.print("Enter the 2nd Number : ");
		number2 = sc.nextInt();
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		System.out.println("1st Number after swapping : "+number1);
		System.out.println("2nd Number after swapping : "+number2);
				
		sc.close();

	}

}
