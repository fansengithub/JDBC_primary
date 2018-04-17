<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/19
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面访问计数器</title>
</head>
<body>
<%
    Object object = application.getAttribute("counter");

    if (object == null){
        application.setAttribute("counter",new Integer(1));
        out.println("页面被访问了1次<br/>");
    }else {
        int counterValue = Integer.parseInt(object.toString());
        counterValue++;
        out.println("该页面被访问了"+ counterValue +"次<br>");
        application.setAttribute("counter",counterValue);
    }
%>
</body>
</html>
