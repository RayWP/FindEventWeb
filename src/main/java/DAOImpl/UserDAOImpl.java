/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.UserDAO;
import Database.MyDatabase;
import Entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class UserDAOImpl implements UserDAO{

    public int insert(User user) {
        int result = 0;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "INSERT INTO event(username, password, email, image_path, description) VALUES(?,?,?,?,?)";
            result = qr.execute(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getImage_path(), user.getDescription());
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return result;
    }

    public User getUserWith(int id) {
        User user = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "SELECT * FROM user WHERE id = ?";
            user = qr.query(sql, new BeanHandler<User>(User.class), id);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return user;
    }

    public int update(User user) {
        int result = 0;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "UPDATE USER SET username = ?, description = ? , password = ? WHERE id = ?";
            result = qr.execute(sql, user.getUsername(), user.getDescription(), user.getPassword(), user.getId());
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return result;
    }

    public User getUserWith(String email, String password) {
        User user = null;
        try {
            QueryRunner qr = new QueryRunner(MyDatabase.getDataSource());
            String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
            user = qr.query(sql, new BeanHandler<User>(User.class), email, password);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+ " erorr: " + e.getMessage());
        }
        return user;
    }
    
}
