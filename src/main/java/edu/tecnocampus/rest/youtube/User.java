package edu.tecnocampus.rest.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private int MIN_CHARACTERS_PASSWORD = 7;
    private String id = UUID.randomUUID().toString();
    private String email;
    private String name;
    private String password;
    private List<Video> videoList = new ArrayList<>();

    public User(String email, String name, String password) throws Exception {
        checkEmail(email);
        checkPassword(password);
        this.email = email;
        this.name = name;
        this.password = password;
    }

    private void checkPassword(String password) throws Exception {
        if(password.length()<MIN_CHARACTERS_PASSWORD) throw new Exception("Contraseña muy corta");
        if(password.matches(".*\\d.*")) throw new Exception("Contraseña no tiene numero");
    }

    private void checkEmail(String email) throws Exception {
        if(!email.contains("@")) throw new Exception("Email incorrecto");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void uploadVideo (Video video) {

        videoList.add(video);

    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }
}
