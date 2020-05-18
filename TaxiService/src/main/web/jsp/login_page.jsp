<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taxi Service - login page</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../html/header.html"/>
<div class="maincontent">
    <h3>Please log in to the system:</h3>
    <form action="/LogInServlet" method="post">
        <label for="email">Email:</label>
        <input name="usermail" id="email" type="text" value="test@test.com"/><br><br>
        <label for="pswrd">Password:</label>
        <input name="userpassword" id="pswrd" type="text" value="test@test.com"/><br><br>
        <input type="submit">
    </form>
</div>
</body>
</html>

