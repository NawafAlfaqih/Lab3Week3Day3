package org.example;

public class Media {

    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    public Media() {}

    public Media(String title, String auteur, String ISBN, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        try {
            if (price < 0)
                throw new IllegalArgumentException();
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println("Price can't be negative....");
        }
    }

    public String getMediaType() {
        return "Media";
    }

    public String toString() {
        return "Media -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice();
    }
}
