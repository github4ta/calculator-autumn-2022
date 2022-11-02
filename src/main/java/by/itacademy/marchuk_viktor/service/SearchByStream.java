package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByStream{
    public void printByAuthorBookStream(ArrayList <Book> arrayListlist, String author){
        List <Book> result = arrayListlist.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).
                collect(Collectors.toList());
        System.out.println(result.stream().map(Book::getBookName).collect(Collectors.toList()));
    }

    public List <String> printByPublisherStream(List <Book> list, String publisher){
        return list.stream().filter(book -> book.getPublisher().equalsIgnoreCase(publisher)).
                map(Book::getBookName).collect(Collectors.toList());
    }

    public void printByYearStream(ArrayList <Book> bookArrayList, int year){
        List <Book> result = bookArrayList.stream().filter(book -> book.getYearOfPublication() > year).collect(Collectors.toList());
        System.out.println(result.stream().map(Book::getBookName).collect(Collectors.toList()));
    }

}
