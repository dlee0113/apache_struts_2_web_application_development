<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Subset Filter Example</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>" />
  </head>

  <body>
    <h1>Subset Filter Example</h1>

    <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.SubsetFilterAction</span></h2>

    <s:generator separator="," val="%{'a, b, c, d, e, f'}">
      <s:subset decider="theDeciderer">
        <s:iterator> <s:property /> </s:iterator>
      </s:subset>
    </s:generator>
  </body>
</html>
