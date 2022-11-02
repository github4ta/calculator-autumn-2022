package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Book;

import java.util.ArrayList;

public class SearchingBooksAnotherWay{
    public void printBookByAuthor(ArrayList <Book> list, String author){
        System.out.println("The list of books by a given author");
        boolean flag = true;
        for(Book b: list){
            if(b.getAuthor().equalsIgnoreCase(author)){
                System.out.println(b.getBookName());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }

    public void printBookByPublisher(ArrayList <Book> list, String publisher){
        System.out.println("The list of books by a given publisher");
        boolean flag = true;
        for(Book b: list){
            if(b.getPublisher().equalsIgnoreCase(publisher)){
                System.out.println(b.getBookName());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }

    public void printByYear(ArrayList <Book> list, int year){
        System.out.println("The list of books after given year");
        boolean flag = true;
        for(Book b: list){
            if(b.getYearOfPublication() > year){
                System.out.println(b.getBookName());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }
}
