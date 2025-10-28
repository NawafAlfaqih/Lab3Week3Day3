package org.example;

public class Novel extends Book{

    private String genre;

    public Novel() { }

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType() {
        if(isBestSeller())
            return "Bestselling Novel";
        else
            return "Novel";
    }

    public String toString() {
        return "Book -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice()
                +" Stock: "+ getStock() +" Average Rating -> "+ getAverageRating() +" Genre -> "+ getGenre();
    }


}
