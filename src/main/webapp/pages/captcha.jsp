<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/14
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证码</title>
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script src="../js/captcha.js"></script>
</head>
<body>
<form action="/doLogin" method="post">
    <input type="text" name="captcha" /><img src="/jcaptcha" onclick="changeImage(this);" alt=""><br />
    <input type="submit" value="提交验证">

</form>

</body>
</html>
