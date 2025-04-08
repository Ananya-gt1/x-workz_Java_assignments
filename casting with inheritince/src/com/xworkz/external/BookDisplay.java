package com.xworkz.external;

import com.xworkz.internal.Book;
import com.xworkz.internal.BookChild;

public class BookDisplay {
    public void display(Book book) {
        book.read();
        book.open();
        book.close();
        book.bookmark();
        book.highlight();
        
        if (book instanceof BookChild) {
            BookChild bookChild = (BookChild) book;
            bookChild.bookSpecialAction();
        }
    }
}
