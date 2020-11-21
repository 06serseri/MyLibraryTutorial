package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> favoriteBooks;

    private Utils() {
        if(null == allBooks){
            allBooks = new ArrayList<>();
            initData();
        }
        if(null == alreadyReadBooks){
            alreadyReadBooks = new ArrayList<>();
        }
        if(null == wantToReadBooks){
            wantToReadBooks = new ArrayList<>();
        }
        if(null == currentlyReadingBooks){
            currentlyReadingBooks = new ArrayList<>();
        }
        if(null == favoriteBooks){
            favoriteBooks = new ArrayList<>();
        }
    }

    private void initData() {
        //TODO: add initial data

        allBooks.add(new Book(1, "1Q84", "Haruki Murakami", 1350, "https://ginadebacker.files.wordpress.com/2014/09/1q84-cover.jpg",
                "A work of  maddening brilliance", "Long Description"));
        allBooks.add(new Book(2, "The Myth Of Sisyphus", "Albert Camus", 250, "https://kbimages1-a.akamaihd.net/cdfba115-03be-4d70-b7ef-e5d69c446f2b/1200/1200/False/the-myth-of-sisyphus-and-other-essays-1.jpg",
                "Good book", "Long Description"));
    }

    public static Utils getInstance() {
        if (null != instance){
            return instance;
        } else  {
            instance = new Utils();
            return instance;
        }

    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }
}
