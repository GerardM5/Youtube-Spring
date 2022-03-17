package edu.tecnocampus.rest.youtube;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public User createUser(@RequestBody User userToCreate) throws Exception {

        return userService.createUser(userToCreate);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable String userId,@RequestBody User newUser) throws Exception {
        return userService.updateUser(userId, newUser);
    }

}
