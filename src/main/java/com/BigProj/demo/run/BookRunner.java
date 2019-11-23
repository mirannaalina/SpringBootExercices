package com.BigProj.demo.run;

import com.BigProj.demo.books.Book;
import com.BigProj.demo.books.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BookRunner implements CommandLineRunner{

    private final BookService bookService;

    @Autowired
    public BookRunner(BookService bookService) {
        this.bookService = bookService;
    }


    @Override
    public void run(String... args) throws Exception {

        Book book = bookService.findByName("Drama");
        System.out.println(book);

    }
}
