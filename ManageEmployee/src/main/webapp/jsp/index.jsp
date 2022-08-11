<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>

<script>
$(document).ready(function(){
	$("#submit").on('click',function(){
		$.ajax({
			url : '/employee',
			type : 'post',
			//dataType : 'json',
			data : $("#form").serialize(),
			success : function(data) {
				var result = JSON.parse(data);
				console.log(result);
			},
			error : function(data) {
				console.log(data);
				console.log("At error msg")
			}
		})
	});
});
</script>	

</head>
<body>
<h1>Employee Registration Form</h1>
	<form id="form" action="/employee" method="post" >
		<label for="fname">UserName:</label>
		<input type="text" name="uname" id="fname"><br><br>
		
		<label for="password">Password</label>
		<input type="password" name="password" id="password"><br><br>

		<label for="dob">Date of Birth:</label>
		<input type="text" name="dob" placeholder="yyyy/mm/dd"><br><br>
		
		<label for="mail">Email ID:</label>
		<input type="email" name="mail"><br><br>
		
		<label for="lname">Salary:</label>
		<input type="text" name="salary"><br><br>

		<!-- <button type="button" onclick="alert('Hai')">Click Me</button>-->		
		<input id="submit" type="button" name="submit" value = "submit">
	</form>
</body>

</body>
</html>