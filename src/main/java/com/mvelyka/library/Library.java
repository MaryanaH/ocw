package com.mvelyka.library;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }
    public void borrowBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equals(bookName) && books[i].isAvailable()) {
                books[i].setAvailable(false);
                break;
            }
        }
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equals(bookName) && !books[i].isAvailable()) {
                books[i].setAvailable(true);
                break;
            }
        }
    }
}
