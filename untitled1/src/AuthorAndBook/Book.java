package AuthorAndBook;

import AuthorAndBook.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtlynStock;

    public Book(String name,Author author,double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name,Author author,double price,int qtlynStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtlynStock = qtlynStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtlynStock(int qtlynStock) {
        this.qtlynStock = qtlynStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtlynStock() {
        return qtlynStock;
    }
    public String toString() {

        return "book name "+name+" "+author;
    }
}
