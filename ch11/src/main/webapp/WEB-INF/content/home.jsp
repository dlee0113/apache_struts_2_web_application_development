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
      <li><a href="<s:url action='jquery-onclick-example' namespace='/examples'/>">Using jQuery to add onclick handlers</a></li>
      <li><a href="<s:url action='jquery-onclick-example2' namespace='/examples'/>">As above, but using immediate execution trick</a></li>
    </ul>
  </body>
</html>
