<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Form tag name, value, label, and key attributes</title>
    <s:head/>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>Form tag name, value, label, and key attributes</h1>
    <h2>See <span class="code">c.p.s.ch06.actions.examples.NameValueLabelKeyAction</span></h2>

    <s:form action="name-value-label-key-process">
      <s:textfield name="foo1"/>
      <s:textfield name="foo2" value="%{'hello'}"/>
      <s:textfield name="foo3" value="%{5 + 5}"/>
      <s:textfield name="foo4" label="%{getText('foo4')}"/>
      <s:textfield key="foo5" />
      <s:submit/>
    </s:form>
  </body>
</html>
