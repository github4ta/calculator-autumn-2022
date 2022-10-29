package by.itacademy.marchuk_viktor.main;
/*
5. Book: id, Название, Автор(ы), Издательство, Год издания, Количество
страниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

import by.itacademy.marchuk_viktor.entity.Book;
import by.itacademy.marchuk_viktor.service.SearchingBooks;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        SearchingBooks books=new SearchingBooks();
        ArrayList <Book> list = new ArrayList <>();

        // examples for checking
        list.add(new Book(12, "Java", "Blinov", "Svet", 2005,
                678, 23.2, "soft"));
        list.add(new Book(34, "PHP", "Petrov", "Focus", 2002,
                459, 14.6, "hard"));
        list.add(new Book(34, "PHP", "Orlov", "Focus", 2008,
                459, 14.6, "hard"));
        books.printAuthorBook(list,"y");
        books.printPublisherBook(list,"f");
        books.printByYear(list,2000);

    }
}
/*
The list of books by a given author
Not found
The list of books by a given publisher
PHP
PHP
The list of books after given year
Java
PHP
PHP
 */