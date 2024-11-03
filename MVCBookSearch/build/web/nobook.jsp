<%-- 
    Document   : nobook
    Created on : 31 Oct, 2024, 11:54:28 AM
    Author     : Kundan Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>No Book Found</title>
    </head>
    <body>
        <h1 style="color:red;">Sorry! no books of <%= request.getAttribute("subject")%> found in DB</h1>
    </body>
</html>
