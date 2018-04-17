<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/20
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/loginServlet" method="post">
     userName:<input type="text" name="uname">
    <br>
     passWord:<input type="password" name="upwd">
    <br>
    <input type="submit" value="Login">
    <input type="reset" value="Reset">
</form>
</body>
</html>
