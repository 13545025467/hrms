<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 01:09
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
<title>
    人力资源管理系统
</title>
    <frameset rows="18%,*" name="allWindow">
        <frame src="managetop.jsp" scrolling="no">
        </frame>
        <frameset cols="30%,60%,*">
            <frame src="manageleft.jsp" noresize="noresize" scrolling="no" frameborder="no"  />
            <frame name="rightWindow" src="http://www.youdao.com" noresize="noresize" ></frame>
            <frame  noresize="noresize" scrolling="no" />
        </frameset>
    </frameset>
</html>
