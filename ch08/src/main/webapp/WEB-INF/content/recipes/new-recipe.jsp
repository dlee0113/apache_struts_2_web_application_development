<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>RecipeBox | Create New Recipe</title>
    <s:head />
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Create New Recipe</h1>

    <s:form action="new-recipe-process">
      <s:textfield key="recipe.name" />
      <s:textfield key="recipe.description" />
      <s:checkboxlist key="recipe.recipeTypes"
                      list="recipeTypeOptions"
                      listKey="name" listValue="name" />

      <s:iterator value="{1,2,3,4,5,6,7,8,9,10}" var="idx">
        <tr>
          <td><s:property value="%{getText('recipe.ingredientn', { #idx })}" /></td>
          <td>
            <s:textfield name="recipe.ingredients[%{#idx-1}].quantity" size="4" theme="simple" />
            <s:textfield name="recipe.ingredients[%{#idx-1}].name" size="30" theme="simple" />
          </td>
        </tr>
      </s:iterator>

      <s:textarea key="recipe.directions" rows="5" cols="40" />
      <s:submit />
    </s:form>
  </body>
</html>
