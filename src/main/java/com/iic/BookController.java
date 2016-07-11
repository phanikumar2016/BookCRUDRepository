package com.iic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 7/6/2016.
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookRepository bookRepository;



    @RequestMapping("/addbook")
    public void addBooks(){
        Book book=new Book();
        book.setBookId(123l);
        book.setBookName("Java");
        book.setAuthor("nageswara rao");
        book.setPrice(680F);
        bookRepository.save(book);

        Book book1=new Book();
        book1.setBookId(456L);
        book1.setBookName("C++");
        book1.setAuthor("Venu Gopal");
        book1.setPrice(612F);

        bookRepository.save(book1);
        System.out.println("Add book Successfully");
    }
    @RequestMapping("/getallbooks")
    public List<Book> findAllBooks(){
        return  bookRepository.findAll();
    }
    @RequestMapping("/getcurrentbook")
    public Book findoneBook(){
        return  bookRepository.findOne(123L);
    }
    @RequestMapping("/deletetbook")
    public void deleteBook(){
        bookRepository.delete(123L);
    }
}
