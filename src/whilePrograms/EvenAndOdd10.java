package whilePrograms;

public class EvenAndOdd10 {

	public static void main(String[] args) {
		int j=0;
		int i=0;
		System.out.println("Even numbers are: ");
while(i<20) {
	if (i%2==0) {
		System.out.print(i+" ,");
	}
	i++;
	
}
System.out.println();
System.out.println("Odd numbers are: ");

while(j<20) {
	if(j%2!=0) {
		System.out.print(j+",");
	}
	j++;
}
	}

}
