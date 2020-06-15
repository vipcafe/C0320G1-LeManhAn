<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/10/2020
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  </head>
  <br>

  <form method="post" action="/convert" style="text-align: center">
    <h1>Convert</h1>
    <div class="form-group">
      <label style="text-align: right">Rate </label></br>
      <input type="text" name = "rate" placeholder="Rate" value="220000" ></br>
    </div>
    <div class="form-group">
    <label style="text-align: right">USD</label></br>
    <input type="text" name = "usd" placeholder="USD" value="0"></br>
    </div>
    <input type="submit" value="Convert" class="btn btn-primary">
  </form>
<%------------------------------------------------------------------------------------------------------%>
  <form class="form-group" method="post" action="search">
    <h2>Nhập từ cần tìm :</h2>
    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="Recipient's username" name = "search">
      <div class="input-group-append">
        <button class="btn btn-outline-secondary" type="submit" >Button</button>
      </div>
    </div>
  </form>
  </body>
</html>
