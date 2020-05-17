<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/17/2020
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All registered users</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<jsp:include page="../html/admin_menu.html"/>
<div class="footer_higher">
    <p>All users that are registered in system:</p>
    <table>
        <tr> <th>id</th><th>name</th><th>email</th><th>password</th></tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td><td>${user.name}</td><td>${user.email}</td><td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
