<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Taxi Service - Register User</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<div class="maincontent">
    <p class="error_message_text">${requestScope.invalid_email_message}</p>
    <h3>Please register new user:</h3>
<form action="/RegisterUserServlet" method="post">
    <label for="fname">Name:</label>
    <input name="username" id="fname" type="text" value="John"/><br><br>
    <label for="email">Email:</label>
    <input name="usermail" id="email" type="text" value="${requestScope.new_user_email}" readonly="readonly"/><br><br>
    <label for="pswrd">Password:</label>
    <input name="userpassword" id="pswrd" type="password"/><br><br>
    <input type="submit" value="Register" id="submit">
</form>
</div>
</body>
</html>
