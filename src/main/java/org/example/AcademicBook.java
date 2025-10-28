package org.example;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook() {}

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMediaType() {
        if(isBestSeller())
            return "Bestselling Academic Book";
        else
            return "Academic Book";
    }

    public String toString() {
        return "Book -> Title: " + getTitle() +", Auteur: "+ getAuteur() +", ISPN: "+ getISBN() +", Price: "+ getPrice()
                +"\n Stock: "+ getStock() +" Average Rating -> "+ getAverageRating() +" Subject -> "+ getSubject();
    }
}
