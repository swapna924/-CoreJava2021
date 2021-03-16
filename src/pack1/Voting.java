package pack1;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

System.out.println("Enter the age of voter: ");
int checkAge=sc.nextInt();
if (checkAge<18) {
	System.out.println("Voter age has to be greater than 18");
}else {
	System.out.println("Age is correct");
}
	}

}
