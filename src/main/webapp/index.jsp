<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
    <style>
        table {
            width: 100%;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
<h1>List Customer</h1>
<table>
    <tr>
        <th>Name</th>
        <th>DOB</th>
        <th>Address</th>
        <th>Photo</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dob}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.imageUrl}" alt="Customer Image" width="100"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
