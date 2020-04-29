<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 4/28/2020
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info from servlet TestServlet</title>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.html"/>
<div class="maincontent">
<p>Name: ${name}</p>
<p>Age: ${age}</p>
</div>
</body>
</html>
