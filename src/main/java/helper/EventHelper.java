package helper;

import java.util.*;
import service.*;
import model.*;

public class EventHelper {
	public static void startEventOperation() {
		Scanner sc = new Scanner(System.in);
		// jr apn he switch madhe ghetle tr darvles aplya new Object bnaylagata
		Event e = new Event();
		EventService es = new EventServiceImpl();
		List<Event> list;
		boolean home = true;
		do {
			System.out.println("1.Add new event ");
			System.out.println("2. View All Events");
			System.out.println("3. View Upcoming Events where date > today");
			System.out.println("4. Delete Event Using event ID");
			System.out.println("5. Update Event Details by Event Id");
			System.out.println("6. Back to Admin menu ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter Event Information");
				System.out.println("Enter Event name");
				String name = sc.nextLine();
				System.out.println("Enter Event Date(YY-MM-DD)");
				String inputDate = sc.nextLine();
				// need to convert sting into java.sql.Date
				// if we not convert this sting into date then value is not inserted in
				// DB and we get exception : java.sql.SQLException: Data truncated for column
				// 'edate'
				java.sql.Date eventDate = java.sql.Date.valueOf(inputDate);
				System.out.println("Enter Event Venue i.e Location of the Event  : ");
				String venue = sc.nextLine();
				System.out.println("Enter Student Capacity for the  given Event : ");
				int capacity = sc.nextInt();
				e.setName(name);
				e.setEdate(eventDate);
				e.setVenue(venue);
				e.setCapacity(capacity);
				boolean b = es.addEvent(e);
				if (b == true) {
					System.out.println("Event Add Successfully");
				} else {
					System.out.println("Event not added.Please Try again");

				}
				break;
			case 4:
				System.out.println("Enter event Id to delete Event");
				int eid = sc.nextInt();
				b = es.deleteEvent(eid);
				if (b == true) {
					System.out.println("Event Delete Successfully");
				} else {
					System.out.println("Event not detelted");

				}
				break;
			case 2:
				System.out.println("All Event are below");
				list = new ArrayList<Event>();
				list = es.listAllEvent();

				System.out.println("eid" + "\t" + "name" + "\t" + "edate" + "\t" + "venue" + "\t" + "capacity");
				list.forEach((e1) -> System.out.println(e1.getEid() + "\t" + e1.getName() + "\t" + e1.getEdate() + "\t"
						+ e1.getVenue() + "\t" + e.getCapacity()));

				// list.forEach((e)->sop(e.getId()+"\t"+e.getName()+"\t"+e.getSal()));

//				emp e=new Emp()=>1,sai ,123
//						sop(e.getId()+"\t"+e.getName()+"\t"+e.getSal());

				break;
			case 3:
				System.out.println("All Upcoming Event from Today");
				list = new ArrayList<>();
				list = es.listUpcoming();

				System.out.println("eid" + "\t" + "name" + "\t" + "edate" + "\t" + "venue" + "\t" + "capacity");
				list.forEach((e1) -> System.out.println(e1.getEid() + "\t" + e1.getName() + "\t" + e1.getEdate() + "\t"
						+ e1.getVenue() + "\t" + e.getCapacity()));
				break;
				
			case 5:
				System.out.println("Enter event id to update event");
				 eid=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Details of "+eid);
				System.out.println("Enter name");
				name=sc.nextLine();
				System.out.println("Enter Date");
				String inputDate1 = sc.nextLine();
				// need to convert sting into java.sql.Date
				// if we not convert this sting into date then value is not inserted in
				// DB and we get exception : java.sql.SQLException: Data truncated for column
				// 'edate'
				java.sql.Date eventDate1 = java.sql.Date.valueOf(inputDate1);
				System.out.println("Enter Venue");
				venue=sc.nextLine();
				System.out.println("Enter Capacity");
				capacity=sc.nextInt();
				e.setName(name);
				e.setEdate(eventDate1);
				e.setVenue(venue);
				e.setCapacity(capacity);
				e.setEid(eid);
				b=es.updateEvent(e);
				if(b==true)
				{
					System.out.println("eid" + "\t" + "name" + "\t" + "edate" + "\t" + "venue" + "\t" + "capacity");

					System.out.println(e.getEid()+"\t"+e.getName()+"\t"+e.getEdate()+"\t"+e.getVenue()+"\t"+e.getCapacity());
					//object print zala
					System.out.println("Update succesfully");
				}
				else {
					System.out.println("Not Update");

				}
				break;
			case 6:
				home = false;
			}

		} while (home == true);
	}

}
