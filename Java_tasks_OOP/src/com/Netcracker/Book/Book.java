package com.Netcracker.Book;

import com.Netcracker.Author.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price = 0;
    private int qty;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        if(price > 0)
            this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        if(price > 0)
            this.price = price;
        if(qty > 0)
            this.qty = qty;
    }

    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void setPrice(double price){
        if(price >= 0)
            this.price = price;
    }
    public void setQty(int qty){
        if(qty >= 0)
            this.qty = qty;
    }

    public String getAuthorNames(){
        String authorNames = "unknown";
        if(authors.length > 0) {
            authorNames = "1. " + authors[0].getName();
            for (int i = 1; i < authors.length; i++) {
                authorNames += ", " + (i+1) + ". " +
                        authors[i].getName();
            }
        }
        return authorNames;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof  Book)){
            return false;
        }

        Book book = (Book) obj;
        if(this.authors.length != book.authors.length){
            return false;
        }

        return this.name.equals(book.name) &&
                Arrays.deepEquals(this.authors, book.authors) &&
                this.price == book.price &&
                this.qty == book.qty;
    }

    @Override
    public int hashCode(){
        int hashCode = 23;
        long longPrice = Double.doubleToLongBits(price);

        hashCode = 31 * hashCode + name.hashCode();
        hashCode = 31 * hashCode + Arrays.deepHashCode(authors);
        hashCode = 31 * hashCode + (int)(longPrice^(longPrice >> 32));
        hashCode = 31 * hashCode + qty;

        return hashCode;
    }

    @Override
    public String toString(){
        String authorsStr = "unknown";
        if(authors.length > 0) {
            authorsStr = authors[0].toString();
            for (int i = 1; i < authors.length; i++) {
                authorsStr += ", " + authors[i].toString();
            }
        }

        return   "Book[name = " + name + ", authors = {" + authorsStr +
                  "}, price = " + price + ", qty = " + qty;
    }
}
