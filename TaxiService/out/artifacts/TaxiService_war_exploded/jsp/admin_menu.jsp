<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 5/25/2020
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty param.language}">
    <c:set var="language" value="${param.language}" scope="session"/>
</c:if>
<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="admin_page_msg"/>

<html lang="${language}">
<head>
    <meta charset="UTF-8">
    <title>Taxi Service - <fmt:message key="admin_menu_H3"/></title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<div class="maincontent_admin_menu">
    <H3><fmt:message key="admin_menu_H3"/></H3>

    <a href="/create_user_table_servlet" target="_self">
        <div class="content_preview">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                        <fmt:message key="Step_1_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                       <fmt:message key="create_table_user"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ins_user_test_data" target="_self">
        <div class="content_preview2">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_5_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="insert_data_user"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ShowAllUsersServlet" target="_self">
        <div class="content_preview3">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_9_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="read_data_user"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/create_car_type_table_servlet" target="_self">
        <div class="content_preview">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                        <fmt:message key="Step_2_msg"/>
                    </span>
                </div>
                <span class="text_in_preview">
                        <fmt:message key="create_table_car_types"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ins_car_type_test_data" target="_self">
        <div class="content_preview2">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_6_msg"/>
                    </span>
                </div>
                <span class="text_in_preview">
                        <fmt:message key="insert_data_car_type"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ShowCarTypeServlet" target="_self">
        <div class="content_preview3">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                        <fmt:message key="Step_10_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                        <fmt:message key="read_data_car_type"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/create_cars_table_servlet" target="_self">
        <div class="content_preview">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                        <fmt:message key="Step_3_msg"/>
                    </span>
                </div>
                <span class="text_in_preview">
                         <fmt:message key="create_table_cars"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ins_cars_test_data" target="_self">
        <div class="content_preview2">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                        <fmt:message key="Step_7_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="insert_data_cars"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ShowCarsServlet" target="_self">
        <div class="content_preview3">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_11_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="read_data_cars"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/create_orders_table_servlet" target="_self">
        <div class="content_preview">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_4_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                        <fmt:message key="create_table_orders"/>
                    </span>
            </div>
        </div>
    </a>
    <a href="/ins_orders_test_data" target="_self">
        <div class="content_preview2">
            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_8_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="insert_data_orders"/>
                    </span>
            </div>
        </div>
    </a>

    <a href="/ShowOrdersServlet" target="_self">
        <div class="content_preview3">

            <div class="descriprion_preview">
                <div class="image_preview">
                    <span class="data_in_preview">
                         <fmt:message key="Step_12_msg"/>
                    </span>
                </div>

                <span class="text_in_preview">
                         <fmt:message key="read_data_orders"/>
                    </span>
            </div>
        </div>
    </a>
    <div style="clear: both">
        <a href="jsp/login_page.jsp"> <fmt:message key="link_login_page"/></a>
        <a href="jsp/register_user.jsp"> <fmt:message key="link_register_user"/></a>
        <a href="jsp/order_page.jsp"> <fmt:message key="link_order"/></a>
    </div>
</div>
</body>
</html>
