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
    <title>增加一名学生</title>
</head>
<body>

    <form action="add.do" method="post">
        姓名:<input type="text" name="name" /><br/>
        年龄:<input type="text" name="age" /><br/>
        成绩:<input type="text" name="score" /><br/>
        <input type="submit" name="submit" value="添加" />
    </form>

</body>
</html>
