package com.BigProj.demo.books;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final Book defaultBook;

    @Autowired
    public BookService(@Value("${default.name}") String defaultBookName,
                       @Value("${default.price}") int defaultPrice,
                       @Value("${default.author}") String defaultAuthor){

        defaultBook =  new Book(defaultBookName,defaultPrice,defaultAuthor);
        //System.out.println(defaultBook.toString());
    }

    public Book findByName(String name){
        switch (name){
            case " Drama" : return new Book("Crima Si Pedeapsa",20,"Dovstoiesky");
            case " Dezvoltare" : return new Book("Paradoxul cimpanzeului",90,"Unamed");
            default: return defaultBook;

        }
    }

}
