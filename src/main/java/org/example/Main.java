package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Store Test
        Store s1 = new Store();

        User u1 = new User("Mohammed", "mo@email.com");
        User u2 = new User("Ahmad", "ah@email.com");
        User u3 = new User("Khaled", "kh@email.com");

        s1.addUser(u1);
        s1.addUser(u2);
        s1.addUser(u3);

        s1.displayUsers();

        Media m1 = new Media("31 Rooms", "Mohammed", "7428108", 17);
        Media m2 = new Media("Portal", "Gape Nowell", "170187", 20);
        Media m3 = new Media("Games", "Abdullah", "4780509", 10);

        Music mu1 = new Music("123", "Ywuach", "1347902", 12);
        Book b1 = new Book("Morning miracle", "Jack", "3479580", 30, 10);
        Movie mov1 = new Movie("Interstellar", "Nolan", "2478931", 15, 160);

        s1.addMedia(m1);
        s1.addMedia(m2);
        s1.addMedia(m3);
        s1.addMedia(mu1);
        s1.addMedia(b1);
        s1.addMedia(mov1);

        s1.displayMedias();


        //User Test
        u1.addToCart(m1);
        u1.addToCart(mu1);
        u1.addToCart(mov1);
        u1.addToCart(b1);

        System.out.println(u1.getShoppingCart());

        u1.removeFromCart(mu1);
        u1.checkout();

        u1.addToCart(m3);
        System.out.println(u1.getShoppingCart());
        System.out.println(u1.getPurchaseMediaList());

        u1.checkout();

        System.out.println(u1.getShoppingCart());
        System.out.println(u1.getPurchaseMediaList());


        //Music Test
        ArrayList<Music> musicCatalog = new ArrayList<>();

        Music mu2 = new Music("Bereave", "Eminem", "048034", 8);
        Music mu3 = new Music("Sonic", "Eminem", "656565", 6);

        musicCatalog.add(mu1);
        musicCatalog.add(mu2);
        musicCatalog.add(mu3);
        System.out.println(mu2.generatePlaylist(musicCatalog));

        System.out.println(mu1.getMediaType());

        mu3.listen(u2);
        System.out.println(u2.getPurchaseMediaList());


        //Movie Test
        ArrayList<Movie> movieCatalog = new ArrayList<>();

        Movie mov2 = new Movie("Friends", "John", "4398365", 2, 200);
        Movie mov3 = new Movie("Breaking", "Cress", "8642865", 13, 90);

        movieCatalog.add(mov1);
        movieCatalog.add(mov2);
        movieCatalog.add(mov3);

        System.out.println(mov2.recommendSimilarMovies(movieCatalog));

        System.out.println(mov1.getMediaType());

        mov3.watch(u3);
        System.out.println(u2.getPurchaseMediaList());

        //Book, Novel, AcademicBook and Review Test
        Novel no1 = new Novel("Game of thrones", "Gorge", "689023", 9, 28, "Fantasy" );
        AcademicBook ac1 = new AcademicBook("Atomic Habits", "Mark", "689023", 9, 28, "Self-Development");

        Review r1 = new Review("K.S43", 4.9, "Very Great Book");
        Review r2 = new Review("BookWorm2050", 3.7, "doesn't have great value, but it is enjoyable");
        Review r3 = new Review("AboSalem001", 5, "The best book!!!");

        b1.addReview(r1);
        b1.addReview(r2);
        b1.addReview(r3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("Avg rating of b1= "+ b1.getAverageRating());
        System.out.println(b1.getMediaType());

        b1.restock(10);

    }
}