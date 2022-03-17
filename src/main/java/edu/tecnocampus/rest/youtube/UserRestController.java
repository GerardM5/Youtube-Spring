package edu.tecnocampus.rest.youtube;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserRestController {

    @PostMapping("/users")
    public User createUser(@RequestBody User userToCreate) {
        new UserService().createUser(userToCreate);
        return userToCreate;
    }

}
