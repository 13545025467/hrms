<%@ page import="com.lv.model.Post" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/25
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Set<Post> postSet= (Set<Post>) session.getAttribute("postByDept");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<%if (postSet.size()==0){%>
<p style="color: red">该部门下还没有任何职位</p>
<%}else {%>

    <table border="1px" cellpadding="0" cellspacing="0" style="background: paleturquoise">
        <caption>职位列表</caption>
        <tr>
            <th>职位名称</th>
            <th>基本薪资</th>
            <th>修改职位</th>
            <th>删除职位</th>
        </tr>
        <c:forEach items="${postByDept}" var="r" varStatus="status">
            <tr>
                <form method="post" action="updatePost">
                <td><input type="text" name="name" value=${r.post_title}></td>
                <td><input type="number" name="post_sal" value=${r.post_sal}></td>
                <td>
                    <input type="hidden" name="post_id" value=${r.post_id}>
                    <input type="submit" value="修改">
                </td>
                </form>
                <td>
                <form method="post" action="deletePost">
                        <input type="hidden" name="post_id" value=${r.post_id}>
                        <input type="submit" value="删除">
                </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<%}%>
</body>
</html>
