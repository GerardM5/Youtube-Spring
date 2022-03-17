package edu.tecnocampus.rest.youtube;

import java.util.List;
import java.util.UUID;

public class Video {
    private int MIN_CHARACTERS_TITLE = 10;
    private String id = UUID.randomUUID().toString();
    private String url;
    private String title;
    private String description;
    private List<Rating> ratingList;

    public Video(String url, String title, String description) throws Exception {
        checkUrl(url);
        checkTitle(title);
        this.url = url;
        this.title = title;
        this.description = description;
    }

    private void checkTitle(String title) throws Exception {
        if(url.length()<MIN_CHARACTERS_TITLE) throw new Exception("Titulo muy corto");
    }

    private void checkUrl(String url) throws Exception {
        if(!url.contains("www.")) throw new Exception("No es una URL valida");
    }
}
