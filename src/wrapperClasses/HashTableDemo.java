package wrapperClasses;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo {

	public HashTableDemo() {
	}

	public static void main(String[] args) throws IOException {
		
		String str;
		Hashtable<String,Integer> stud = new Hashtable<String,Integer>();
		
		Enumeration<String> names;
		
	Scanner br=new Scanner(System.in);
		
		System.out.println("Enter number of Records ");
		int n=Integer.parseInt(br.nextLine());

		for (int i=1;i<=n;i++)
		{
		System.out.println("Enter name of "+ i +"  Student");
		str=br.nextLine();
		
		System.out.println("Enter Marks Of "+ i+" Student");
		int marks=Integer.parseInt(br.nextLine());
		
		stud.put(str, marks);
		}

		int maxmarks=0;
		names = stud.keys();

		while(names.hasMoreElements())
		{
		str = (String) names.nextElement();
		System.out.println(str + ":" + stud.get(str));

		if(maxmarks<stud.get(str))
		{
		maxmarks=stud.get(str);
		}
		}
		System.out.println(" Maximum Marks Is "+maxmarks);
		}
		
	}


