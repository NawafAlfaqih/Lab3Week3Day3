package org.example;

public class Review {

    private String username;
    private double rating;
    private String comment;

    public Review () {}

    public Review (String username, double rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRating(double rating) {
        try {
            if (rating > 5 || rating < 0)
                throw new IllegalArgumentException();
            this.rating = rating;
        } catch (IllegalArgumentException e) {
            System.out.println("Rating is not in Range!!");
        }
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toString() {
        return "Review: " +
                "username: '" + username + '\'' +
                ", rating: " + rating +
                ", comment: '" + comment + '\'';
    }
}
