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
		<s:textfield name="userDetails.firstName" label="First Name" />
		<s:textfield name="userDetails.lastName" label="Last Name" />
		<s:textfield name="userDetails.emailId" label="Email ID" />
		<s:textfield name="userDetails.age" label="Age" />
		<s:submit value="Register" />
		<%-- <s:token /> --%>
	</s:form>

</body>

</html>