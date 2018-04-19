package com.mytests.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> resultListBooks = bookDirectory.getList();

        //Then
        int numberOfBooksPublicationAfter2007 = 0;
        for (Book book : resultListBooks) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicationAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicationAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> booksList = bookDirectory.getList();

        //Then
        int numberOfBooksPublicationAfter2007 = IntStream.range(0, booksList.size())
                .filter(n -> booksList.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicationAfter2007);

    }

    @Test
    public void testGetListUsingIntStreamCount() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicationAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();

        Assert.assertEquals(3, numberOfBooksPublicationAfter2007);
    }
}
