package org.example;

import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User() {}

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        try {
            if(email.contains("@"))
                this.email = email;
            else
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Email is not correct...");
        }
    }

    public void setPurchasedMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout(Media media) {
        purchaseMediaList.add(media);
    }

    public void checkout() {
        purchaseMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }

    public String toString() {
        return "User -> Username: " + getUsername() +", Email: "+ getEmail() +
                ", PurchasedMedia: "+ getPurchaseMediaList() +", ShoppingCart: "+ getShoppingCart();
    }
}
