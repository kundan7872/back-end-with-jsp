<%-- 
    Document   : nodata
    Created on : 1 Nov, 2024, 11:28:50 AM
    Author     : Kundan Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>No Data Page</title>
    </head>
    <body>
        <h1 style="color:red;">Sorry! no Student of <%= request.getAttribute("email") 
            %><%=request.getAttribute("name")%> found in DB</h1>
    </body>
</html>
