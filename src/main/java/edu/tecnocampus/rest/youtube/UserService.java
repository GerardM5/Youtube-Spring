package edu.tecnocampus.rest.youtube;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userList = new ArrayList<>();

    public User findUser(String userId) throws Exception {

        for (User user : userList) {
            if (user.getName().equals(userId)) {
                return user;
            }
        }
        throw new Exception("No s'ha trobat");
    }

    public User createUser(User userToCreate){

        userList.add(userToCreate);
        return userToCreate;
    }
}
