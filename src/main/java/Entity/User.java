/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String image_path;
    private String description;

    public User() {
    }
    
    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }   
    
    public User(String username, String password, String email, String image_path, String description) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.image_path = image_path;
        this.description = description;
    }

    public User(int id, String username, String password, String email, String image_path, String description) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.image_path = image_path;
        this.description = description;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", image_path=" + image_path + ", description=" + description + '}';
    }
    
    
    
    
}
