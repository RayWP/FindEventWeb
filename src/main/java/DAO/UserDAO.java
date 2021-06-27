/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.User;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public interface UserDAO {   
    public int insert(User user);
    public User getUserWith(int id);
    public User getUserWith(String username, String password);
    public int update(User user);
    public int delete(int id);
    
}
