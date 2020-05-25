<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/18/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="resources"/>

<html lang="${language}">
<head>
    <title>Taxi Service - <fmt:message key="register_user_page_title"/></title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../jsp/header.jsp"/>
<div class="maincontent">
    <p class="error_message_text">${requestScope.invalid_email_message}</p>
    <h3><fmt:message key="register_user_page_H3"/></h3>
<form action="/RegisterUserServlet" method="post">
    <label for="fname"><fmt:message key="register_user_page_name"></label>
    <input name="username" id="fname" type="text" value="John"/><br><br>

    <label for="email"><fmt:message key="login_page_email"/></label>
    <input name="usermail" id="email" type="text" value="${requestScope.new_user_email}" readonly="readonly"/><br><br>

    <label for="pswrd"><fmt:message key="LABEL_PASSWORD"/></label>
    <input name="userpassword" id="pswrd" type="password"/><br><br>
    <input type="submit" value="<fmt:message key="register_user_page_submit_btn"/>" id="submit">
</form>
</div>
</body>
</html>
