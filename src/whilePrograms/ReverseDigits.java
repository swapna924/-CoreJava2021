package whilePrograms;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=sc.nextInt();
int rev=0;
int rem;

while(x>0) {
	rem=x%10;
	x=x/10;
	rev=rev*10+rem;
}
System.out.println("Reversed digits of a number " +rev);
	}

}
