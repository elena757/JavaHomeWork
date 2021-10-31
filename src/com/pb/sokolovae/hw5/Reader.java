package com.pb.sokolovae.hw5;

public class Reader {
    private final String fio;
    private final int number;
    private final String faculty;
    private final String dateOfBirth;
    private final String phone;

    public Reader(String fio, int number, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public void takeBook1 (int number) {
        System.out.println(this.fio + " забрал домой " + number + " книги.");
    }
    public void takeBook3 (Book... books) {
        System.out.print(this.fio + " сейчас читает такие книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " , ");
        }
        System.out.println();
    }
    public void takeBook2 (Book... books) {
        System.out.println(this.fio + " за время регистрации в библиотеке брал такие книги:");
        for (Book book : books) {
            System.out.println(" - " + book.getName() + " (автор - " + book.getAuthor() + ", " + book.getYearOfPublishing() + ")");
        }
        System.out.println("---------------");
    }

    public void returnBook1(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

    public void returnBook2(Book... books) {
        System.out.print(this.fio + " уже прочитал такие книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " , ");
        }
        System.out.println();
    }

    public void returnBook3(Book... books) {
        System.out.println(this.fio + " прочитал и вернул такие книги:");
        for (Book book : books) {
            System.out.println(" - " + book.getName() + " (автор - " + book.getAuthor() + ", " + book.getYearOfPublishing() + ")");
        }
        System.out.println("---------------");
    }


    public String getInfo() {
        return "ФИО: " + fio + ", Номер ЧБ: " + number +", Факультет: " + faculty +"," +
                " ДР: " + dateOfBirth +", тел.: " + phone +".";
    }
}
