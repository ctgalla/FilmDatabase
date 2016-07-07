

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Movie List</title>
</head>
<body>

<sql:setDataSource var="snapshot" driver= "com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/film"
	user="java" password="java123"/>
	
	<h1>Movie Database</h1>
	<form name="myForm" action="display.jsp" method="POST">
		<table border="0">
			<tbody>
				<tr>
					<select name="Subject">
						<option value="">Select a Genre...</option>
						<option value="Comedy">Comedy</option>
						<option value="Drama">Drama</option>
						<option value="Action">Action</option>
						<option value="Adventure">Adventure</option>
						<option value="Fantasy">Fantasy</option>
						<option value="Horror">Horror</option>
						<option value="Music">Music</option>
						<option value="Mystery">Mystery</option>
						<option value="Romance">Romance</option>
						<option value="Science Fiction">Science Fiction</option>
						<option value="Short">Short</option>
						<option value="War">War</option>
						<option value="Western">Western</option>
						<option value="Westerns">Westerns</option>
					</select>
				</tr>
				
			
			</tbody>
		
		</table>
	<input type="reset" value="Clear" name="clear"/>
	<input type="submit" value="Submit" name="submit"/>
	
	</form>
	


</table>
</form>
</body>
</html>