<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>Student Registration</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4">
<h1 align="center">Student Registration Form</h1>
<form action="reg" method="get">
<span class="text-success">${msg}</span>
<input type="hidden" name="sid" value="${data.id}">

<div class="form-group">
<label>Name</label>
<input type="text" name="name" class="form-control" value="${data.name}">
</div>

<div class="form-group">
<label>Email</label>
<input type="text" name="email" class="form-control" value="${data.email}">
</div>

<div class="form-group">
<label>Contact</label>
<input type="text" name="contact" class="form-control" value="${data.contact}">
</div>

<div class="form-group">
<label>Password</label>
<input type="password" name="pass" class="form-control" value="${data.pass}">
</div>
<br>
<input type="Submit" class="btn btn-success">
<input type="Reset" class="btn btn-primary">

</form>
<h2><a href="list">View Student Details</a></h2>
</div>
<div class="col-md-4"></div>
</div>
</div>
</body>
</html>