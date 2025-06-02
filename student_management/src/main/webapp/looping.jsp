<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Looping</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">

<div class="container mt-3">
	<%
	for (int i = 0; i < 12; i++) {
	%>
	<div class="row mt-3">

		<div class="col-3">
			<div class="card">
				<img
					src="https://www.motoroids.com/wp-content/uploads/2021/02/Suzuki-Hayabusa-2021-front-end-1200x818.jpg"
					class="card-img-top">
				<div class="card-body">
					<p>
						CARD NO -
						<%=i%></p>
				</div>
			</div>
		</div>
	</div>
	<%
	}
	%>
</div>
</head>
<body>

</body>
</html>