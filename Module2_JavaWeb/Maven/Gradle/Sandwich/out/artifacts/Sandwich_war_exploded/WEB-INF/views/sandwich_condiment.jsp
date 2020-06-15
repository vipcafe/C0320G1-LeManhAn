<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich :</h2>
<c:forEach items= '${requestScope["condiment"]}' var="condiment" >
    <h3>${condiment}</h3></br>
</c:forEach>

</body>
</html>
