<%--
  Created by IntelliJ IDEA.
  User: junpeng
  Date: 2019/1/17
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String basePath = request.getContextPath();
    %>
    <title>Title</title>
</head>
<body>
LOGIN Page
<form action="<%=basePath %>/login.do" method="POST">
    用户名: <input type="text" name="username">
    <br />
    密 码: <input type="text" name="password" />
    <input type="submit" value="提交" />
</form>

</body>
</html>
