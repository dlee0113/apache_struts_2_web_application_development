<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Sanity check JSP page</title>
  </head>

  <body>
    <h1>Sanity check JSP page</h1>

    <p>
      If this page was reached via the <em>sanity.action</em> and
      the project is configured correctly we should see a string
      between these brackets: [<s:property value="sanityCheck" />].
      If the page was reached by directly addressing <em>sanity.jsp</em>
      then nothing will appear.
    </p>

    <s:set var="shorter" value="%{'hi'}" />
    <p><s:property value="shorter"/> there</p>

    <s:action name="test-include" var="ti"/>
    <p><s:property value="ti.hello"/></p>
  </body>
</html>
