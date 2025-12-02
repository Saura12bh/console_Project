package helper;
import java.util.*;
import helper.*;
public class AdminHelper {

	//admin madhe ase menu asnar je admin perfom kru shkto
	//ani ya madhe yek static method asel tyat he lihil asel
	public static void startOperation()
	{
		Scanner sc=new Scanner(System.in);
		boolean home=true;
		do {
			
			System.out.println("welcome to Admin Page");
			System.out.println("1->Event Operation");
			System.out.println("2->Student Operation");
			System.out.println("3->Student Registration Operation");
			System.out.println("4->back to Home Page");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Welcome to Event Operation");
				EventHelper.startEventOperation();
				break;
			case 2:
				System.out.println("Welcome to Student operation");
				StudentHelper.startStudentOperation();
				break;
			case 3:
				System.out.println("Welcome to Student Registration Operation");
				StudentRegHelper.startStudentRegOperation();
				break;
			case 4:
				home=false;
				break;
			}

		}while(home==true);

	}
}
