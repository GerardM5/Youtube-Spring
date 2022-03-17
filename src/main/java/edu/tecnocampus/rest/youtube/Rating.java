package edu.tecnocampus.rest.youtube;

import java.util.UUID;

public class Rating {
    private String id = UUID.randomUUID().toString();
    private int rating;
    private String comment;

    public Rating() {

    }

    public Rating(int rating, String comment) throws Exception {
        checkRating(rating);
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private void checkRating(int rating) throws Exception {
        if (rating > 5 || rating < 1) throw new Exception("Error en la valoración");
    }
}
