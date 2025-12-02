package service;

import java.util.List;
import repository.*;
import model.Event;

public class EventServiceImpl implements EventService {
    EventRepo er=new EventRepoImpl();
	@Override
	public boolean addEvent(Event e) {
		// TODO Auto-generated method stub
		return er.addEvent(e);
	}

	@Override
	public boolean deleteEvent(int eid) {
		// TODO Auto-generated method stub
		return er.deleteEvent(eid);
	}

	@Override
	public boolean updateEvent(Event e) {
		// TODO Auto-generated method stub
		return er.updateEvent(e);
	}

	@Override
	public List<Event> listAllEvent() {
		// TODO Auto-generated method stub
		return er.listAllEvent();
	}

	@Override
	public List<Event> listUpcoming() {
		// TODO Auto-generated method stub
		return er.listUpcoming();
	}

}
