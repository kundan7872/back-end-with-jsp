<%-- 
    Document   : division
    Created on : 31 Oct, 2024, 9:04:09 PM
    Author     : Kundan Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="showerror.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>Result!</h1>
        <%
        int f=Integer.parseInt(request.getParameter("fno"));
        int s=Integer.parseInt(request.getParameter("sno"));
        out.println("Division Result: "+f/s);
        %>
    </body>
</html>
