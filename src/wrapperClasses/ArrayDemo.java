package wrapperClasses;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
for(int i=1;i<=10; i++) {
	System.out.println(i);
	list.add(i);
}
System.out.println(list);
	}

	
}
