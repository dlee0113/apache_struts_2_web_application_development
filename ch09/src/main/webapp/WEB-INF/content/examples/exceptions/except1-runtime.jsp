<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>'except1' action's RuntimeException Result</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>'except1' action's RuntimeException Result</h1>

    <h2>See <span class="code">com.packt.s2wad.ch09.examples.exceptions.Except</span></h2>

    <h2>See <span class="code">struts.xml</span></h2>

    <p>This result is configured only for the 'except1' action.</p>

    <p>Here's the message from the exception: <s:property value="exception.message"/></p>
  </body>
</html>
