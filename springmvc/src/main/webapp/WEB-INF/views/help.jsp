
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- method 1  -->
	<%
	/* String name = (String) request.getAttribute("name");
	String business = (String) request.getAttribute("business");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>
	
	<%-- <h1>
		name of owner is
		<%=name%></h1> 
	</h1> --%>
<%--<h1
		name of business is
		<%=business%>
	</h1>  --%>
<%--<h1>
		Current Time and date is
		<%-- <%=time.toString()%>
	</h1> --%>
	

<!-- method 2 -->	
	<h1>
		name of owner is
		<%-- <%=name%></h1> --%>
		${name }
		<!-- EL expressions -->
	</h1>

	<h1>
		name of business is
		<%-- <%=business%></h1> --%>
		${business }
		<!-- EL expressions -->
	</h1>

	<h1>
		Current Time and date is
		<%-- <%=time.toString()%></h1> --%>
		${time }
		<!-- EL expressions -->
	</h1>
	
	<c:forEach var="items" items="${marks }">
	<h1>${items }</h1>
	</c:forEach>
</body>
</html>