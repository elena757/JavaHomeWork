package com.pb.sokolovae.hw5;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой Л.Н.", "1865 г.");
        Book book2 = new Book("Подросток", "Достоевский Ф.М.", "1875 г.");
        Book book3 = new Book("Стихотворения", "Пушкин А.С.", "1836 г.");
        Book book4 = new Book("Жизнь насекомых", "Пелевин В.О.", "1993 г.");
        Book book5 = new Book("Асасин", "Пелевин В.О.", "2008 г.");
        Book[] books = {book1, book2, book3, book4,book5 };

        Reader reader1 = new Reader("Петров В.В.", 1508, "УПП", "01.01.2000", "+80677777777");
        Reader reader2 = new Reader("Иванов И.И.", 1509, "КФ", "02.02.2000", "+809511111111");
        Reader reader3 = new Reader("Сидоров А.А.", 1510, "Экономика", "03.03.2000", "+8093300003");
        Reader[] readers = {reader1, reader2, reader3};


        printBooks(books);
        printReaders(readers);


        reader1.takeBook1(3);
        reader1.takeBook3(book1, book2, book3);
        reader1.takeBook2(book1, book2, book3, book4, book5);

        reader1.returnBook1(2);
        reader1.returnBook2(book4, book5);
        reader1.returnBook3(book4, book5);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг в библиотеке:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println("---------------");
    }
    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println("---------------");
    }

}
