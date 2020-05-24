<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Taxi Service - Order page</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../jsp/header.jsp"/>
<div class="maincontent">
    <h3>Order</h3>
    <!-- Not ready-->
    <p>Hi, ${actual_user.name}!,<br> let's have a trip! email = ${actual_user.email}, password = ${actual_user.password}</p>
    <form action="/OrderServlet" method="post">
        <!--<label for="fname">Name:</label>-->
        <input name="username" id="fname" type="hidden" value="${actual_user.name}"/><br><br>
        <!--<label for="email">Email:</label>-->
        <input name="usermail" id="email" type="hidden" value="${actual_user.email}"/><br><br>
        <label for="fstartstreet">Trip Starts at:</label>
        <input name="startstreet" id="fstartstreet" type="text" size="40" value="Bohdana Hmelnytskogo, 54"/><br><br>
        <label for="fendstreet">Trip Ends at:</label>
        <input name="endstreet" id="fendstreet" type="text" size="40" value="Bohdana Hmelnytskogo, 115"/><br><br>
        <label for="cartype">Choose type of a car:</label>
        <select id="cartype" name="cars">
            <option value="lux">lux</option>
            <option value="econom">econom</option>
        </select><br>
        <input type="submit">
    </form>
</div>
</body>
</html>

