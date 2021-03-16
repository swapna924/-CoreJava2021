package Pack3;

public class ArrayDemo {

	public static void main(String[] args) {
int[]a= {10,20,30,50,40};
for(int i=0;i<a.length;i++) {
	System.out.println(i);
	
}
System.out.println(a[4]);
System.out.println(a[5]);//It will give ArrayIndexOutOfBoundsException
	}

}
