
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete drivers</title>
</head>
<body>
<h1>To remove the driver?</h1>
<form action="/driver/${param.id}" method="post">
<input type="hidden" name="id" value="${param.id}">
<input type="hidden" name="_method" value="delete">
<input type="submit" value="Удалить">
</form>

<form action="driver" method="get">
    <input type="submit" value="No, I don't want to remove the driver">
</form>

</body>
</html>
