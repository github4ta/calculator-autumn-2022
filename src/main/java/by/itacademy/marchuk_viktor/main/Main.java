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
import by.itacademy.marchuk_viktor.service.SearchByStream;
import by.itacademy.marchuk_viktor.service.SearchingBooks;
import by.itacademy.marchuk_viktor.service.SearchingBooksAnotherWay;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        SearchingBooks books = new SearchingBooks();
        SearchingBooksAnotherWay booksAnotherWay = new SearchingBooksAnotherWay();
        ArrayList <Book> list = new ArrayList <>();
        SearchByStream stream = new SearchByStream();

        // examples for checking
        list.add(new Book(12, "Java", "Blinov", "Svet", 2005,
                678, 23.2, "soft"));
        list.add(new Book(34, "PHP", "Petrov", "Focus", 2002,
                459, 14.6, "hard"));
        list.add(new Book(34, "C++", "Orlov", "Focus", 2008,
                459, 14.6, "hard"));
//        books.printAuthorBook(list,"y");
//        books.printPublisherBook(list,"f");
//        books.printByYear(list,2000);
//        booksAnotherWay.printBookByAuthor(list, "Blinov");
//        booksAnotherWay.printBookByPublisher(list, "Foc");
//        booksAnotherWay.printByYear(list, 2005);
        stream.printByAuthorBookStream(list, "Blinov");
        System.out.println(stream.printByPublisherStream(list, "Focus"));
        stream.printByYearStream(list, 2001);
    }
}
/*
The list of books by a given author
Java
The list of books by a given publisher
Not found
The list of books after given year
C++
 */