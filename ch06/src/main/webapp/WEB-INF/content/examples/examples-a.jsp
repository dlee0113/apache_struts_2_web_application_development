<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <s:head/>
  </head>

  <body>
    <s:form>
      <s:textfield name="foo1" label="hi"/>
      <s:textfield name="foo2" value="imm"/>
      <s:checkbox key="boola"/>
      <s:checkbox key="boolb"/>
      <s:checkbox key="sbool" value="true"/>
      <s:checkboxlist name="theCheckboxes" list="forCheckboxes" listValue="id" listKey="label"/>
      <s:submit/>
    </s:form>
  </body>
</html>
