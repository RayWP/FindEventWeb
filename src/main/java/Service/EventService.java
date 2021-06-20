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
        Calendar cd = new Calendar.Builder().setDate(2020, 3, 13).build();
        Date date = cd.getTime();
        Event event = new Event("GCO", "DESC 1", date,1 , "www.com", "Userpath"+File.separator+"test", "Dalang");
        createEvent(event);
    }
}
