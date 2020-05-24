<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taxi Service</title>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="jsp/header.jsp"/>
<div class="maincontent">
    <p>Here we'll work with our taxi</p>
    <!--<a href="html/admin_page.html">Go to admin's page</a>  -->
    <a href="/GetAdminPageServlet">Go to admin's page</a>
    <h3>Choose Your Language:</h3>
    <form method="post" action="/GetPageServlet">
        <button type="submit" value="ukr">Українська</button>
        <input id="for_eng" name="eng_button" type="hidden" value="eng">
        <input type="submit" value="eng">
    </form>
</div>
</body>
</html>
