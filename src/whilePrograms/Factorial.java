package whilePrograms;

public class Factorial {

	public static void main(String[] args) {
int num=5,fact=1;
int i=1;
while(i<=num) {
	fact=i*fact;
	i++;
}
System.out.println(fact);
	}

}
