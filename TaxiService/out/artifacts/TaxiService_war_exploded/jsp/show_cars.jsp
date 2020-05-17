<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Taxi Service - show all cars</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<jsp:include page="../html/admin_menu.html"/>
<div class="footer_higher">
    <p>All cars that are registered in the system:</p>
    <table>
        <tr> <th>id</th><th>car_type_id</th><th>car_number</th><th>car_brand</th><th>is ordered</th>
            <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id}</td><td>${car.car_type_id}</td><td>${car.car_number}</td><td>${car.car_brand}</td><td>${car.ordered}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
