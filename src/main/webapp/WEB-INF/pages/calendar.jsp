<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 23:58
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
    <%--<link href="../css/theme.min.css" type="text/css" rel="stylesheet" />--%>
    <%--<link href="../css/style.css" type="text/css" rel="stylesheet" />--%>
    <style type="text/css">
        body{
            font-family:"Arial","Microsoft YaHei","榛戜綋","瀹嬩綋","sans-serif";
            -ms-user-select:none;
        }
        body a{
            cursor:pointer;text-decoration:none;
        }
        .aboluo-w-700{
            width:700px;
            height:400px;
            margin:50px auto;
            padding:30px auto;
        }
        .aboluo-leftdiv{
            position:relative;
            float:left;
            width:70%;
            height:100%;
            border:2px solid #6cd3fb;
        }
        .aboluo-rightdiv{
            width:20%;
            height:100%;
            background:#6cd3fb;
            border:2px solid #6cd3fb;
        }
        .aboluo-tools{
            position:relative;
            line-height:10px;
            height:7%;
            padding:10px;
            border-bottom:#d0f7fd solid 1px;
        }
        .aboluo-rilidiv{
            position:relative;
            width:100%;
            height:90%;
            padding-left:2%;
            padding-right:2%;
        }

        .aboluo-calendar-select-year{
            width:30%;float:left;}
        .aboluo-calendar-select-year select {
            width:100%;}
        .aboluo-calendar-month{
            width:30%;float:left;margin-left:20px;line-height: 10px;}
        .aboluo-calendar-month a{
            font-size:16px;text-align:center;color:#008080;text-decoration:none;}
        .aboluo-calendar-month select{
            width:60%;}
        .aboluo-tools .aboluo-toToday{
            width:20%;border:1px solid #f5f5f5;margin-left:15px;margin-top:4px;color:#b7b7b7;background:#ffffff;}
        .aboluo-tools .aboluo-toToday:hover{
            border:1px solid #1a8cff;}
        .aboluo-rilitable{
            width:96%;text-align:center;hegiht:100%;padding-top:5px;}
        .aboluo-rilitable .aboluo-rilithead{
            border-bottom: 1px solid #e3e4e6;}
        .aboluo-rilidiv .aboluo-rilitable tr{
            width:100%;}
        .aboluo-rilidiv .aboluo-rilitable tr th{
            width:14.2%;font-size:16px;}
        .aboluo-rilidiv .aboluo-rilitable tr td{
            width:14.2%;font-size:20px;color:#000000;}
        .aboluo-rilidiv .aboluo-rilitable tr .aboluo-currToday{
            background:#FFBB00;color:#FFFFFF;}
        .aboluo-rilidiv .aboluo-rilitable tr .aboluo-tdcurrToday{
            background:#FFBB00;color:#FFFFFF;}
        .aboluo-rilidiv .aboluo-rilitable tr td a{
            font-size:24px;color:#000000;display:block;margin:auto;position:relative;}
        .aboluo-rilidiv .aboluo-rilitable .aboluo-td-a-ban{
            font-size:13px;position:absolute;text-align:left;line-height:14px;text-indent:1px;width:15px;display:block;background:#969799;height:15px;color:#fff;overflow:hidden;top:0px;left:0px;}
        .aboluo-rilidiv .aboluo-rilitable .aboluo-td-a-xiu{
            font-size:13px;position:absolute;text-align:left;line-height:14px;text-indent:1px;width:15px;display:block;background:#f43;height:15px;color:#fff;overflow:hidden;top:0px;left:0px;}
        .aboluo-rilidiv .aboluo-rilitable tr td a:hover{
            border:3px solid #FFBB00;cursor:pointer;}
        .aboluo-rilidiv .aboluo-rilitable tr td .aboluo-aclick{
            border:3px solid #FFBB00;}
        .aboluo-rilidiv .aboluo-rilitable .aboluo-rilitbody .aboluo-pervMonthDays{
            color:#BFBFC5;
        }
        .aboluo-rilidiv .aboluo-rilitable .aboluo-rilitbody .aboluo-nextMonthDays{
            color:#BFBFC5;
        }
        .aboluo-rightdiv p{
            color:#FFFFFF;margin:10px auto;
        }
        .aboluo-rightdiv .aboluo-xssj span{
            margin-left:5px;
        }
        .aboluo-rightdiv .aboluo-currday{
            width:60%;height:20%;margin:auto;text-align:center;background:#FFBB00;font-size:50px;
        }
    </style>
</head>
<body>
<div class="aboluo-w-700">
    <div class="aboluo-leftdiv">
        <div class="aboluo-tools">
            <div class="aboluo-calendar-select-year"></div>
            <div class="aboluo-calendar-month">
                <a class="aboluo-month-a-perv" href="javascript:;">&lt; </a>
                <a class="aboluo-month-a-next" href="javascript:;"> &gt;</a>
            </div>
            <input type="button" class="aboluo-toToday" value="返回今天" />
        </div>
        <div class="aboluo-rilidiv">
            <table class="aboluo-rilitable" cellspacing="0" cellpadding="0" >
                <thead class="aboluo-rilithead">
                <tr>
                    <th>一</td>
                    <th>二</td>
                    <th>三</td>
                    <th>四</td>
                    <th>五</td>
                    <th style="color:red;">六</td>
                    <th style="color:red;">日</td>
                </tr>
                </thead>
            </table>
        </div>
    </div>
    <div class="aboluo-rightdiv">
        <p class="aboluo-xssj"><p>
        <p class="aboluo-currday"></p>
        <p class="aboluo-ssjjr"></p>
        <p class="aboluo-xsmx"></p>
    </div>
</div>

<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="../js/script.js"></script>
</body>
</html>
