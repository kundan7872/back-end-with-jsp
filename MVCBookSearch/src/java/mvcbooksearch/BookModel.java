/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcbooksearch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kundan Singh
 */
public class BookModel {
    private  static Connection conn;
    private  static PreparedStatement ps;
    static {
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","advjavabatch","mystudent");
             ps=conn.prepareStatement("select * from allbooks where subject=?");
        }catch(SQLException e){
            
        }
    }
    public static List<Book> getAllBookBySub(String subject)throws  SQLException{
        ps.setString(1, subject.toUpperCase());
        ResultSet rs=ps.executeQuery();
        List <Book>bookList=new ArrayList<>();
        while (rs.next()) {
            Book b=new Book();
            b.setBookId(rs.getInt("bookid"));
            b.setBookNmae(rs.getString("bookname").toUpperCase());
            b.setBookPrice(rs.getDouble("bookprice"));
            b.setSubject(rs.getString("subject").toUpperCase());
            bookList.add(b);
            
        }
        return bookList;
    }
    public static void closeConn() {
        try{
            conn.close();
            System.out.println("Close Conn!");
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
}
