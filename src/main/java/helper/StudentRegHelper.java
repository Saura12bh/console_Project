package helper;

import java.util.Scanner;

public class StudentRegHelper {

	public static void startStudentRegOperation()
	{
		Scanner sc=new Scanner(System.in);
		boolean home=true;
		do {
			System.out.println("1.Add new register ");
			System.out.println("2. View All Student  registered");
			System.out.println("7. Back to Admin menu ");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Student  Information");
				break;
			case 2:
				System.out.println("Below are all Student");
				break;
			case 7:
				home=false;
			}
		}while(home==true);


	}
}
