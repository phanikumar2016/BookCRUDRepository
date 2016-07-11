package com.iic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Admin on 7/6/2016.
 */
@Entity
public class Book {
    @Id
    private Long bookId;
    private String bookName;
    private String author;
    private Float price;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


}
