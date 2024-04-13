package com.example.SocialMediaApp.Users;

import java.time.LocalDateTime;
import java.util.Date;

public class User {

    private int id;
    private String name;
    private LocalDateTime birthday;

    public User(int id, String name, LocalDateTime birthday){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    //Getter for id, name, birthday
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public LocalDateTime getBirthday(){
        return birthday;
    }

    //Setter for id, name, Birthday
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthday(LocalDateTime birthday){
        this.birthday = birthday;
    }
}
