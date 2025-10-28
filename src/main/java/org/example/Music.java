package org.example;

import java.util.ArrayList;

public class Music extends Media{

    private String artist;

    public Music() {}

    public Music(String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
        artist = auteur;
    }

    public String getArtist() {
        return getAuteur();
    }

    public void setArtist(String artist) {
        this.artist = artist;
        setAuteur(artist);
    }

    public void listen(User user) {
        user.checkout(this);
        System.out.println(user.getUsername()+ " is listening to: "+ getTitle() +" by "+ getArtist());
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {

        ArrayList<Music> playlist = new ArrayList<>(musicCatalog);
        playlist.removeIf(m -> !(m.getArtist().equals(getArtist()))); //lambda expression
        return playlist;
    }

    public String getMediaType() {
        if(getPrice() >= 10)
            return "Premium Music";
        else
            return "Music";
    }

    public String toString() {
        return "Music -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice()
                +" Artist: "+ getArtist();
    }
}
