<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User list</h1>
	${UserName}----${PassWord}<br>
	<s:property value="username"/>---<s:property value="passWord"/><br>
	<s:property value="#root[0].username"/><br>
	<s:property value="#root[1].userName"/><br>

	<br>
	${a }-------${b }
	<br>
	<s:property value="#a"/>---------------<s:property value="#b"/>
	<br>
	${c }-------------${d }
	<br>
	<s:property value="#request.c"/>-----------<s:property value="#request.d"/>	
	<s:debug/>
	<br>
	<s:property value="#__component_stack"/>
</body>
</html>