package Programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//1st Method
		System.out.print("Enter the String : ");
		String str = sc.next();
		System.out.println("String : "+str);
		String reverseStr = "";
		for(int i=str.length() - 1;i >= 0;i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("Reverse String : "+reverseStr);
		
		//2nd Method
		System.out.print("Enter the String : ");
		str = sc.next();
		System.out.println("String : "+str);
		char a[] = str.toCharArray();
		reverseStr = "";
		for(int j = a.length - 1; j >= 0; j--) {
			reverseStr = reverseStr + a[j];
		}
		System.out.println("Reverse String : "+reverseStr);
		
		//3rd Method
		System.out.print("Enter the String : ");
		str = sc.next();
		System.out.println("String : "+str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse String : "+sb.reverse());
	}
	
}
