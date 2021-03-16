package whilePrograms;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.println("Enter the value of x: ");
int x = sc.nextInt();
		int sum=0;
		int rem;
		while(x>0) {
			rem=x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println("Added digits of a number: "+sum);

	}

}
