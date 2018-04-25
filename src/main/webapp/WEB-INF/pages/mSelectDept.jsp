<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/24
  Time: 01:36
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
<table border="1px" cellspacing="0" cellpadding="0">
    <caption>所有部门</caption>
    <tr>
        <th>部门编号</th>
        <th>部门名称</th>
        <th>创建时间</th>
        <th>全体员工</th>
        <th>添加职位</th>
        <th>全部职位</th>
    </tr>


    <c:forEach items="${depts}" var="r" varStatus="status">
        <tr>
            <td>${r.dept_id}</td>
            <td>${r.dept_name}</td>
            <td>${r.dept_createtime}</td>
            <td>
                <form action="" method="post">
                    <input type="hidden" name="dept_id" value=${r.dept_id}>
                    <input type="submit" value="全体员工">
                </form>
            </td>
            <td>
                <form method="post" action="addPost1">
                                <%--<form action="addPost1" method="post">--%>
                                <%--<input type="hidden" id="post_name" name="post_name">--%>
                                <%--<input type="hidden" id="post_sal" name="post_sal">--%>
                                <input type="hidden"  name="dept_id" value=${r.dept_id}>
                                <input type="submit" value="添加职位" onclick="prom()" formtarget="rightWindow">
                                <%--</form>--%>
                </form>
            </td>
            <td>
                <form method="post" action="getPostByDept">
                    <input type="hidden"  name="dept_id" value=${r.dept_id}>
                    <input type="submit" value="查看" onclick="prom()" formtarget="rightWindow">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<%--<script>--%>
    <%--function prom() {--%>
        <%--var name = prompt("请输入职位", ""); //将输入的内容赋给变量 name ，--%>
        <%--var sal = prompt("请输入基本工资", ""); //将输入的内容赋给变量 name ，--%>
<%--//prompt有两个参数，前面是提示的话，后面是当对话框出来后，在对话框里的默认值--%>
        <%--if (name){//如果返回的有内容--%>
            <%--var postname = document.getElementById("post_name")  ;--%>
            <%--postname.value=name;--%>
            <%--var postsal = document.getElementById("post_sal")  ;--%>
            <%--postsal.value=sal;--%>
        <%--}--%>
    <%--}--%>
<%--</script>--%>
</body>
</html>
