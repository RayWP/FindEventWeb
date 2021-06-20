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
            String sql = "INSERT INTO event(name, description, date, holder_id, link, speaker, image_path) VALUES(?,?,?,?,?,?,?)";
//            result = qr.execute(sql, event.getName(), event.getDescription(), event.getDate(), event.getHolder_id(), event.getLink(), event.getSpeaker(), event.getImage_path() );
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event_list;
    }

    public List<Event> getEventWithName(String name) {
        List<Event> event_list = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "INSERT INTO event(name, description, date, holder_id, link, speaker, image_path) VALUES(?,?,?,?,?,?,?)";
//            result = qr.execute(sql, event.getName(), event.getDescription(), event.getDate(), event.getHolder_id(), event.getLink(), event.getSpeaker(), event.getImage_path() );
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event_list;
    }

    public List<Event> getEventWithId(int id) {
//        ganti bos;
        List<Event> event_list = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "INSERT INTO event(name, description, date, holder_id, link, speaker, image_path) VALUES(?,?,?,?,?,?,?)";
//            result = qr.execute(sql, event.getName(), event.getDescription(), event.getDate(), event.getHolder_id(), event.getLink(), event.getSpeaker(), event.getImage_path() );
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return event_list;
    }

    public int delete(Event event) {
//        ganti bos;
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
    
}
