package Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String string = sc.next();
		String reverseString = "";
		for(int i = string.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		if(string.equals(reverseString)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

}
