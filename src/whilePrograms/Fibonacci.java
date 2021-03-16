package whilePrograms;

public class Fibonacci {

	public static void main(String[] args) {
int n1=0,n2=1,n3;
int i=3;

while(i<10) {
	n3=n1+n2;
	System.out.print(n3+" ");
	n1=n2;
	n2=n3;
	i++;
}

	}

}
