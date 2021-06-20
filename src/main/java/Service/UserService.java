/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAOImpl.UserDAOImpl;
import Entity.User;
import org.junit.Test;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class UserService {
    public static void register(User user){
        int result = new UserDAOImpl().insert(user);
        if(result<=0) {
            System.out.println("Failed to create user");
        } else {
            System.out.println("Success create user");
        }
    }
    
    public static User login(User user) {
        User logged_user = new UserDAOImpl().getUserWith(user.getEmail(), user.getPassword());
        if(logged_user == null) {
            System.out.println("User not found");
            return null;
        } else {
            System.out.println("User found: " + logged_user.toString());
            return logged_user;
        }
    }
    
//    
    public static User findUserWith(int id) {
        User logged_user = new UserDAOImpl().getUserWith(id);
        if(logged_user == null) {
            System.out.println("User not found");
            return null;
        } else {
            System.out.println("User found: " + logged_user.toString());
            return logged_user;
        }
    }
    
//    Tested, to update user
    public static int update(User user){
        int result = new UserDAOImpl().update(user);
        if(result<=0) {
            System.out.println("Failed to update user");
        } else {
            System.out.println("Success to update user");
        }
        return result;
    }
    
    @Test
    public void testRunner(){
        User user = findUserWith(3);
//        user.setPassword("new pass");
//        user.setDescription("new desc juga");
//        user.setUsername("new name dong");
//        update(user);
        user.setEmail("newmail@gmail.com");
        user.setPassword("12345678");
        user = login(user);
    }
}
