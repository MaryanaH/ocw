package com.mvelyka.library;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }
    public void borrowBook(String bookName) {
        setBooksStatus(bookName, true);
    }

    public void returnBook(String bookName) {
        setBooksStatus(bookName, false);
    }

    private void setBooksStatus(String bookName, boolean available) {
        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equals(bookName) && books[i].isAvailable() == available) {
                books[i].setAvailable(!available);
                return;
            }
        }
        throw new IllegalArgumentException("Book is not available");
    }

}
