<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%--jsp的page编译指令--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--  html注释 -->
<!--- today is <%= new java.util.Date().toString() %>-->
<%--  这是jsp注释  ---%>

jsp表达式输出：<%="my computer" %>
<br/>
<%
   String str = "hello world!!77";
   out.println(str);
%>
</body>
</html>
