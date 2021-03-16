package do_while;

public class Factorial {

	public static void main(String[] args) {
int num=5,fact=1;
int i=1;
do {
	fact=i*fact;
	i++;
}while(i<=num);
System.out.println(fact);
	}

}
