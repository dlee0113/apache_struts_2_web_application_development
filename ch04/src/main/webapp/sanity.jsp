<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Sanity check JSP page</title>
  </head>

  <body>
    <h1>Sanity check JSP page</h1>

    <p>
      If this page was reached via the <strong>sanity.action</strong> and
      the project is configured correctly we should see a string
      between these brackets: [<s:property value="sanityCheck" />].
      If the page was reached by directly addressing <strong>sanity.jsp</strong>
      then nothing will appear.
    </p>

    <h2>Result Configuration</h2>

    <ul>
      <li><a href="<s:url action='dispatcher-long' namespace='/xml-config'/>">XML config, dispatcher result, long form</a></li>
      <li><a href="<s:url action='dispatch-result-example' namespace='/annotations'/>">Annotation config, dispatcher result, override default JSP</a></li>
      <li><a href="<s:url action='redirect-result-example' namespace='/xml-config'/>">XML config, redirect result, to an action</a></li>
      <li><a href="<s:url action='redirect-result-annotation-example' namespace='/annotations'/>">Annoation config, redirect result, to an action</a></li>
      <li><a href="<s:url action='redirect-action-result-example' namespace='/xml-config'/>">XML config, redirectAction, back to here</a></li>
      <li><a href="<s:url action='redirect-action-result-annotation-example' namespace='/annotations'/>">Annotation config, redirectAction</a></li>
      <li><a href="<s:url action='nsresult' namespace='/annotations'/>">Annotation configuration, create non-default mapping for action method</a></li>
    </ul>

    <h2>RecipeBox</h2>

    <ul>
      <li><a href="<s:url action='view-by-id' namespace='/recipes'/>">View Recipe by ID</a></li>
    </ul>
  </body>
</html>
