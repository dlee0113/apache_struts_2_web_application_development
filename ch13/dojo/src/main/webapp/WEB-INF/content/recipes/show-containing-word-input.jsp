<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
  <head>
    <title>Show Recipes Containing Word</title>
    <s:head/>
    <sx:head/>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <div id="content">
      <h1>Show Recipes Containing Word</h1>

      <s:form action="show-containing-word">
        <s:textfield label="Recipe Word" name="recipeWord" />
        <sx:submit targets="recipesWithWord" highlightColor="#ccc" highlightDuration="500"/>
      </s:form>

      <div id="recipesWithWord"></div>
    </div>
  </body>
</html>
