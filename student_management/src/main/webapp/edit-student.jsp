<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="student_management.*"%>

<%
int rollno = Integer.parseInt(request.getParameter("rollno"));
Operations o = new Operations();
Student s = o.getStudentData(rollno);

String name = "", city = "";
if (s != null) {
	name = s.getStudName();
	city = s.getStudCity();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-6">
				<div class="card">
					<div class="card-body">
						<h5>Student Info</h5>
						<form action="update-student.jsp" method="POST">
							<div class="mb-3">
							<input type="hidden"
									name="roll_no" class="form-control" value="<%=rollno%>">
								<label for="">Student Name</label> <input type="text"
									name="stud_name" class="form-control" value="<%=name%>">
							</div>
							<div class="mb-3">
								<label for=""> Student City </label> <input type="text"
									name="stud_city" class="form-control" value="<%=city%>">
							</div>
							<input type="submit" class="btn btn-primary">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>