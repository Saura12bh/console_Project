package service;
import model.*;
import java.util.*;
public interface EventService {

	public boolean addEvent(Event e);
	public boolean deleteEvent(int eid);
	public boolean updateEvent(Event e);
	//aplya kde eid ,name,date etc ani te sagle event madhe store ani apn pojo
	//sarkha yek line cha data datbase madhun gheto ani list store krto
	public List<Event> listAllEvent();
	public List<Event>  listUpcoming();
}
