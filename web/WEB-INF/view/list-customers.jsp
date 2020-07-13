<%--
  Created by IntelliJ IDEA.
  User: bakba
  Date: 10.07.2020
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customers</title>

    <!-- Adding reference to css resources -->
    <link type="text/css"
    rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM SYSTEM</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <!-- code for button -->
        <input type="button" value="Add Customer"
                onclick="window.location.href = 'showFormForAdd'; return false"
                class="add-button"
        />

        <!-- code for table -->
        <table>
            <tr>
                <th>First name</th>
                <th>Last name</th>
                <th>Email</th>
            </tr>

            <c:forEach var="tempCustomer" items="${customers}">

                <tr>
                    <td> ${tempCustomer.firstName}</td>
                    <td> ${tempCustomer.lastName}</td>
                    <td> ${tempCustomer.email}</td>

                </tr>
            </c:forEach>

        </table>

    </div>
</div>

</body>
</html>
