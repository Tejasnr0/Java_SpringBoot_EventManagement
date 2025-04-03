package edu.tejas.eventManagement.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sun.xml.internal.stream.Entity;

import edu.tejas.eventManagement.Entity.Event;

@Repository
public class EventDao {

	//for using this object to store we will get that object using the DependcyInjection 
	@Autowired
	private EntityManager em;
	
	public void saveEvent(Event ev) {
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(ev);
		
		et.commit();
	}
	
	public void DelteEvent(int id) {
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Event ev = em.find(Event.class, id);
		
		em.remove(ev);
		
		et.commit();
	}
	
	
	
}
