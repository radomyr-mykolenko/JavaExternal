<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/17/2020
  Time: 11:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taxi Service - Show Car Types</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<jsp:include page="../html/admin_menu.html"/>
<div class="footer_higher">
    <p>All car types that are registered in the system:</p>
    <table>
        <tr> <th>id</th><th>description</th>
        <c:forEach var="car_type" items="${cartypes}">
            <tr>
                <td>${car_type.id}</td><td>${car_type.description}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
