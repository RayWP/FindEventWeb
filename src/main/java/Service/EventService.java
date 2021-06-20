/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAOImpl.EventDAOImpl;
import Entity.Event;

import java.io.File;
import java.util.Date;
import java.util.List;
import org.junit.Test;

import java.util.Calendar;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class EventService {
    public static String createEvent(Event event){
        int result = new EventDAOImpl().insert(event);
        if(result <= 0 ){
            System.out.println("Failed to create event");
            return "Failed to create event";
        } else {
            System.out.println("Success to create event");
            return "Success to create event";
        }
        
    }
    
    @Test
    public void testRunner(){
//        Calendar cd = new Calendar.Builder().setDate(2020, 3, 13).build();
//        Date date = cd.getTime();
//        Event event = new Event("GCO", "DESC 1", date,1 , "www.com", "Userpath"+File.separator+"test", "Dalang");
//        createEvent(event);
//    	findAll();
//    	findEventWith(26);
//    	findEventWith(1);
    	findEventMadeBy(1);
    }

	public static List<Event> findAll() {
		List<Event> all_events = new EventDAOImpl().getAllEvent();
		System.out.println("all events: " + all_events);
		return all_events;
	}

	public static Event findEventWith(int id) {
		Event event = new EventDAOImpl().getEventWithId(id);
		System.out.println("get event from findeventwithid: " + event);
		return event;
	}

	public static List<Event> findEventMadeBy(int holder_id) {
		List<Event> all_events = new EventDAOImpl().getEventMadeBy(holder_id);
		System.out.println("all events: " + all_events);
		return all_events;
	}

	public static String delete(Event delete_event) {
		int result = new EventDAOImpl().delete(delete_event);
		if(result<=0) {
			System.out.println("failed delete event");
			return "failed delete event";
		} else {
			System.out.println("sukses delete event");
			return "sukses delete event";
		}
	}
}
