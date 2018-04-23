<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/22
  Time: 13:01
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
</head>
<body>
<form method="post" action="saveResume1">
    <h3>基本信息</h3>
    姓名：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="res_name" onfocus="this">
    <br>性别：&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="res_sex" value="男" checked="checked">男
          <input type="radio" name="res_sex" value="女">女
    <br> 年龄：&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="res_age" min="18" max="120">
    <br> 手机号码：<input type="number" name="res_tel" min="11111111111" max="99999999999">
    <br> 邮箱地址：<input type="email" name="res_email"><br>
    <h3>教育背景</h3>
    学校名称：<input type="text" name="edu_school">
    <br> 专业名称：<input type="text" name="edu_major">
    <br> 学历/学位：<input name="edu_degree">
    <br> 入学时间：<input type="date" name="edu_in">
    <br> 毕业时间：<input type="date" name="edu_out"><br>
    <h3>工作经验</h3>
    公司名称：<input name="exp_company">
    <br>入职时间：<input type="date" name="exp_in">
    <br> 离职时间：<input type="date" name="exp_out">
    <br> 行业类别：<input type="text" name="exp_trade">
    <br> 职位名称：<input type="text" name="exp_post"><br>
    <input type="submit" value="确认提交" height="50px" width="100px">
</form>
</body>
</html>
