<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is home page </h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>
	<% 
	String name =(String) request.getAttribute("name");
	Integer prn =(Integer) request.getAttribute("prn");
	List<String> friends =(List<String>) request.getAttribute("friend");
	%>
	<h1> Name is <%=name %></h1>
	<h1> PRN is <%=prn %></h1>
	Iter
	<%
		for(String str : friends){
	%>
	<h1><%=str%></h1>
	<%
	} 
	%>
	
</body>
</html>