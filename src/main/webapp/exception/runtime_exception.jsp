<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RUNTIME EXCEPTION</title>
</head>
<body>
<font color="red"><b>Exception name:</b></font> <s:property value="exception"/>
<font color="red"><b>Exception stack trace:</b></font> <s:property value="exceptionStack"/>
</body>
</html>