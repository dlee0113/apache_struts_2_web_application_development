<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title><s:text name="recipe.view-by-id.title"/></title>
    <s:head/>
  </head>

  <body>
    <div id="content">
      <h1><s:text name="recipe.view-by-id.title"/></h1>

      <s:form action="view-by-id-process">
        <s:textfield key="recipe.id"/>
        <s:submit/>
      </s:form>
    </div>
  </body>
</html>
