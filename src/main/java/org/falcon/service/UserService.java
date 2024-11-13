package org.falcon.service;

import org.falcon.comms.request.NewUserScoreRequest;
import org.falcon.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public UserService() {}

    public List<User> getAllUsers() {
        //use SQL to get a list of users from the database
        //this is just a placeholder
        List<User> users = new ArrayList<>();
        User user = new User();
        users.add(user);
        return users;
    }

    public boolean addUser(NewUserScoreRequest newUser) {
        User user = new User();
        user.setScore(user.getScore());
        user.setUsername(user.getUsername());
        //check to make sure user was properly stored in DB
        return true;
    }
}
