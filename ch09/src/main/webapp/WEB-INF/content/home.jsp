<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Chapter 9 | Exceptions and Logging</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>Exceptions and Logging</h1>

    <ul>
      <li><a href="<s:url action='new-recipe' namespace='/recipes'/>">New Recipe</a></li>
      <li><a href="<s:url action='except'/>">Global exception result</a></li>
      <li><a href="<s:url action='except1'/>">Action-specific exception result</a></li>
      <li><a href="<s:url action='except2'/>">Action-specific exception mapping <strong>AND</strong> result</a></li>
      <li><a href="<s:url action='noaccess'/>">Application-specific UserAccessException</a></li>
    </ul>
  </body>
</html>
