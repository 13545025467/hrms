<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 15:57
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
        .treebox{
            margin-left: 117px;
            background: blue;
            width: 160px;
            height: 400px;
            font-size: 12px
        }

        ul,li{list-style-type:none;}
        a {color:black;text-decoration:none;}
    </style>
</head>
<body>
<div class="treebox">
    <ul class="menu">
        <li class="level1">
            <a href="#none"><span style="font-size: 16px">员工管理</span><i class="down"></i></a>
            <ul class="level2">
                <li><a href="javascript:;"target="rightWindow">员工信息</a></li>
                <li><a href="javascript:;"target="rightWindow">薪资结算</a></li>
                <li><a href="javascript:;"target="rightWindow">培训记录</a></li>
                <li><a href="javascript:;"target="rightWindow">考勤记录</a></li>
                <li><a href="javascript:;"target="rightWindow">职务调动</a></li>
            </ul>
        </li>
        <li class="level1">
            <a href="#none"><span style="font-size: 16px">部门管理</span><i></i></a>
            <ul class="level2">
                <li><a href="javascript:;"target="rightWindow">部门信息</a></li>
                <li><a href="javascript:;"target="rightWindow">导航选项</a></li>
                <li><a href="javascript:;"target="rightWindow">导航选项</a></li>
                <li><a href="javascript:;"target="rightWindow">导航选项</a></li>
            </ul>
        </li>
        <li class="level1">
            <a href="#none"><span style="font-size: 16px">考勤管理</span><i></i></a>
            <ul class="level2">
                <li><a href="javascript:;"target="rightWindow">当日记录</a></li>
                <li><a href="javascript:;"target="rightWindow">补签设置</a></li>
                <li><a href="javascript:;" target="rightWindow">导航选项</a></li>
            </ul>
        </li>
        <li class="level1">
            <a href="#none"><span style="font-size: 16px">公司培训</span><i></i></a>
            <ul class="level2">
                <li><a href="" target="rightWindow">历史记录</a></li>
                <li><a href="javascript:;" target="rightWindow">新建培训</a></li>
                <li><a href="javascript:;" target="rightWindow">培训考试</a></li>
                <li><a href="javascript:;" target="rightWindow">导航选项</a></li>
            </ul>
        </li>
        <li class="level1">
            <a href="#none"><span style="font-size: 16px">招聘信息</span><i></i></a>
            <ul class="level2">
                <li><a href="javascript:;" target="rightWindow">发布招聘信息</a></li>
                <li><a href="intoResume" target="rightWindow">查阅简历</a></li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>