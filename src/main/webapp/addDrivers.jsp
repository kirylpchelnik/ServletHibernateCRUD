
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New driver</title>
</head>
<body>
<form action = "/driver" method="post">
    <input required type="text" name="firstName" placeholder="Firstname">
    <input required type="text" name="lastName" placeholder="Lastname">
    <input required type="text" name="email" placeholder="Email">
    <input required type="text" name="address" placeholder="Address">
    <input type="submit" value="Save">
</form>
</body>
</html>
