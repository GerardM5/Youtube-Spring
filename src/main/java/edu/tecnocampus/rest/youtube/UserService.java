package edu.tecnocampus.rest.youtube;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    private User findUser(String userId) throws Exception {

        for (User user : userList) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("No se ha encontrado el user");
    }

    public User createUser(User userToCreate) throws Exception {
        userToCreate.validateData();
        userList.add(userToCreate);
        return userToCreate;
    }

    public Video uploadVideo(String userId, Video videoToUpload) throws Exception {

        return findUser(userId).uploadVideo(videoToUpload);

    }

    public List<Video> getVideosOfUser(String userId) throws Exception {
        return findUser(userId).getVideoList();
    }

    public Video getVideoOfUser(String userId, String videoId) throws Exception {
        return findVideo(videoId, findUser(userId));
    }

    private Video findVideo(String videoId, User user) throws Exception {
        for (Video video : user.getVideoList()) {
            if (video.getId().equals(videoId)) return video;
        }
        throw new Exception("No se ha encontrado el video");
    }

    public void deleteVideosOfUser(String userId) throws Exception {
        findUser(userId).getVideoList().clear();
    }

    public User updateUser(String userId, User newUser) throws Exception {
        User userUpdated = findUser(userId);
        userUpdated.setEmail(newUser.getEmail());
        userUpdated.setName(newUser.getName());
        userUpdated.setPassword(newUser.getPassword());
        return userUpdated;
    }

    public Rating rateVideo(String userId, String videoId, Rating rating) throws Exception {
        return findVideo(videoId, findUser(userId)).rateVideo(rating);
    }
}
