<%-- 
    Document   : showstudent
    Created on : 1 Nov, 2024, 11:29:08 AM
    Author     : Kundan Singh
--%>

<%@page import="mvcstudentdata.Student,java.util.*" errorPage="error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>show student Page</title>
    </head>
    <body>
        <h1 style="color:darkgreen;text-align: center">Login Succ!</h1>
        <%List<Student> studentlist=(List<Student>)request.getAttribute("studentlist");
        String em=(String)request.getAttribute("em");
        String name="";
        for(Student ss:studentlist){
            name=ss.getStName();
        }
        
        
        %>
        
        <h1 style="color:orange;text-align: center; ">Good morning <%=name %>!</h1>
        <div style="display: flex;width: 100%;justify-content: center;">
        <table border="2" style="color:black;font-size: 20px;width:80%;text-align: center; ">
            <tr><th>Student ID</th><th>Student Name</th><th>Student Dob</th><th>Student Father Name</th><th>Student Mob</th><th>Student Email</th></tr>
            <%for(Student s:studentlist){
            out.println("<tr><td>"+s.getStId()+"</td><td>"+s.getStName()+"</td><td>"+s.getStDob()+"</td><td>"+s.getStFatherName()+"</td><td>"+s.getStMob()+"</td><td>"+s.getStEmail()+"</td></tr>");
            } %>
        </table>
        </div>
    </body>
</html>
