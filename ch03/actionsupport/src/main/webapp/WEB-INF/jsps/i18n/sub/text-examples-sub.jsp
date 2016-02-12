<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <style type="text/css">
      dt {
        font-weight: bold;
      }
    </style>
  </head>

  <body>
    <h1>I18N Examples</h1>
    <dl>
      <dt>From TextExamplesSubAction.properties:</dt>
      <dd><s:text name="overridden.msg"/></dd>

      <dt>From superclass's properties:</dt>
      <dd><s:text name="superclass.msg"/></dd>
    </dl>
  </body>
</html>
