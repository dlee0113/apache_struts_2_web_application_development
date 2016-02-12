<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Enter New Recipe</title>

    <style type="text/css">
      td {
        vertical-align: top;
      }

      .error {
        color: red;
        font-weight: bold;
      }

      ul.errormessage {
        list-style: none;
      }
    </style>
  </head>

  <body>
    <h1>Enter New Recipe</h1>

    <form id="new" name="new" action="new-recipe" method="post">
      <table>
        <tr>
          <td>Recipe name:</td>
          <td>
            <s:if test="getFieldErrors().get('recipe.name') != null">
              <div class="error">
                <s:property value="getFieldErrors().get('recipe.name')[0]" />
              </div>
            </s:if>
            <input type="text" id="recipe_name" name="recipe.name"
                   value="<s:property value="recipe.name"/>" />
          </td>
        </tr>

        <tr>
          <td>Recipe description:</td>
          <td><input type="text" id="recipe_description" name="recipe.description" /></td>
        </tr>

        <tr>
          <td>Recipe ingredients:</td>
          <td>
            <s:if test="getFieldErrors().get('recipe.ingredients') != null">
              <div class="error">
                <s:fielderror fieldName="recipe.ingredients" />
              </div>
            </s:if>
            <textarea id="recipe_ingredients" name="recipe.ingredients" rows="5" cols="40">
              <s:property value="recipe.ingredients" />
            </textarea>
          </td>
        </tr>

        <tr>
          <td>Recipe directions:</td>
          <td>
            <textarea id="recipe_directions" name="recipe.directions" rows="5" cols="40">
              <s:property value="recipe.directions" />
            </textarea>
          </td>
        </tr>

        <tr>
          <td colspan="2">
            <input type="submit" value="Submit" />
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
