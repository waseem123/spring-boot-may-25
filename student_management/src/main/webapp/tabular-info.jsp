<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page
	import="student_management.Student,student_management.Operations" %>
<%@ page import="java.util.List,java.util.ArrayList"%>

<%
Operations o = new Operations();
List<Student> s = o.getAllStudents();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row mt-3">
		
		
			<div class="col-12 mb-3">
				<div class="card text-white bg-primary">
					<div class="card-body">
						<table class="table table-bordered table-striped table-hover">
							<thead>
								<tr>
									<th>Roll No</th>
									<th>Name</th>
									<th>City</th>
								</tr>
							</thead>
							<tbody>
							<% for (int i = 0; i < s.size(); i++) { %>
								<tr>
									<td><%= s.get(i).getRollNo() %></td>
									<td><%= s.get(i).getStudName() %></td>
									<td><%= s.get(i).getStudCity	() %></td>
								</tr>
							<% } %>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		
		
		</div>
	</div>
</body>
</html>