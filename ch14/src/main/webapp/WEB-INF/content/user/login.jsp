<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Login</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Login</h1>

    <s:if test="hasActionErrors()">
      <div id="flash" class="error">
        <s:actionerror/>
      </div>
    </s:if>

    <s:form action="login-process">
      <s:textfield name="email" label="Email"/>
      <s:password name="password" label="Password"/>
      <s:submit value="Login"/>
    </s:form>
  </body>
</html>
