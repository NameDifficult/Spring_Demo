<%--
  Created by IntelliJ IDEA.
  User: Mi
  Date: 2022/3/26
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
    <div align="center">
        <form action="addStudentServlet" method="post">
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="注册">
        </form>
    </div>
</body>
</html>
