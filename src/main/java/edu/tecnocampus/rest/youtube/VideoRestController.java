package edu.tecnocampus.rest.youtube;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/users/{userId}/videos")
public class VideoRestController {

    private UserService userService;

    public VideoRestController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public Video uploadVideo(@PathVariable String userId, @RequestBody Video videoToUpload) throws Exception {
        return userService.uploadVideo(userId, videoToUpload);
    }

    @GetMapping
    public List<Video> getVideosOfUser(@PathVariable String userId) throws Exception {
        return userService.getVideosOfUser(userId);
    }

    @GetMapping("/{videoId}")
    public Video getVideoOfUser(@PathVariable String userId, @PathVariable String videoId) throws Exception {
        return userService.getVideoOfUser(userId, videoId);
    }

    @DeleteMapping
    public void deleteVideosOfUser(@PathVariable String userId) throws Exception {
        userService.deleteVideosOfUser(userId);
    }

    @PostMapping("/{videoId}")
    public Rating rateVideo(@PathVariable String userId,@PathVariable String videoId,@RequestBody Rating rating) throws Exception {
        return userService.rateVideo(userId,videoId,rating);
    }



}
