package helper;

import java.util.Scanner;

public class StudentHelper {

	public static void startStudentOperation()
	{
		Scanner sc=new Scanner(System.in);
		boolean home=true;
		do {
			System.out.println("1.Add new Student ");
			System.out.println("2. View All Student");
			System.out.println("3. Update Student by sudent Nname");
			System.out.println("4. Delete Studnet Using Student ID");
			System.out.println("5. Search by Studnet email");
			System.out.println("6. Search student by department");
			System.out.println("7. Back to Admin menu ");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Student  Information");
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
