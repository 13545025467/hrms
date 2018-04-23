<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/22
  Time: 21:27
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
<form method="post" action="updateResume1">
<h3>基本信息</h3>
姓名:<input name="res_name" value= ${sessionScope.resume.res_name} ><br>
性别：<input type="radio" name="res_sex" value="男" checked="checked">男
    <input type="radio" name="res_sex" value="女">女<br>
年龄：<input type="number" name="res_age" min="18" max="120" value= ${sessionScope.resume.res_age} ><br>
手机号码：<input type="number" name="res_tel" min="11111111111" max="19999999999" value= ${sessionScope.resume.res_tel}><br>
邮箱地址：<input type="email" name="res_email" value=${sessionScope.resume.res_email}><br>
<h3>教育背景</h3>
学校名称：<input name="edu_school" value=${sessionScope.education.edu_school}><br>
专业名称：<input name="edu_major" value=${sessionScope.education.edu_major}><br>
学历/学位：<input  name="edu_degree" value=${sessionScope.education.edu_degree}><br>
入学时间：<input name="edu_in" type="date" value=${sessionScope.education.edu_in}><br>
毕业时间：<input  name="edu_out" type="date" value=${sessionScope.education.edu_out}><br>
<h3>工作经验</h3>
公司名称：<input name="exp_company" value=${sessionScope.experience.exp_company}><br>
入职时间：<input type="date" name="exp_in" value=${sessionScope.experience.exp_in}><br>
离职时间：<input  type="date" name="exp_out" value=${sessionScope.experience.exp_out}><br>
行业类别：<input name="exp_trade" value=${sessionScope.experience.exp_trade}><br>
职位名称：<input name="exp_post" value=${sessionScope.experience.exp_post}><br>
<br>
    <input type="submit" value="确认修改">
</form>
</body>
</html>
