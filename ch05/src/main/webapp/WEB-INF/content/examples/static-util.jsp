<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Static method access</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  </head>

  <body>
    <h1>Static method access</h1>
    <h2>See <span class="code">com.packt.s2wad.utils.UtilClass</span> for the util. (It's boring!)</h2>

    <p><s:property value="@com.packt.s2wad.utils.UtilClass@repeat(20, '*')"/></p>
  </body>
</html>
