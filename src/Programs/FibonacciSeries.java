package Programs;

public class FibonacciSeries {
	public static void main(String args[]) {
		/* Fn = Fn-1 + Fn-2
		In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
		The first two numbers of fibonacci series are 0 and 1.
		F5 = F4 + F3 i.e. 3 = 2 + 1
		*/
		
		//Program to print Fibonacci Series where length will be given
		int length = 11;
		int f1 = 0 , f2 = 1 ;
		int fn;
		System.out.print(f1 + " " + f2 + " ");
		for(int i = 2; i < length; i++) {
			fn = f1 + f2;
			System.out.print(fn + " ");
			f1 = f2;
			f2 = fn;
		}
		System.out.println("");
		
		
		// Program to find Fibonacci Number from the series where position will be given
		int position = 12;
		f1 = 0 ;
		f2 = 1 ;
		if(position == 1) {
			System.out.println("First Fibonacci Number is "+ f1);
		} else if (position == 2) {
			System.out.println("Second Fibonacci Number is "+ f2);
		} else {
			for(int i = 2; i <= position; i++) {
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
			}
			System.out.println(position + " Fibonacci Number is " + f1);
		}
		
	}
}
