<%--
  Created by IntelliJ IDEA.
  User: Loyer
  Date: 2019/11/6
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更改学生信息</title>
</head>
<body>

    <form action="update.do" method="post">
        姓名:<input type="text" name="name" /><br/>
        年龄:<input type="text" name="age" /><br/>
        成绩:<input type="text" name="score" /><br/>
        <input type="submit" name="submit" value="修改" />
    </form>

</body>
</html>
