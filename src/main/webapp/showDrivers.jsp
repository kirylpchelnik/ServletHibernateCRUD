
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Список водителей</title>
</head>
<body>

<table border="2" align="center" >
    <tr>
        <td>ID</td>
        <td>Firstname</td>
        <td>Lastname</td>
        <td>Email</td>
        <td>address</td>
    </tr>
    <c:forEach items="${driver}" var = "driver">
        <tr>
            <td>${driver.getId()}</td>
            <td>${driver.getFirstName()}</td>
            <td>${driver.getLastName()}</td>
            <td>${driver.getEmail()}</td>
            <td>${driver.getAddress()}</td>

            <td>
                <form action = "updateDriver.jsp" method="post">
                    <input type="hidden" name="id" value="${driver.getId()}">
                    <input type="hidden" name="firstName" value="${driver.getFirstName()}">
                    <input type="hidden" name="lastName" value="${driver.getLastName()}">
                    <input type="hidden" name="email" value="${driver.getEmail()}">
                    <input type="hidden" name="Address" value="${driver.getAddress()}">

                    <input type="submit" value="Update" style="float:left">
                </form>
            </td>
            <td>
                <form action="deleteDriver.jsp" method="post">
                    <input type="hidden" name="id" value="${driver.getId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<form action = "addDrivers.jsp.jsp">
    <input type="submit" value="Add a new user">
</form>

</body>
</html>
