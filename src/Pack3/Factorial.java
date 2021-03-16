package Pack3;

public class Factorial {

	public static void display() {
		int num=5;
		int fact=1 ;
	
for(int i=1;i<=num;i++) {
	fact=i*fact;
	System.out.println(fact);
}
System.out.println("factorial of 5 is :"+fact);	
	}
	
	
public static void main(String[] args) {
	
	Factorial.display();

	}


}