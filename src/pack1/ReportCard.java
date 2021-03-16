package pack1;

import java.util.Scanner;

public class ReportCard {
	
	static  Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

	System.out.print("enter the name:");
	
	String name=sc.nextLine();
	
	System.out.println("enter the no. of subjects:");
	int no=sc.nextInt();
	
	int [] marks=new int[no];
	//call methods
	marksEntry(marks);
	printReportCard(name,marks,no);
	
	}
	static void marksEntry(int[]marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter marks for subject-"+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		
	}
	static void printReportCard(String name,int[]marks,int no) {
		System.out.println("---------------------------------------");
		System.out.println("\t REPORT CARD ");
		System.out.println("Name: "+name);
		System.out.println("----------------------------------------");
		System.out.println("SUBJECT \t Marks");
		System.out.println("-----------------------------------------");
		int total=0;
		for(int i=0;i<no;i++) {
			total=total+marks[i];
			System.out.println("subject-"+(i+1)+"\t"+marks[i]);
		}
		System.out.println("------------------------------------");
		float average=(float)total/no;
		System.out.printf("Total:%d Average:%.2f\n",total,average);
		System.out.println("-----------------------------------");
	}
	

}
