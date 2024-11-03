<%-- 
    Document   : showerror
    Created on : 31 Oct, 2024, 9:08:16 PM
    Author     : Kundan Singh
--%>

<%@page isErrorPage="true"%>
<%
out.println("<h2 style='color:red;'>Error Occures!"+exception.getMessage()+"</h2>");
%>

