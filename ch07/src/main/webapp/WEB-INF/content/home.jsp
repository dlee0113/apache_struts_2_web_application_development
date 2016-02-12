<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Chapter 7 | Validation and Conversion</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>Validation and Conversion</h1>

    <ul>
      <li><a href="<s:url action='new-recipe' namespace='/recipes'/>">New Recipe</a></li>
      <li><a href="<s:url action='message-games' namespace='/examples'/>">Validation Message Games</a></li>
      <li><a href="<s:url action='validators' namespace='/examples'/>">Validators</a></li>
      <li><a href="<s:url action='test-classification' namespace='/examples'/>">Classification Validator</a></li>
      <li><a href="<s:url action='big-decimal-trim' namespace='/examples'/>">BigDecimal TypeConverter</a></li>
    </ul>
  </body>
</html>
