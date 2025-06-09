<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="student_management.Student,student_management.Operations" %>
<%
	String name = request.getParameter("stud_name");
	String city = request.getParameter("stud_city");
	int rollno = Integer.parseInt(request.getParameter("roll_no"));
	
	Student s = new Student(rollno,name,city);
	Operations o = new Operations();
	int n = o.updateStudent(s);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if(n>=0){ %>
		<h1>DATA UPDATED SUCCESFULLY.</h1>
	<%}else{ %>
		<h1>COULD NOT UPDATE THE DATA.</h1>
	<%} %>
</body>
</html>