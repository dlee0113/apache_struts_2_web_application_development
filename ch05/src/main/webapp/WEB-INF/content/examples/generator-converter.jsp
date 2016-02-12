<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Generator Converter Example</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>" />
  </head>

  <body>
    <h1>Generator Converter Example</h1>

    <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.GeneratorConverterAction</span></h2>

    <s:generator val="%{'0,1,2,4,5'}"
                 var="dates" separator=","
                 converter="calConverter" />
    <s:iterator var="aData" value="#dates">
      <s:date name="#aData" format="yyyy-MM-dd" />
      <br />
    </s:iterator>
  </body>
</html>
