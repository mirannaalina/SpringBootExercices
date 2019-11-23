package com.BigProj.demo.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Book {

    private final String name;
    private final int price;
    private final String author;


    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
