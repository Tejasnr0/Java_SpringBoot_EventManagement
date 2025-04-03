<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Event</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.form-container {
background-color: graytext;
}
.form-container {
	margin: 50px auto;
	padding: 20px;
	border: 1px solid black;
	border-radius: 8px;
	width: 400px;
	text-align: left;
}

.form-container label, .form-container input {
	display: block;
	margin-bottom: 10px;
}

.form-container button {
	margin-right: 10px;
	color: black;
}

</style>
</head>
<body>

<div align="center" class="form-container">
<form action="deletefromdataBase" method="post"><!-- its the url -->
<label id="id">Enter the Id of the Event You Wish to Delete</label>
<input id="id" name="id" >
<button type="submit">Delete</button>
</form>
</div>
</body>
</html>