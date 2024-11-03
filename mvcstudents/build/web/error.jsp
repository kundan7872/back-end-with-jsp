<%-- 
    Document   : error
    Created on : 1 Nov, 2024, 11:28:39 AM
    Author     : Kundan Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error Page</title>
    </head>
    <body>
        <%
out.println("<h2 style='color:red;'>Error Occures!"+exception.getMessage()+"</h2>");
%>
    </body>
</html>
