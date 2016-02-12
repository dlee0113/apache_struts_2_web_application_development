<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Validation Message Games</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Validation Message Games</h1>

    <h2>See <span class="code">c.p.s.ch07.actions.examples.MessageGamesAction</span></h2>

    <s:form action="message-games-process">
      <s:textfield key="name" />
      <s:textfield key="showMinOrMax" />
      <s:submit />
    </s:form>
  </body>
</html>
