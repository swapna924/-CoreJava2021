package pack1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}
	}

}
