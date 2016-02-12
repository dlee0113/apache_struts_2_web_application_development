<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Conditionals</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  </head>

  <body>
    <h1>Conditionals</h1>
    <h2>See <span class="code">com.packt.s2wad.actions.examples.ConditionalsAction</span></h2>

    <p>
      <s:if test="aBooleanExpression">
        Printed when test is true.
      </s:if>
      <s:elseif test="aDifferentBooleanExpression">
        Printed if previous test was false and this one is true.
      </s:elseif>
      <s:else>
        Printed if neither were true.
      </s:else>
    </p>
  </body>
</html>
