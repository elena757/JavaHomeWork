package com.pb.sokolovae.hw5;

public class Book {
    private final String name;
    private final String author;
    private final String YearOfPublishing;

    public Book(String name, String author, String YearOfPublishing) {
        this.name = name;
        this.author = author;
        this.YearOfPublishing = YearOfPublishing;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    public String getYearOfPublishing() {
        return YearOfPublishing;
    }


    public String getInfo() {
        return "Название книги: " + name + " (автор: " + author +", год издания: " + YearOfPublishing +")";
    }
}
