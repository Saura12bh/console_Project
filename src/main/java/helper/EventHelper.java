package helper;
import java.util.*;
import model.*;
public class EventHelper {
	public static void startEventOperation()
	{
		Scanner sc=new Scanner(System.in);
		boolean home=true;
		do {
			System.out.println("1.Add new event ");
			System.out.println("2. View All Events");
			System.out.println("3. View Upcoming Events where date > today");
			System.out.println("4. Delete Event Using event ID");
			System.out.println("5. Update Event Details by Event Name");
			System.out.println("6. Back to Admin menu ");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Event Information");
				break;
			case 2:
				System.out.println("Below are all Events");
				break;
			case 6:
				home=false;
			}
			
		}while(home==true);
	}

}
