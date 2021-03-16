package Pack3;

import java.util.Scanner;

public class OperationsDemo {
	public static void  display() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		float b = sc.nextFloat();

		System.out.println("Sum of two numbers is " + a + " +" + b + "=" + (a + b));

		System.out.println("Product of two numbers is " + a + " *" + b + "=" + (a * b));

		System.out.println("Difference of two numbers is " + a + " - " + b + "=" + (a - b));

		System.out.println("Quotient of two numbers is " + a + " / " + b + "=" + (a / b));

		System.out.println("Enter the value of C: ");
		int c = sc.nextInt();
		System.out.println("Increment Operator: " + (c++));

		System.out.println(c);

		System.out.println("Enter the value of d: ");
		int d = sc.nextInt();

		System.out.println("Decrement operator: " + (--d));
		System.out.println(d);

		char s = 'A';
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		OperationsDemo.display();
	}

}
