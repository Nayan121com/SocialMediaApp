package com.example.SocialMediaApp.Users;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAOService {

    private static List<User> userList = new ArrayList<>();
    private static int userCount = 0;

    static {
        userList.add(new User(userCount++, "Nayan Gupta", LocalDateTime.now()));
        userList.add(new User(userCount++, "Rounak Kumar", LocalDateTime.now()));
        userList.add(new User(userCount++, "Aditya Vashist", LocalDateTime.now()));
        userList.add(new User(userCount++, "Uday Kumar", LocalDateTime.now()));
        userList.add(new User(userCount++, "Dhruv Mehta", LocalDateTime.now()));
        userList.add(new User(userCount++, "Yash Pandya", LocalDateTime.now()));
    }

    //TODO: save user
    //TODO: FetchAllUsers
    //TODO: findOne User
    //TODO: Delete User

}
