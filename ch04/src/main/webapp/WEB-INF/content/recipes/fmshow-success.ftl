<html>
  <head>
    <title><@s.text name="recipe.show-recipe.title"/> (FreeMarker)</title>
  </head>

  <body>
    <div id="content">
      <h1><@s.text name="recipe.show-recipe.header"/> (FreeMarker)</h1>
      <h2><@s.text name="recipe.show-recipe.description.header"/></h2>
      <div id="description">
        ${recipe.description}
      </div>
    </div>
  </body>
</html>
