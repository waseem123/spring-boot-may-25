<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="student_management.Student" %>
    
<%
	Student s = new Student();
	s.setRollNo(101);
	s.setStudName("Kamal");
	s.setStudCity("Solapur");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= s.getStudName() %></title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row mt-3">
		<div class="col-3">
			<div class="card">
				<div class="card-body">
					<p><strong>Roll No - </strong><%= s.getRollNo() %></p>
					<p><strong>Name - </strong><%= s.getStudName() %></p>
					<p><strong>City - </strong> <%= s.getStudCity()	 %></p>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>