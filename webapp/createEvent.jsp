<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="Spring"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create A Event</title>
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
		<Spring:form modelAttribute="Event"  action="saveEvent" method="post">

<Spring:label  path="id">Event ID</Spring:label>
<Spring:input path="id"/><br><br><hr>

<Spring:label path="name">Event Name</Spring:label>
<Spring:input path="name"/><br><br><hr>

<Spring:label path="discription">Event Discription</Spring:label>
<Spring:input path="discription"/><br><br><hr>

<Spring:label path="location">Event Location</Spring:label>
<Spring:input path="location"/><br><br><hr>

<Spring:label path="date">Event Date</Spring:label>
<Spring:input path="date"/><br><br><hr>

<Spring:label path="contactDetails">contact</Spring:label>
<Spring:input path="contactDetails"/><br><br><hr>

<button type="submit">Submit</button> <button type="reset">Reset</button>
</Spring:form>
	</div>
</body>
</html>