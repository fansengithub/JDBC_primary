<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/19
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录表单</title>
</head>
<body>
<form action="do_login.jsp" method="post">
    userName:<input type="text" name="userName"><br>
    passWord:<input type="password" name="passWord">
    <br><br>
    <input type="submit" value="submit">
    <input  type="reset" value="reset">
</form>
</body>
</html>
