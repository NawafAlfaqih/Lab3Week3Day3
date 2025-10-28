package org.example;

import java.util.ArrayList;

public class Book extends Media{

    private int stock;
    private ArrayList<Review> review = new ArrayList<>();

    public Book () {}

    public Book (String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = review;
    }

    public int getStock() {
        return stock;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public void addReview(Review r) {
        review.add(r);
    }

    public double getAverageRating() {
        double avg = 0;
        for(Review r: review){
            avg += r.getRating();
        }
        return avg / review.size();
    }

    public void purchase(User user) {
        user.addToCart(this);
        stock--;
    }

    public boolean isBestSeller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocking "+stock+" is done successfully.....");
    }

    public String getMediaType() {
        if(isBestSeller())
            return "Bestselling Book";
        else
            return "Book";
    }

    public String toString() {
        return "Book -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice()
                +" Stock: "+ getStock() +" Average Rating -> "+ getAverageRating();
    }
}
