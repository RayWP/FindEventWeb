/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
public class Event {
    private int id;
    private String name;
    private String description;
    private Date date;
    private int holder_id;
    private String link;
    private String image_path;
    private String speaker;
    
    public Event(){
        
    }

    
    
    public Event(int id, int holder_id) {
		super();
		this.id = id;
		this.holder_id = holder_id;
	}



	public Event(String name, String description, Date date, int holder_id, String link, String image_path, String speaker) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.holder_id = holder_id;
        this.link = link;
        this.image_path = image_path;
        this.speaker = speaker;
    }

    public Event(int id, String name, String description, Date date, int holder_id, String link, String image_path, String speaker) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.holder_id = holder_id;
        this.link = link;
        this.image_path = image_path;
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHolder_id() {
        return holder_id;
    }

    public void setHolder_id(int holder_id) {
        this.holder_id = holder_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", holder_id=" + holder_id + ", link=" + link + ", image_path=" + image_path + ", speaker=" + speaker + '}' + "\n";
    }
    
    
}
