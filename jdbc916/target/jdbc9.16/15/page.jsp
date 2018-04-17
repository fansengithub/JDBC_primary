<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/19
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page对象示例</title>
</head>
<body>
<%
   out.print("page对象的字符串："+page.toString());
    out.print("page对象的字符串："+ page.getClass(););


   page.hashCode();
%>
</body>
</html>
