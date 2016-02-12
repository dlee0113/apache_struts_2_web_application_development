<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
  <head>
    <title>RecipeBox | <s:text name="recipe.show.title" /></title>
    <s:head />
    <sx:head />
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <div id="content">
      <h1><s:text name="recipe.show.header" /></h1>

      <h2><s:text name="recipe.description" /></h2>

      <div id="description">
        ${recipe.description}
      </div>

      <div id="ingredients">
        <table>
          <tr>
            <th>Quantity</th>
            <th>Ingredient</th>
          </tr>

          <s:iterator value="recipe.ingredients" var="ring">
            <s:url action="show" namespace="/ingredients" var="ingUrl">
              <s:param name="ingredientId" value="#ring.ingredient.id" />
            </s:url>

            <tr>
              <td><s:property value="%{quantity}" /></td>
              <td>
                <sx:a href="%{ingUrl}" targets="ingredientInfo" highlightColor="#c99" highlightDuration="1000"
                      afterNotifyTopics="/updateRecipes" id="ing_%{ingredient.id}">
                  <s:property value="%{ingredient.name}" />
                </sx:a>
              </td>
            </tr>
          </s:iterator>
        </table>
      </div>

      <div id="ingredientInfo">
      </div>

      <s:url action="recipes-with-ingredient" var="withUrl" />
      <sx:div id="recipesWithIngredient" href="%{withUrl}" preload="false" listenTopics="/updateRecipes"
              afterNotifyTopics="/resetUrl" highlightColor="#c99" highlightDuration="1000"></sx:div>
    </div>

    <script type="text/javascript">
      var baseUrl; // A global! Don't dothis ina real app.
      dojo.event.topic.subscribe("/updateRecipes", function(data, request, widget) {
        var ingredientId = widget.widgetId.split("_")[1];
        var dest = dojo.widget.byId("recipesWithIngredient");
        baseUrl = dest.href; // Referencing a global!
        dest.href += "?ingredientId=" + ingredientId;
      });

      dojo.event.topic.subscribe("/resetUrl", function(data, request, widget) {
        widget.href = baseUrl; // Restore URL from global!
      });
    </script>
  </body>
</html>
