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
	<h1>User Show</h1>
<s:if test="#age<10">
	年龄小于10
</s:if>	
<s:elseif test="#age>=10 and #age<=20">
	未成年
</s:elseif>
<s:else>
	已经成年
</s:else>
<br>

<s:iterator value="#users" var="u" status="sst">
	<div <s:if test="#sst.odd">style="background:#ff0"</s:if> >
		<s:property value="#u.id"/>---<s:property value="username"/>---<s:property value="nickname"/>
		---<s:property value="#sst.odd"/>---<s:property value="#sst.count"/>---<s:property value="#sst.last"/>
		---<s:property value="#root[1].userName"/> <br>
	</div>
</s:iterator>

<br>
<s:property value="userName"/>
<s:debug/>
</body>
</html>