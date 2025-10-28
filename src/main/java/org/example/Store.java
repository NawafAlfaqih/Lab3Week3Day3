package org.example;

import java.util.ArrayList;

public class Store {

    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Media> media = new ArrayList<>();

    public Store() {}

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.media = media;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addUser(User u) {
        user.add(u);
    }

    public void displayUsers() {
        for(int i = 0; i < user.size(); i++){
            System.out.println("User "+(i+1)+": ");
            System.out.println(user.get(i));
        }
    }

    public void addMedia(Media m) {
        media.add(m);
    }

    public void displayMedias() {
        for(int i = 0; i < media.size(); i++){
            System.out.println("Media "+(i+1)+": ");
            System.out.println(media.get(i));
        }
    }

    public Book searchBook(String title) {
        for(Media m: media)
            if(m instanceof Book && m.getTitle().equals(title))
                return (Book) m;
        System.out.println("Book " +title+" was not found....");
        return null;
    }
}
