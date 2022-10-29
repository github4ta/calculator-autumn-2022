package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Book;

import java.util.ArrayList;

public class SearchingBooks{
    private ArrayList <Book> bookArrayList;

    public SearchingBooks(){

    }

    public void printAuthorBook(ArrayList <Book> list, String author){
        System.out.println("The list of books by a given author");
        boolean flag = true;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAuthor().equals(author)){
                System.out.println(list.get(i).getBookName());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }

    public void printPublisherBook(ArrayList <Book> list, String publisher){
        System.out.println("The list of books by a given publisher");
        boolean flag = true;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getPublisher().equals(publisher)){
                System.out.println(list.get(i).getBookName());
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
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getYearOfPublication() > year){
                System.out.println(list.get(i).getBookName());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }
}

