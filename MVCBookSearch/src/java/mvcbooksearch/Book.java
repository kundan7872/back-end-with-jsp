/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcbooksearch;

/**
 *
 * @author Kundan Singh
 */
public class Book {

    public Book(){
        
    }
    public Book(int bookId, String bookNmae, double bookPrice, String subject) {
        this.bookId = bookId;
        this.bookNmae = bookNmae;
        this.bookPrice = bookPrice;
        this.subject = subject;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookNmae() {
        return bookNmae;
    }

    public void setBookNmae(String bookNmae) {
        this.bookNmae = bookNmae;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    private  int bookId;
    private  String bookNmae;
    private  double bookPrice;
    private  String subject;
}
