<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap core CSS -->
 <link href="${css}/theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/style.css" rel="stylesheet">

<script type="text/javascript">
	if ('${isHomePage}') {
		window.menuStatus = "Home";
	}
	if ('${isAboutPage}') {
		window.menuStatus = "About";
	}
	if ('${isContactPage}') {
		window.menuStatus = "Contact";
	}
</script>

</head>

<body>

	<div class="wrapper">
		<!--Include Navigation -->
		<%@include file="./include/nav-bar.jsp"%>
		<!--Include Navigation -->

		<!--Include Page Content -->
		<div class="main-container">
			<c:if test="${isHomePage}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${isAboutPage}">
				<%@include file="about-us.jsp"%>
			</c:if>

			<c:if test="${isContactPage}">
				<%@include file="contact-us.jsp"%>
			</c:if>
		</div>
		<!--Include Page Content -->

		<!--Include Footer -->
			<%@include file="./include/footer.jsp"%>
		<!--Include Footer -->
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery-3.3.1.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/myApp.js"></script>

</body>

</html>