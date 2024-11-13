package org.falcon.controller;

import org.falcon.comms.request.NewUserScoreRequest;
import org.falcon.entity.user.User;
import org.falcon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {
    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/user/scores")
    public ResponseEntity<List<User>> getUserScores() {

        List<User> allUsers = this.userService.getAllUsers();
        if (allUsers == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(allUsers);
    }

    @PostMapping("/user/score")
    public ResponseEntity<HttpStatus> addUserScore(@RequestBody NewUserScoreRequest user) {
        if (user == null || user.getScore() < 0 || Objects.equals(user.getUsername(), "")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        boolean isUserStored = this.userService.addUser(user);
        if (isUserStored) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }

}
