package org.falcon.service;

import org.falcon.comms.request.NewUserScoreRequest;
import org.falcon.entity.user.User;
import org.falcon.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    public UserService() {}

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        this.userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addUserScore(NewUserScoreRequest newUser) {
        User user = this.userRepository.findByUsername(newUser.getUsername());
        if (user == null) {
            user = new User();
            user.setUsername(newUser.getUsername());
        }
        user.setScore(newUser.getScore());
        this.userRepository.save(user);
    }
}
