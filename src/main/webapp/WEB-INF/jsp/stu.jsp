<%@ page import="java.util.List" %>
<%@ page import="org.loyer.web.beans.Student" %><%--
  Created by IntelliJ IDEA.
  User: 木了秋
  Date: 2019/11/3
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<%
    List<Student> stus = (List<Student>) request.getAttribute("students");
    for (Student stu : stus) {%>
<h2><%=stu%>
</h2>
<%}%>
</body>
</html>
