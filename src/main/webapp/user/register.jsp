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
		
		<!-- if fieldValue is not used then value will be set to true/false -->
		<s:checkbox name="hobbies" fieldValue="Dancing" label="Dancing"/>
		<s:checkbox name="hobbies" fieldValue="Singing" label="Singing"/>
		<s:checkbox name="hobbies" fieldValue="Reading" label="Reading"/>
		<s:checkbox name="hobbies" fieldValue="Writing" label="Writing"/>
		
		<%-- <s:checkbox name="hobbies" value="Dancing" label="Dancing"/>
		<s:checkbox name="hobbies" value="Singing" label="Singing"/>
		<s:checkbox name="hobbies" value="Reading" label="Reading"/>
		<s:checkbox name="hobbies" value="Writing" label="Writing"/> --%>
		
		<s:submit value="Register" />
		<%-- <s:token /> --%>
	</s:form>

</body>

</html>