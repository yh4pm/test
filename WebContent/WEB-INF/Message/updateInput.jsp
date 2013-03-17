<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Message addInput</h1>
	<form action="Message_add.action" method="post">
		ID:<input type="text" name="id" value='<s:property value="id"/>'/><br/>
		Title:<input type="text" name="title" value='<s:property value="title"/>'/><br/>
		Content:<input type="text" name="content" value='<s:property value="content"/>'/><br/>
		Point:<input type="text" name="point">
		<input type="submit"/>
	</form>
</body>
</html>