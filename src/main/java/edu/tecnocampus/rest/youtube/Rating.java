package edu.tecnocampus.rest.youtube;

public class Rating {
    private int rating;
    private String comment;

    public Rating() {

    }

    public Rating(int rating, String comment) throws Exception {
        checkRating(rating);
        this.rating = rating;
        this.comment = comment;
    }

    private void checkRating(int rating) throws Exception {
        if (rating > 5 || rating < 0) throw new Exception("Error en la valoración");
    }
}
