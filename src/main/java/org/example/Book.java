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
        try {
            if (stock < 0)
                throw new IllegalArgumentException();
            this.stock = stock;
        } catch (IllegalArgumentException e) {
            System.out.println("Stock can't be negative....");
        }
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public void addReview(Review r) {
        try {
            if (r.getRating() > 5 || r.getRating() < 0)
                throw new IllegalArgumentException();
            review.add(r);
        } catch (IllegalArgumentException e) {
            System.out.println("Rating is not in Range!!");
        }
    }

    public double getAverageRating() {
        double avg = 0;
        for(Review r: review){
            avg += r.getRating();
        }
        return avg / review.size();
    }

    public void purchase(User user) {
        user.checkout(this);
        stock--;
    }

    public boolean isBestSeller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        try {
            if(quantity < 1)
                throw new IllegalArgumentException();
            stock += quantity;
            System.out.println("Restocking "+stock+" is done successfully.....");
        } catch (IllegalArgumentException e) {
            System.out.println("Restocking number is not valid....");
        }

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
