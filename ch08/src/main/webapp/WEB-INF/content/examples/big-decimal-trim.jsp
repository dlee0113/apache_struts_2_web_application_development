<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Big Decimal Type Converter</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Big Decimal Type Converter</h1>

    <h2>See <span class="code">c.p.s.ch08.actions.examples.BigDecimalTrimAction</span></h2>

    <h2>See <span class="code">c.p.s.ch08.examples.BigDecimalTrimmingConverter</span></h2>

    <s:form action="big-decimal-trim-process">
      <s:textfield key="big" />
      <s:submit />
    </s:form>
  </body>
</html>
