<%-- 
    Document   : showbook
    Created on : 31 Oct, 2024, 11:54:41 AM
    Author     : Kundan Singh
--%>

<%@page import="java.util.*,mvcbooksearch.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Found</title>
    </head>
    <body>
        <%java.util.List<Book> booklist=(List<Book>)request.getAttribute("booklist");
        String subject=(String)request.getAttribute("subject");
        
        %>
        
        <h1>Found <%=booklist.size() %>Book of the subject <%=subject %></h1>
        <table border="2" style="color:darkblue;width:100%;text-align: center;">
            <tr><th>Book ID</th><th>Book Name</th><th>Book Price</th><th>Book Subject</th></tr>
            <%for(Book b:booklist){
            out.println("<tr><td>"+b.getBookId()+"</td><td>"+b.getBookNmae()+"</td><td>"+b.getBookPrice()+"</td><td>"+b.getSubject()+"</td</tr>");
            } %>
        </table>
    </body>
</html>
