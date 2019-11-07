<%--
  Created by IntelliJ IDEA.
  User: 木了秋
  Date: 2019/11/3
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<%=request.getAttribute("message")%><br/>
<a href="index.jsp">回到首页</a>
</body>
</html>
