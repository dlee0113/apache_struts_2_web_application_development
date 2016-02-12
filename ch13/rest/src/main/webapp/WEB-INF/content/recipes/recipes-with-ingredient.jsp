<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Recipes</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Other recipes with ${ingredient.name}</h1>

    <s:iterator value="%{recipes}">
      <s:url action="show" var="recipeUrl">
        <s:param name="recipe.id" value="%{id}"/>
      </s:url>

      <a href="${recipeUrl}">${name}</a>
      <br/>
    </s:iterator>
  </body>
</html>
