package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1st Method
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		System.out.println("Number is "+ number);
		int reverseNumber = 0;
		while(number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse Number is "+ reverseNumber);
		
		//2nd Method
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		System.out.println("Number is "+ number);
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		System.out.println("Reverse Number is "+ sb.reverse());
		
		//3rd Method
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		System.out.println("Number is "+ number);
		StringBuilder sbl = new StringBuilder();
		System.out.println("Reverse Number is "+ sbl.append(number).reverse());
		
		sc.close();
		
	}

}
