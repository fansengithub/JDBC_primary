<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/10/25
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
   //  表单处理页面
   //  通过getparamer获取提交的用户姓名
    String name=request.getParameter("usern");
    String skill="";
//    获取用户提交的数组
    String[] skillArray=request.getParameterValues("skillll");
    //将技能数组拼装为字符串
    if(skillArray!=null && skillArray.length>0){
        for (String a: skillArray) {
            skill=skill+a+" ";
        }
    }

    //通过request的setAttribute方法保存到requset中
    request.setAttribute("name",name);
    request.setAttribute("skills",skill);

%>


<%--通过forward指令，跳转到下一页--%>
<jsp:forward page="four.jsp"></jsp:forward>
</body>
</html>
