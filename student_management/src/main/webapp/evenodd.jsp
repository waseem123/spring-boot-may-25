<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
int value = 3;
boolean result;
if (value % 2 == 0) {
	result= true;
} else {
	result= false;
}
%>

<!DOCTYPE html>
<html
	<%
		out.print(result?"data-bs-theme='light'":"data-bs-theme='dark'");
	%>>
<head>
<meta charset="UTF-8">
<title>Even OR Odd</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">

</head>
<body>
	<div class="container mt-3">
		<div class="row mt-3">
			<div class="col-12">
				<div class="card">
					<div class="card-body">
						<%
						if(result==true)
							out.println("<h1 class='text-success'>" + value + " IS EVEN</h1>");
						else
							out.println("<h1 class='text-danger'>" + value + " IS ODD</h1>");
					
						%>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
	crossorigin="anonymous"></script>

</html>