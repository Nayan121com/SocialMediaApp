package com.example.SocialMediaApp.Users;

import java.time.LocalDateTime;
import java.util.*;

public class UserDAOService {

    private static Map<Integer, User> userList = new HashMap<>();
    private static int userCount = 0;

    static {
        userList.put(++userCount, new User(userCount, "Nayan Gupta", LocalDateTime.now()));
        userList.put(++userCount, new User(userCount, "Rounak Kumar", LocalDateTime.now()));
        userList.put(++userCount, new User(userCount, "Aditya Vashist", LocalDateTime.now()));
        userList.put(++userCount, new User(userCount, "Uday Kumar", LocalDateTime.now()));
        userList.put(++userCount, new User(userCount, "Dhruv Mehta", LocalDateTime.now()));
        userList.put(++userCount, new User(userCount, "Yash Pandya", LocalDateTime.now()));
    }

    //save user
    public User save(@org.jetbrains.annotations.NotNull User user){
        user.setId(++userCount);
        userList.put(userCount, user);
        return user;
    }
    //FetchAllUser
    public List<User> fetchAllUser(){
        List<User> allUsers = new ArrayList<>();
        for(Map.Entry<Integer, User> user : userList.entrySet()){
            allUsers.add(user.getValue());
        }
        return allUsers;
    }
    //findOne User
    public User findUser(int id){
        return userList.getOrDefault(id, null);
    }
    //Delete User
    public void deleteUser(int id){
        userList.remove(id);
    }
}
