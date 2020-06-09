<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/8/2020
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSP Page</title>
  </head>
  <body>
  <c:set var = "salary" scope = "session" value = "${2000*2}"/>
  <c:out value = "${salary}"/>
  </body>
</html>
