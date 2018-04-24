<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
    <style>
        a {color:black;text-decoration:none;}
    </style>
</head>
<body>
<div id="logo" style="width: 1340px;height: 72px;background: blue">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SH0001员工：${sessionScope.manage.man_name}，欢迎您！ <a href="MyInfo/Index.aspx.html" target="rightWindow">我的信息</a> <a href="User/StudentInfor/systemMsge.aspx.html" target="rightWindow">
    通知</a> <a href="User/Account/ChangePasswd.aspx.html" target="rightWindow">密码修改</a> <a onclick="loginOut()" href="javascript:">安全退出</a>
    <br><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="Index.aspx.html" target="rightWindow">我的信息</a>
    <a href="EducationCenter/Score.aspx.html"target="rightWindow">今日考勤</a>
    <a href="MyAccount/wdcw.aspx.html" target="rightWindow">员工信息</a>
    <a href="calendar" target="rightWindow">查看日历</a>
</div>
</body>
</html>
