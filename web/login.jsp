<%--
  Created by IntelliJ IDEA.
  User: zhibin.shao
  Date: 2017/12/5
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="gbk" import="java.util.*" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <link rel="stylesheet" href="style/style_login.css" type="text/css"/>
</head>
<body>
<div id="title">
    <h1 style="font-size: 80px ;font-family: 黑体; color: #FFFFFF;">信息发布系统</h1>

</div>
<form id="login" method="post" action="<%request.getContextPath();%>/userAction_login.action">
<input type="text" name="user.username" value="请输入用户名" onfocus="this.value=''"><br/><br/>
    <input type="password" name="user.password"/><br/><br/>
    <input type="submit" value="登    录"><br/>
</form>
</body>
</html>
