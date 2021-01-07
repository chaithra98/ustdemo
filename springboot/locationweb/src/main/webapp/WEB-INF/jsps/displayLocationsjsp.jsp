<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Locations List</title>
</head>
<body>
	<h2>Locations/:</h2>
	
	
	<pre>
		<form action="/saveLoc" method="POST">
			Id:<input type="text" name="id" value = "${location.id}" readonly />
			<br>
			Code:<input type="text" name="code" value = "${location.code}" />
			<br>
			Name:<input type="text" name="name" value = "${location.name}" />
			<br>
			Type: Urban: <input type="radio" name="type" value="URBAN" ${lovation.type=='URBAN' ? 'checked' : '' }/>
				  Rural:<input type="radio" name="type" value="RURAL" ${lovation.type=='RURAL' ? 'checked' : '' }/>
				  <input type="submit" value="save"/>
		</form>
	</pre>
	
	
	
	
</body>
</html>