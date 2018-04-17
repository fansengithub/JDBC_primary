<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/19
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    session.invalidate();    //清楚session对象
    response.setHeader("refresh","2;URL=welcome.jsp");
%>