<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update driver</title>
</head>
<body>

<h1>To edit the driver?</h1>

<form action="/driver/${param.id}" method="post">
    <input type="hidden" name = "id" value="${param.id}">
    <input type="text" name="firstName" value="${param.firstName}" placeholder=${param.firstName}>
    <input type="text" name="lastName" value="${param.lastName}" placeholder=${param.lastName}>
    <input type="text" name="email" value="${param.email}" placeholder=${param.email}>
    <input type="text" name="address" value="${param.address}" placeholder=${param.address}>
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="Update">
</form>

<form action="driver" method="get">
    <input type="submit" value="No, I don't want to edit the driver">
</form>
</body>
</html>
