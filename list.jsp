<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>All Student List</title>
</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<h1 align="center">Student List</h1>

<table class="table table-striped">
             <thead class="thead-dark">
               <tr>
               <th>Id</th>
               <th>Name</th>
               <th>Email</th>
               <th>Contact</th>
               <th>Pass</th>
               <th colspan="2">Action</th>
               </tr>
               </thead>
               
               <c:forEach var="dt" items="${data}">
         <tr>
               <td>${dt.id}</td>
               <td>${dt.name}</td>
               <td>${dt.email}</td>
               <td>${dt.contact}</td>
               <td>${dt.pass}</td>
               <td><a href="update?sid=${dt.id}&&action=delete">Delete</a></td>
               <td><a href="update?sid=${dt.id}&&action=update">Update</a></td>
          </tr>
              </c:forEach>
</table>

</div>
<div class="col-md-3"></div>
</div>
</div>
</body>
</html>