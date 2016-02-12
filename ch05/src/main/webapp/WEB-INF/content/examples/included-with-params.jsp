<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <body>
    <p>Hey, what are you doing looking in here? Nothing to see.</p>
    <s:property value="foo" />
    <ul>

      <s:iterator value="list1">
        <li><s:property /></li>
      </s:iterator>
    </ul>
  </body>
</html>
