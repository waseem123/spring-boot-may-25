<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	System.out.println("THIS IS A PRINT STATEMENT");

	String name = "Waseem";
	String city = "Solapur";
	String qualification = "B.E. CSE.";
	
	System.out.printf("MY NAME IS %s. I LIVE IN %s. I HAVE COMPLETED MY GRADUATION IN %s",name,city,qualification);
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<h2>
		<% out.print("My name is "+name+". I live in "+city+". I have completed my graduation in "+qualification); %>
	</h2>
</body>
</html>