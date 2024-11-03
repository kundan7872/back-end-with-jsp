/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcstudentdata;

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
public class StudentModel {
    private  static  Connection conn;
    private  static PreparedStatement ps;
    static {
    try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","advjavabatch","mystudent");
             ps=conn.prepareStatement("select * from studentreg where studentemail=? and studentname=?");
        }catch(SQLException e){
            
        }
    }
      public static List<Student> getStudent(String em,String pass)throws  SQLException{
        ps.setString(1, em.toUpperCase());
       ps.setString(2, pass.toUpperCase());
        ResultSet rs=ps.executeQuery();
        List <Student>studentList=new ArrayList<>();
        while (rs.next()) {
            Student s=new Student();
            s.setStId(rs.getInt("STUDENTID"));
            s.setStName(rs.getString("STUDENTNAME"));
            s.setStDob(rs.getString("STUDENTDOB"));
            s.setStFatherName(rs.getString("STUDENTFATHER"));
             s.setStMob(rs.getString("STUDENTMOB"));
            s.setStEmail(rs.getString("STUDENTEMAIL"));
            studentList.add(s);
            
        }
        return studentList;
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
