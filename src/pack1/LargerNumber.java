package pack1;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b:");		
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("The value of a is larger");
		}else {
			System.out.println("The value of b is larger");
		}
	}

}
