<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="filmDatabase.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>Movie Database</title>
</head>
<body>
	<h1> Movie Database</h1>
<%
	ApplicationsDAO app= new ApplicationsDAO();

	List<Application> applications = dao.selectAll();
	%> 
<form action="applications.jsp">
	<table>
	<tr>
		<td><input year="year"></td>
		<td><input title="title"></td>
		<td><input popularity="popularity"></td>
		<td><input length="length"></td>
		<td><input subject="subject"></td>

		
	</tr>
<% for(Application app:applications) {
%>		<tr>
			<td><%= app.getYear()%> %> </td>
			<td><%= app.getTitle()%> %> </td>
			<td><%= app.getPopularity()%> %> </td>
			<td><%= app.getLength()%> %> </td>
			<td><%= app.getSubject()%> %> </td>
		</tr>
<% 	
	}
%>	</table>

</form>
</body>
</html>