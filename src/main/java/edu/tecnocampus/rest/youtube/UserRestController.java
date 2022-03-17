package edu.tecnocampus.rest.youtube;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {

    List<User> userList = new ArrayList<>();

    @PostMapping("/users")
    public User createUser(@RequestBody User userToCreate){
        userList.add(userToCreate);
        return userToCreate;
    }

}
