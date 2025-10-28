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
        for(Book b: getBookList())
            if(b.getTitle().equals(title))
                return b;
        System.out.println("Book " +title+" was not found....");
        return null;
    }

    //Extra Methods that helps in filtering
    public ArrayList<Book> getBookList() {
        ArrayList<Book> books = new ArrayList<>();
        for(Media m: media)
            if(m instanceof Book)
                books.add((Book)m);
        return books;
    }

    public ArrayList<Music> getMusicList() {
        ArrayList<Music> music = new ArrayList<>();
        for(Media m: media)
            if(m instanceof Music)
                music.add((Music)m);
        return music;
    }

    public ArrayList<Movie> getMovieList() {
        ArrayList<Movie> movie = new ArrayList<>();
        for(Media m: media)
            if(m instanceof Movie)
                movie.add((Movie)m);
        return movie;
    }
}
