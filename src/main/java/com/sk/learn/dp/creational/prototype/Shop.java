package com.sk.learn.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class Shop implements Cloneable{

    private String shopName;
    private List<Book> books;

    public Shop() {

        books = new ArrayList<>();
    }

    public Shop(List<Book> books) {

        this.books = books;
    }

    public void loadData(){

        //Assumes we are making a DB call and populating books data

        for (int i=0; i<=5;i++){
            books.add(new Book(i, "Book-"+i));
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        List<Book> temp = new ArrayList<>();

        for (Book book: this.getBooks()) {

            temp.add(book);
        }

        return new Shop(temp);
    }
}
