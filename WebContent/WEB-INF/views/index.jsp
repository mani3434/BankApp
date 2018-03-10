<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Bank</title>
</head>
<body>

	<div class="container">
		<%@ include file="header.jsp"%>

		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
				<div class="jumbotron">
					<h2 class="display-4">Welcome to Bank</h2>
					<p class="lead">Happiness = A good bank account, A good cook
						and a good digestion - Jean</p>
					<a href="user/newAccount" class="btn btn-lg btn-success">Register Here</a>
					<p>
						<br /> Existing User : <a href="user/login">Login Here</a>
					</p>
				</div>

			</div>
		</div>

		<div class="row">
			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-6 col-12">
				<div class="card" style="height: 200px">
					<div class="card-header">Online</div>
					<img
						src="<spring:url value='/resource/images/stay-online.png' />"
						class="card-img-top" alt="online" />
					<div class="card-body">
						<p class="card-text">200+ Transaction via NetBanking</p>
					</div>
				</div>
			</div>
			
			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-6 col-12">
				<div class="card" style="height: 200px">
					<div class="card-header">Phone</div>
					<img
						src="<spring:url value='/resource/images/stay-phone.png' />"
						class="card-img-top" alt="online" />
					<div class="card-body">
						<p class="card-text">Transactions using Mobile Banking</p>
					</div>
				</div>
			</div>
			
			
			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-6 col-12">
				<div class="card" style="height: 200px">
					<div class="card-header">Social</div>
					<img src="<spring:url value='/resource/images/stay-social.png' />"
						class="card-img-top" alt="online" />
					<div class="card-body">
						<p class="card-text">Social Media</p>
					</div>
				</div>
			</div>
			
			
			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-6 col-12">
				<div class="card" style="height: 200px">
					<div class="card-header">Watch</div>
					<img
						src="<spring:url value='/resource/images/stay-watch.png' />"
						class="card-img-top" alt="online" />
					<div class="card-body">
						<p class="card-text">Receive notifications on watch</p>
					</div>
				</div>
			</div>
			
			
			
		</div>

		<%@ include file="footer.jsp"%>
	</div>


</body>
</html>