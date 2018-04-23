<%@ page import="com.lv.model.User" %><%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/21
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String str= (String) session.getAttribute("error");
    String str2= (String) session.getAttribute("error2");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>

</head>
<body>


<form method="post" action="login">
    <select onchange="changeCateory($(this))" style="font-size: 11px; background: #4991cf;
                        color: #fff;"  name="differentUser">
        <option
                value="1" selected='selected'>
            用户登录</option>

        <option
                value="2" >
            员工登录</option>
        <option
                value="3" >
            管理员登录</option>
    </select><br>
    账号:<input type="text" name="user_name" autofocus="true" placeholder="用户名" style="width: 140px"></input><br/>
    密码:<input type="password" name="user_pass"
              placeholder="密码" style="width: 140px"></input><br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录" style="background: green ;width: 100px;height: 40px;font-size: 30px" formtarget="allWindow"></input>
</form>
<%if(str!=null){%>
<p style="color: red">
    <%= str%>
</p>

<%}%>
<hr style="width: 210px;height: 10px ;color:#FF0000" >

<form method="post" action="register">
    账号:<input type="text" name="user_name" autofocus="true" placeholder="用户名" style="width: 140px"></input><br/>
    密码:<input type="password" name="user_pass"
              placeholder="密码" style="width: 140px"></input><br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="注册" style="background: red ;width: 100px;height: 40px;font-size: 30px" formtarget="allWindow"></input>
</form>
<%if(str2!=null){%>
<p style="color: red">
    <%= str2%>
</p>

<%}%>
</body>
</html>
