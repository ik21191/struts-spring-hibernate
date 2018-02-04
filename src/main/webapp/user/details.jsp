<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head><title>Welcome page</title></head>
<body>
Successfully Saved. Details are below<br/>

<s:property value="user.firstName"/><br/>
<s:property value="user.lastName"/><br/>
<s:property value="user.emailId"/><br/>
<a href = "/">Home</a>
</body>

</html>