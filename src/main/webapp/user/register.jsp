<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Welcome page</title>
</head>
<body>
	Enter details below
	<br />

	<s:form action="/user/saveUser">
		<s:textfield name="userid" label="User ID" />
		<s:password name="password" label="Password" type="password" />
		<s:textfield name="user.firstName" label="First Name" />
		<s:textfield name="user.lastName" label="Last Name" />
		<s:textfield name="user.emailId" label="User ID" />
		<s:textfield name="user.age" label="Age" />
		<s:submit value="Register" />
		<%-- <s:token /> --%>
	</s:form>

</body>

</html>