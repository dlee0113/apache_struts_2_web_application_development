<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Property Tag Examples</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  </head>

  <body>
    <h1>Property Tag Examples</h1>
    <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.PropertyTagAction</span></h2>

    <dl>
      <dt>Property with HTML, default <span class="code">escape (true)</span>:</dt>
      <dd><s:property value="escapeExample"/></dd>

      <dt>Property with HTML, setting <span class="code">escape="false"</span>:</dt>
      <dd><s:property value="escapeExample" escape="false"/></dd>

      <dt>Property with value, with <span class="code">default="I am de fault."</span>:</dt>
      <dd><s:property value="nonNullExample"/></dd>

      <dt>Property with null value, with <span class="code">default="a default value."</span>:</dt>
      <dd><s:property value="nullExample" default="A default value."/></dd>

      <dt>Property with quotes:</dt>
      <dd><s:property value="javascriptExample"/></dd>

      <dt>Property with quotes; used in JavaScript with <span class="code">escapeJavaScript="true"</span>:</dt>
      <dd>
        <ul>
          <script type="text/javascript">
            var jsFromTag1 = '<li><s:property value="javascriptExample" escapeJavaScript="true"/></li>';
            document.writeln(jsFromTag1);

            var jsFromTag2 = '<li><s:property value="javascriptExample" escapeJavaScript="true" escape="false"/></li>';
            document.writeln(jsFromTag2);

            <%--
              This example will blow up if uncommented. The generated JavaScript
              will be invalid because of the single quote inside the action property:
              the browser sees the embedded single quote and assumes we've finished
              defining our JavaScript string and tries to parse the rest of the
              string as JavaScript, which fails spectacularly.
            --%>
            <%--
            var jsFromTag3 = '<li><s:property value="javascriptExample"/></li>';
            document.writeln(jsFromTag3);
            --%>
          </script>
        </ul>
      </dd>
    </dl>

    <s:debug/>
  </body>
</html>
