<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Packt S2WAD | Home</title>
  </head>

  <body>
    <h1>Chapter 3 Links</h1>

    <ul>
      <li><a href="<s:url namespace="/i18n" action="text-examples"/>">I18N - TextExamplesAction</a></li>
      <li><a href="<s:url namespace="/i18n/sub" action="text-examples-sub"/>">I18N - TextExamplesSubAction</a></li>
      <li><a href="<s:url namespace="/recipes" action="new-recipe-input"/>">Enter New Recipe</a></li>
    </ul>
  </body>
</html>
