package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        User u1 = new User("Mohammed", "mo@email.com");
        User u2 = new User("Ahmad", "ah@email.com");
        User u3 = new User("Khaled", "kh@email.com");

        store.addUser(u1);
        store.addUser(u2);
        store.addUser(u3);

        System.out.println("Users: ");
        for (User u : store.getUser()) {
            System.out.println(u.getUsername() + " " + u.getEmail());
        }

        System.out.println();

        //Book and AcademicBook and Novel Objects
        Book b1 = new Book("Atomic Habits", "Robert", "11253524", 45, 5);
        AcademicBook b2 = new AcademicBook("Intro to Algorithms", "Sam", "3684364", 30, 2, "Computer Science");
        Novel n1 = new Novel("Game of Thrones", "G.R.R. Marten", "25474561", 15.5, 10, "Fantasy");

        //Music
        Music mu1 = new Music("Blues", "David", "6016304", 12.5);
        Music mu2 = new Music("Jazz", "Michele", "8791813", 4.9);
        Music mu3 = new Music("Classical", "David", "86752", 19.9);
        Music mu4 = new Music("Rock", "David", "4545463", 20.9);

        //Movie
        Movie mv1 = new Movie("Intersteler", "Nolan", "461584", 20, 110);
        Movie mv2 = new Movie("Toy Story", "Pixar", "3642814", 18, 70);
        Movie mv3 = new Movie("Inception", "Nolan", "8674543", 21, 112);
        Movie mv4 = new Movie("Oppenheimer", "Nolan", "2448784", 17.5, 115);

        store.addMedia(b1);
        store.addMedia(b2);
        store.addMedia(n1);
        store.addMedia(mu1);
        store.addMedia(mu2);
        store.addMedia(mu3);
        store.addMedia(mu4);
        store.addMedia(mv1);
        store.addMedia(mv2);
        store.addMedia(mv3);
        store.addMedia(mv4);

        System.out.println("Store Inventory: ");
        store.displayMedias();

        System.out.println();

        //Review Test
        Review r1 = new Review("Mohammed", 5, "The best Book");
        Review r2 = new Review("Ahmad", 4.5, "Great");
        Review r3 = new Review("Khaled", 3.5, "Good, but a bit long");

        b1.addReview(r1);
        b1.addReview(r2);
        b1.addReview(r3);

        System.out.println("Reviews for b1: ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("Average rating for b1 = " + b1.getAverageRating());

        System.out.println("b1 media type: " + b1.getMediaType());
        System.out.println("n1 media type: " + n1.getMediaType());

        System.out.println();

        //Error Handling using try and catch
        System.out.println("Testing Error Handling: ");
        b1.setPrice(-10);
        b1.setStock(-3);
        System.out.println(b1); //data after test

        System.out.println();

        //Testing Restock
        System.out.println("Restock b1 by 10: ");
        b1.restock(10);
        System.out.println("New stock for b1: " + b1.getStock());

        System.out.println();

        //Check Type Of Media
        System.out.println("Media Type: ");
        System.out.println(mu1.getTitle() + " -> " + mu1.getMediaType());
        System.out.println(mu2.getTitle() + " -> " + mu2.getMediaType());
        System.out.println(mv1.getTitle() + " -> " + mv1.getMediaType());
        System.out.println(mv2.getTitle() + " -> " + mv2.getMediaType());

        System.out.println();

        // Test Shopping Cart
        System.out.println("Shopping Cart of " + u1.getUsername() + ": ");
        u1.addToCart(b1);
        u1.addToCart(mu1);
        u1.addToCart(mv2);


        System.out.println("Cart size: " + u1.getShoppingCart().size());
        System.out.println("Cart items: " + u1.getShoppingCart());

        u1.removeFromCart(mu1);
        System.out.println("Cart after removing one item: " + u1.getShoppingCart().size());

        u1.checkout();
        System.out.println("Purchased items: " + u1.getPurchaseMediaList());
        System.out.println("Cart size: " + u1.getShoppingCart().size());


        System.out.println();


        //Test Playlist and RecommendedMovies and SearchBook Methods
        ArrayList<Movie> movieList = store.getMovieList();
        ArrayList<Music> musicList = store.getMusicList();

        System.out.println("Recommended Movies based on mv1's Director '"+mv1.getAuteur()+"': ");
        for (Movie m : mv1.recommendSimilarMovies(movieList)) {
            System.out.println(m);
        }

        System.out.println();

        System.out.println("Generated Playlist based on mu1's Artist '"+mu1.getArtist()+"': ");
        for (Music m : mu1.generatePlaylist(musicList)) {
            System.out.println(m);
        }

        System.out.println();

        System.out.println("Searching for '"+b1.getTitle()+"': ");
        System.out.println(store.searchBook(b1.getTitle()));

        System.out.println();

        System.out.println("Searching for 'Morning's Miracle': ");
        System.out.println(store.searchBook("Morning's Miracle"));
    }
}