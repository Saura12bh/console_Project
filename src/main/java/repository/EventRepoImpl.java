package repository;
import databaseConfigration.*;
import java.util.*;

import model.Event;

public class EventRepoImpl  extends Dbconfig implements EventRepo {

	
	List<Event> list;
	@Override
	public boolean addEvent(Event e) {
		try {
			ps=con.prepareStatement("insert into event values('0',?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setDate(2,e.getEdate());
			ps.setString(3, e.getVenue());
			ps.setInt(4, e.getCapacity());
			int v=ps.executeUpdate();
			if(v>0)
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
			return false;
		}

	}

	@Override
	public boolean deleteEvent(int eid) {
		try {
			ps=con.prepareStatement("delete from event where eid=?");
			ps.setInt(1, eid);
			int v=ps.executeUpdate();
			if(v>0)
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

	}

	@Override
	public boolean updateEvent(Event e) {
		try {
			ps=con.prepareStatement("update event set name=?,edate=?,venue=?,capacity=? where eid=?");
			ps.setString(1,e.getName());
			ps.setDate(2,e.getEdate());
			ps.setString(3, e.getVenue());
			ps.setInt(4,e.getCapacity());
			ps.setInt(5, e.getEid());
			int v=ps.executeUpdate();
			if(v>0)
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
			return false;
		}
	}

	@Override
	public List<Event> listAllEvent() {
		//jevha apn ps excute kranr tevha database madhun row vice data anit to aplya list madhe
		//kryahcha ahe karan aplya method cha return type list 
		//List<Event> list=new ArrayList<Event>();
		try {
			list=new ArrayList<Event>();
			ps=con.prepareStatement("select * from event");
			rs=ps.executeQuery();
			while(rs.next())
			{
				//List madhe aplya row vice data store 
				Event e=new Event();
				
				e.setEid(rs.getInt(1));//
				e.setName(rs.getString(2));
				e.setEdate(rs.getDate(3));
				e.setVenue(rs.getString(4));
				e.setCapacity(rs.getInt(5));
				list.add(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
		return list;
	}

	@Override
	public List<Event> listUpcoming() {
		try {
			list=new ArrayList<>();
			ps=con.prepareStatement("select * from event where edate > curdate()");
			//curDate() function je ajjchi date det
			rs=ps.executeQuery();
			while(rs.next())
			{
				Event e=new Event();
				e.setEid(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEdate(rs.getDate(3));
				e.setVenue(rs.getString(4));
				e.setCapacity(rs.getInt(5));
				list.add(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
		return list;
	}

}
