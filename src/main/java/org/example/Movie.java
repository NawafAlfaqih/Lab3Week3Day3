package org.example;

import java.util.ArrayList;

public class Movie extends Media {

    private int duration;

    public Movie() {}

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        try {
            if (duration < 0)
                throw new IllegalArgumentException();
            this.duration = duration;
        } catch (IllegalArgumentException e) {
            System.out.println("Duration can't be negative....");
        }
    }

    public void watch(User user) {
        user.checkout(this);
        System.out.println(user.getUsername()+ " is Watching: "+ getTitle() +", it is "+ getDuration() +" Minutes Long");

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> playlist = new ArrayList<>(movieCatalog);
        playlist.removeIf(m -> !(m.getAuteur().equals(getAuteur()))); //lambda Expression
        return playlist;
    }

    public String getMediaType() {
        if(getDuration() >= 120)
            return "Long Movie";
        else
            return "Movie";
    }

    public String toString() {
        return "Music -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice()
                +" Movie Duration: "+ getDuration();
    }
}
