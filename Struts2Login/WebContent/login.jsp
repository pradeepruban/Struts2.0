<%@ taglib uri="/struts-tags" prefix="struts2"%>
<html>
<body>
 <h2> Welcome to STruts2 Login Page</h2>
  <struts2:form action="login.action">
   <struts2:textfield name="userName" label="LoginName"/>
   <struts2:password name="password" label="Password"/>
   <struts2:submit value="Login"/>
  </struts2:form>
</body>
</html>
