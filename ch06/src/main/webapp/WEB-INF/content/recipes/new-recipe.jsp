<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>RecipeBox | Create New Recipe</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>Create New Recipe</h1>
    
    <s:form action="new-recipe-process">
      <s:textfield key="recipe.name"/>
      <s:textfield key="recipe.description"/>
      <s:checkboxlist key="recipe.recipeTypes"
                      list="recipeTypeOptions"
                      listKey="name" listValue="name"/>
      <s:textarea key="recipe.ingredients" rows="5" cols="40"/>
      <s:textarea key="recipe.directions" rows="5" cols="40"/>
      <s:submit/>
    </s:form>
  </body>
</html>
