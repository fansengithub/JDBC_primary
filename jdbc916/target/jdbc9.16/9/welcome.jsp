<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息展示页面</title>
</head>
<body>
信息展示页面：<br><br>
用户名： <%= request.getAttribute("userNamess") %><br>
技能ss：  <%= request.getAttribute("skillsss") %>
</body>
</html>
