<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="student_management.*" %>
    
<%
	String name = request.getParameter("stud_name");
	String city = request.getParameter("stud_city");
	
	Student s = new Student(name,city);
	Operations o = new Operations();
	int rows = o.saveData(s);
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= name %></p>
	<p><%= city %></p>
</body>
</html>
<script>
<%
if(rows>0){%>
	alert("DATA INSERTED SUCCESSFULLY");
	location.href = "tabular-info.jsp";
<%}else{%>
	alert("COULD NOT SAVE THE DATA");
	location.href = "tabular-info.jsp";
<%}
%>
</script>