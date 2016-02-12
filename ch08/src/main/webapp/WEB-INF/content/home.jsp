<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Chapter 8 | Interceptors</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>Interceptors</h1>

    <ul>
      <li><a href="<s:url action='new-recipe' namespace='/recipes'/>">New Recipe</a></li>
      <li><a href="<s:url action='big-decimal-trim' namespace='/examples'/>">BigDecimal TypeConverter</a></li>
      <li><a href="<s:url action='trim!input' namespace='/xml/interceptors'/>">Trim interceptor, XML config, no trimming</a></li>
      <li><a href="<s:url action='trim2!input' namespace='/xml/interceptors'/>">Trim interceptor, XML config, trimming</a></li>
      <li><a href="<s:url action='trim' namespace='/anno/interceptors'/>">Trim interceptor, Annotation config, trimming</a></li>
      <li><a href="<s:url action='mapping' namespace='/xml/interceptors'/>">Result mapping, "strangeSuccess" remapped</a></li>
      <li><a href="<s:url action='mapping!input' namespace='/xml/interceptors'/>">Result mapping, "irritatingInput" remapped</a></li>
      <li><a href="<s:url action='mapping!notmapped' namespace='/xml/interceptors'/>">Result mapping, "napmapped" <strong>NOT</strong> remapped</a></li>
    </ul>
  </body>
</html>
