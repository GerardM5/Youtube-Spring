package edu.tecnocampus.rest.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Video {
    private int MIN_CHARACTERS_TITLE = 10;
    private String id = UUID.randomUUID().toString();
    private String url;
    private String title;
    private String description;
    private List<Rating> ratingList= new ArrayList<>();

    public Video() {

    }

    public Video(String url, String title, String description) throws Exception {
        checkUrl(url);
        checkTitle(title);
        this.url = url;
        this.title = title;
        this.description = description;
    }


    private void checkTitle(String title) throws Exception {
        if (url.length() < MIN_CHARACTERS_TITLE) throw new Exception("Titulo muy corto");
    }

    private void checkUrl(String url) throws Exception {
        if (!url.contains("www.")) throw new Exception("No es una URL valida");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rating rateVideo(Rating rating) {
        ratingList.add(rating);
        return rating;
    }



    public List<Rating> getRatingList() {
        return ratingList;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
