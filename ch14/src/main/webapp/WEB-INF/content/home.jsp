<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Chapter 11 | JavaScript, DOM, and CSS</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>JavaScript, DOM, and CSS</h1>

    <ul>
      <li><a href="<s:url action='new-recipe' namespace='/recipes'/>">New Recipe</a></li>
      <li><a href="<s:url action='list' namespace='/recipes'/>">List Recipes</a></li>
      <li><a href="<s:url action='show-containing-word-input' namespace='/recipes'/>">Show Recipes Containing Word</a></li>
      <li><a href="<s:url action='dojo-anchor' namespace='/examples'/>">Dojo Anchor Tag Examples</a></li>
    </ul>
  </body>
</html>
