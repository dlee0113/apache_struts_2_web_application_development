<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Validators</title>
    <s:head />
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Validators</h1>

    <h2>See <span class="code">c.p.s.ch07.actions.examples.ValidatorsAction</span></h2>

    <h2>See <span class="code">c.p.s.ch07.actions.examples.ValidatorsAction-validation.xml</span></h2>

    <s:actionerror />

    <s:form action="validators-process">
      <s:textfield key="reqint" />
      <s:textfield key="reqInteger" />

      <s:textfield key="reqd" />
      <s:textfield key="reqDouble" />

      <s:textfield key="email" />
      <s:textfield key="cemail" />

      <s:textfield key="url" />
      <s:textfield key="date" />
      <s:textfield key="arbitraryRegex" />

      <s:submit />
    </s:form>
  </body>
</html>
