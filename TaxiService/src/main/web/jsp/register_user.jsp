<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taxi Service - Register User</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<div class="maincontent">
    <h3>Please fill in to the following forms:</h3>
<form action="/RegisterUserServlet" method="post">
    <label for="fname">Name:</label>
    <input name="username" id="fname" type="text" value="John"/><br><br>
    <label for="email">Email:</label>
    <input name="usermail" id="email" type="text" value="test@test.com"/><br><br>
    <label for="pswrd">Password:</label>
    <input name="userpassword" id="pswrd" type="password"/><br><br>
    <input type="submit" value="Register" id="submit">
</form>
</div>
</body>
</html>
