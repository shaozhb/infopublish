<%--
  Created by IntelliJ IDEA.
  User: zhibin.shao
  Date: 2017/12/5
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="gbk" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <base href="<%=basePath%>">
    <title>信息发布系统</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <link rel="stylesheet" href="style/style_menu.css" type="text/css"/>
    <script type="text/javascript" src="style/js/jquery-1.7.1.js"></script>
    <script type="text/javascript">
        $(document).ready(function()){
            $("#adduser").hide();
            $("#updateuser").hide();

        };
        function  addUser(){
            $("#adduser").fadeIn();

        };
        function  updateuser(){
            $("#updateuser").fadeIn();
        }
        function  hidden(){
            $("#adduser").fadeOut();
            $("#updateuser").fadeOut();
        }

    </script>
</head>
<body>
<div id="title">
    <h3>用户管理</h3>
<hr>
    <br>
    <table cellspacing="1">
        <tr bgcolor="d3eaef" align="center">
            <td>姓名</td>
            <td>用户名</td>
            <td>密码</td>
            <td>基本操作</td>
        </tr>
        <c:forEach items="${userlist}" var="one">
            <tr bgcolor="#FFFFFF" align="center">
                <td>${one.name}</td>
                <td>${one.username}</td>
                <td>${one.password}</td>
                <td>
                    <a href="userAction_deleteUser.action?id=${one.id}">
                        <img src="style/images/delete.png"/>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <button style="margin-left: 62%;" class="button" onclick="addUser()">
        <img src="style/images/add.gif" style="margin-left: -5px;margin-right: 3px;"/>添加
    </button>
    <td><a href="userAction_deleteUser.action?id=${one.id}"><img src="style/images/add.gif" style="margin-left: -5px;margin-right: 3px"/>添加</td>
</div>
<form id="login" method="post" action="<%request.getContextPath();%>/userAction_login.action">
    <input type="text" name="user.username" value="请输入用户名" onfocus="this.value=''"><br/><br/>
    <input type="password" name="user.password"/><br/><br/>
    <input type="submit" value="登    录"><br/>
</form>
</body>
</html>
