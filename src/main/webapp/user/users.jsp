<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head><title>All Users Details</title></head>
<body>
<b>List of all Users: </b><br/><br/>

<s:iterator value="users" var="user">
	
	<li>ID: <a href="deleteUser?identifier=<s:property value='id'/>">Delete</a></li>&nbsp;&nbsp;
	<li>ID: <a href="editUser?identifier=<s:property value='id'/>">Edit</a></li>
	<li>User ID: <s:property value="userid"/></li>
	<li>First Name: <s:property value="userDetails.firstName"/></li>
	<li>Last Name: <s:property value="userDetails.lastName"/></li>
	<li>Email ID: <s:property value="userDetails.emailId"/></li>
	<s:if test="hobbies.size()>0">
		<li>
			<s:iterator value="hobbies">
				<font color="red">&nbsp;&nbsp;&nbsp;<s:property /></font>
			</s:iterator>
		</li>
	</s:if>
		
<br/>
</s:iterator>

</body>

</html>