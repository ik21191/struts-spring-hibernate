<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Welcome page</title>
</head>
<body>
	Enter details below
	<br />

	<s:form action="updateUser">
	<s:hidden name="id" value="%{user.id}"/>
		<s:textfield name="userid" value="%{user.userid}" label="User ID" />
		<s:hidden name="password" value="%{user.password}"/>
		<s:textfield name="userDetails.firstName" value="%{user.userDetails.firstName}" label="First Name" />
		<s:textfield name="userDetails.lastName" value="%{user.userDetails.lastName}" label="Last Name" />
		<s:textfield name="userDetails.emailId" value="%{user.userDetails.emailId}" label="Email ID" />
		<s:textfield name="userDetails.age" value="%{user.userDetails.age}" label="Age" />
		
		<!-- if fieldValue is not used then value will be set to true/false -->
		
		<s:iterator value="%{user.hobbies}" var="hobby">
			<s:checkbox name="hobbies" fieldValue="%{hobby}" label="%{hobby}"/>
		</s:iterator>
		
		<s:submit value="Update" />
		<%-- <s:token /> --%>
		<br/><a href = "../">Home</a>
	</s:form>

</body>

</html>