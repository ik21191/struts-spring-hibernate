<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head><title>Welcome page</title></head>
<body>
User Id: <s:property value="userid"/><br/>
First Name: <s:property value="userDetails.firstName"/><br/>
Last Name: <s:property value="userDetails.lastName"/><br/>
Email ID: <s:property value="userDetails.emailId"/><br/>

<br/><a href = "../">Home</a>
</body>

</html>