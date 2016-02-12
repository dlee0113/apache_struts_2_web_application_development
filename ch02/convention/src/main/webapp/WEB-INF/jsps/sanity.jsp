<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Sanity check JSP page (under WEB-INF/jsps)</title>
  </head>
  
  <body>
    <h1>Sanity check JSP page (under WEB-INF/jsps)</h1>

    <p>
      If this page was reached via the <b>sanity.action</b> and
      the project is configured correctly we should see a string
      between these brackets: [<s:property value="sanityCheck" />].
      If the page was reached by directly addressing <b>sanity.jsp</b>
      then nothing will appear.
    </p>
  </body>
</html>
