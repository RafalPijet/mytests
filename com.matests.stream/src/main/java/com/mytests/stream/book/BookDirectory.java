package com.mytests.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> booksList = new ArrayList<>();

    public BookDirectory() {
        booksList.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        booksList.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        booksList.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        booksList.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        booksList.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "0005"));
        booksList.add(new Book("Madelynn Carson", "Unity without duty", 2007, "0006"));
        booksList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007"));
    }

    public List<Book> getList() {
        return new ArrayList<>(booksList);
    }
}
