package edu.tecnocampus.rest.youtube;

import java.util.List;
import java.util.UUID;

public class Video {
    private int MIN_CHARACTERS_URL = 10;
    private String id = UUID.randomUUID().toString();
    private String url;
    private String title;
    private String description;
    private List<Rating> ratingList;

    public Video(String url, String title, String description) throws Exception {
        checkUrl(url);
        this.url = url;
        this.title = title;
        this.description = description;
    }

    private void checkUrl(String url) throws Exception {
        if(!url.contains("www.")) throw new Exception("No es una URL valida");
        if(url.length()<MIN_CHARACTERS_URL) throw new Exception("No es una URL valida(muy corta)");
    }
}
