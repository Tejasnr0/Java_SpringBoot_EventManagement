package edu.tejas.eventManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tejas.eventManagement.DAO.EventDao;
import edu.tejas.eventManagement.Entity.Event;

@Service
public class EeventService {

	@Autowired
	EventDao dao;

	public void saveevent(Event ev) {
		System.out.println("its in server");
		if (ev.getId() > 0
				&& ev.getName() != null) {
			dao.saveEvent(ev);
		}else {
			System.out.println("its not valid");
		}
	}
	
	public void deleteEvent(int id) {
		if(id>0) {
			dao.DelteEvent(id);
		}
	}
}
