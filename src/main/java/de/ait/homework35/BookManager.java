package de.ait.homework35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookManager {

    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book book) {
        if (findBookByISBN(book.getIsbn()) != null) {
            throw new IllegalArgumentException("Book with this ISBN already exists");
        }
        books.add(book);
        return false;
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBook(String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            return books.remove(book);
        }
        return false;
    }

    public static Object findBookByIsbn(String Buch) {
        return null;
    }

    public boolean removeBookByIsbn(String Buch) {

        return false;
    }

    public Collection<Object> getBooks() {
        return null;
    }
}

