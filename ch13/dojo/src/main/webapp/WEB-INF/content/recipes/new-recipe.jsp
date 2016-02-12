<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <s:head />
    <title>RecipeBox | <s:text name="new.title" /></title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
    <script type="text/javascript" src="<s:url value="/jquery/jquery-1.2.6.js"/>"></script>
  </head>

  <body>
    <s:form action="new-recipe-process" theme="s2wad">
      <tr>
        <td colspan="2">
          <h2><s:text name="new.title" /> Info</h2>
        </td>
      </tr>

      <s:textfield key="recipe.name" size="30" cssErrorClass="inputError" />
      <s:textfield key="recipe.description" size="60" cssErrorClass="inputError" />
      <s:checkboxlist key="recipe.recipeTypes" list="recipeTypeOptions"
                      listKey="name" listValue="name" cssErrorClass="inputError" />

      <tr>
        <td colspan="2"><h2><s:text name="recipe.ingredients.header" /></h2></td>
      </tr>

      <s:iterator value="{1, 2, 3}" var="idx" status="stat">
        <tr>
          <td class="tdLabel">
            <label class="label">
              <s:text name="recipe.ingredient" /> #${idx}:
            </label>
          </td>

          <td>
            <s:textfield name="recipe.ingredients[%{#stat.index}].quantity" theme="simple" size="5" />
            <s:textfield name="recipe.ingredients[%{#stat.index}].name" theme="simple" size="30" />
          </td>
        </tr>
      </s:iterator>

      <tr id="addRow">
        <td>&nbsp;</td>
        <td>
          <a href="#" onclick="return Recipe.addRow()">
            Add Ingredient
          </a>
        </td>
      </tr>

      <tr>
        <td colspan="2"><h2><s:text name="recipe.directions" /></h2></td>
      </tr>

      <tr>
        <td colspan="2">
          <s:textarea key="recipe.directions" rows="5" cols="40" cssErrorClass="inputError" theme="simple" />
        </td>
      </tr>

      <s:submit />
    </s:form>

    <script src="<s:url value="/js/recipe/recipe.js"/>" type="text/javascript"></script>
    <script type="text/javascript">Recipe.prepare('<s:text name="recipe.ingredient"/>', 3);</script>
  </body>
</html>
