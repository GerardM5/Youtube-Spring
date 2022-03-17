package edu.tecnocampus.rest.youtube;

public class VideoService {
    public Video uploadVideo(String userId ,Video videoToUpload) throws Exception {
        User user = new UserService().findUser(userId);
        user.uploadVideo(videoToUpload);
        return videoToUpload;
    }

}
