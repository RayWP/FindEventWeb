/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.EventDAO;
import Database.MyDatabase;
import Entity.Event;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class EventDAOImpl implements EventDAO{

    public int insert(Event event) {
        int result = 0;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "INSERT INTO event(name, description, date, holder_id, link, speaker, image_path) VALUES(?,?,?,?,?,?,?)";
            result = qr.execute(sql, event.getName(), event.getDescription(), event.getDate(), event.getHolder_id(), event.getLink(), event.getSpeaker(), event.getImage_path() );
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return result;
    }
    
    
    public List<Event> getAllEvent() {
        List<Event> event_list = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "SELECT * FROM event WHERE date > CURDATE() ORDER BY date ASC";
            event_list = qr.query(sql, new BeanListHandler<Event>(Event.class));
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event_list;
    }

    public List<Event> getEventWithName(String name) {
        List<Event> event_list = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
//            String sql = "SELECT * FROM event WHERE name LIKE ?";
            String sql = "SELECT * FROM event WHERE name LIKE " + "'%"+name+"%' AND date > CURDATE() ORDER BY date ASC";
            event_list = qr.query(sql, new BeanListHandler<Event>(Event.class));
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        
        return event_list;
    }

    public Event getEventWithId(int id) {
        Event event = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "SELECT * FROM event WHERE id = ?";
            event = qr.query(sql, new BeanHandler<Event>(Event.class), id);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event;
    }

    public int delete(Event event) {
        int result = 0;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "DELETE FROM event WHERE id = ? AND holder_id = ?";
            result = qr.execute(sql, event.getId(), event.getHolder_id() );
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return result;
    }


	@Override
	public List<Event> getEventMadeBy(int holder_id) {
		List<Event> event_list = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "SELECT * FROM event WHERE holder_id = ? ORDER BY date ASC";
            event_list = qr.query(sql, new BeanListHandler<Event>(Event.class), holder_id);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event_list;
	}



}
