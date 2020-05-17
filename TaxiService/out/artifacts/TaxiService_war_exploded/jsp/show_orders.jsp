<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 12:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Taxi Service - show orders</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<jsp:include page="../html/admin_menu.html"/>
<div class="footer_higher">
    <p>All orders that are registered in the system:</p>
    <table>
        <tr> <th>id</th><th>user_id</th><th>start</th><th>destination</th><th>distance</th><th>cost</th><th>car_id</th>
            <c:forEach var="order" items="${orders}">
        <tr>
            <td>${order.id}</td><td>${order.user_id}</td><td>${order.start}</td><td>${order.destination}</td><td>${order.distance}</td><td>${order.cost}</td><td>${order.car_id}</td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
