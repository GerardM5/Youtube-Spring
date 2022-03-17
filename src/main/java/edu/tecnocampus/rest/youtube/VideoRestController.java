package edu.tecnocampus.rest.youtube;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoRestController {



    @PostMapping("/users/{UserId}/videos")
    public Video uploadVideo(@PathVariable String userId, @RequestBody Video videoToUpload) throws Exception {
        new VideoService().uploadVideo(userId, videoToUpload);
        return videoToUpload;
    }




}
