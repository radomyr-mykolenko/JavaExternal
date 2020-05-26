<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty param.language}">
    <c:set var="language" value="${param.language}" scope="session"/>
</c:if>
<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="resources"/>

<html lang="${language}">
<head>
    <title>Taxi Service - login page</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../jsp/header.jsp"/>
<div class="maincontent">
    <p class="error_message_text">${requestScope.invalid_email_message}${requestScope.invalid_password_message}</p>
    <h3><fmt:message key="login_page_h3"/></h3>
    <form action="/LogInServlet" method="post">
        <label for="email"><fmt:message key="login_page_email"/></label>
        <input name="usermail" id="email" type="text" value="ad@min.com"/><br><br>
        <label for="pswrd"><fmt:message key="LABEL_PASSWORD"/></label>
        <input name="userpassword" id="pswrd" type="password" value="1"/><br><br>
        <input type="submit" value="<fmt:message key="login_page_submit"/>">
    </form>
</div>
</body>
</html>

