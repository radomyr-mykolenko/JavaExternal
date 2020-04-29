<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 4/27/2020
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flowers</title>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.html"/>
<div class="maincontent">
    <a href="DemoServlet">Test Demoservlet</a>
    <a href="FlowersDBcontent">Show content of Database</a>
    <p>Below data will be transferred from form -> servlet -> jsp page</p>
    <form action="TestServlet" method="post">
        <label for="fname">Name:</label>
        <input name="username" id="fname" type="text" value="John"/><br><br>
        <label for="fage">Age:</label>
        <input name="userage" id="fage" type="text" value="27"/><br><br>
        <input type="submit">
    </form>
</div>
</body>
</html>
