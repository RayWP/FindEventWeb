/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Event;
import java.util.List;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public interface EventDAO {
    public int insert(Event event);
    public List<Event> getAllEvent();
    public List<Event> getEventWithName(String name);
    public List<Event> getEventWithId(int id);
    public int delete(Event event);
    
}
