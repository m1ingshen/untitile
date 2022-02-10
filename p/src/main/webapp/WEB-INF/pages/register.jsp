<%--
  Created by IntelliJ IDEA.
  User: bobo
  Date: 2022/2/10
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body style="text-align: center;">
<form action="${pageContext.request.contextPath}/servlit/RegisterServlet"
    method="post">
    <table width="%"border="">
        <tr>
            <td>用户名</td>
            <td><input type="text"name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text"name="pwd"></td>
        </tr>
        <tr>
            <td>确认密码</td>
            <td><input type="text"name="confirmPwd"></td>
        </tr>
        <tr>
            <td>电话号码</td>
            <td><input type="text"name="telephone"></td>
        </tr>
        <tr>
            <td>邮箱地址</td>
            <td><input type="text"name="email"></td>
        </tr>
        <tr>
            <td><input type="reset"value="清空"></td>
            <td><input type="submit"value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
