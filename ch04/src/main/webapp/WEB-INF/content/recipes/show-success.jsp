<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title><s:text name="recipe.show-recipe.title" /></title>
  </head>

  <body>
    <div id="content">
      <h1><s:text name="recipe.show-recipe.header" /></h1>

      <h2><s:text name="recipe.show-recipe.description.header" /></h2>
      <div id="description">
        ${recipe.description}
      </div>

      <h2><s:text name="recipe.show-recipe.ingredients.header" /></h2>
      <div id="ingredients">
        ${recipe.ingredients}
      </div>
    </div>
  </body>
</html>
