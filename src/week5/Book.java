package week5;

public class Book {

    private String title;

    private String author;

    private double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice(){
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {    // FOCUS ON THIS    MAKE SURE IT IS IN THE RIGHT CLASS
        return "(Title: "+ this.title+ ". Author: "+this.author+". Price: "+ this.price+")";
    }
}
