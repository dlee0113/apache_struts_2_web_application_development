<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Scoped Attributes Examples</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  </head>

  <body>
    <h1>Scoped Attributes Examples</h1>
    <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.ScopedAttrsAction</span></h2>

    <dl>
      <dt>Accessing directly from specific scope:</dt>
      <dd>
        <table>
          <tr>
            <td>App</td>
            <td><s:property value="#application.anAppAttribute"/></td>
          </tr>

          <tr>
            <td>Session</td>
            <td><s:property value="#session.aSessionAttribute"/></td>
          </tr>

          <tr>
            <td>Request (attribute)</td>
            <td><s:property value="#request.aRequestAttribute"/></td>
          </tr>

          <tr>
            <td>Request (parameter)</td>
            <td><s:property value="#parameters.aRequestParameter"/></td>
          </tr>
        </table>
      </dd>

      <dt>Accessing via #attr:</dt>
      <dd>
        <li><s:property value="#attr.anAppAttribute"/></li>
        <li><s:property value="#attr.aSessionAttribute"/></li>
        <li><s:property value="#attr.aRequestAttribute"/></li>
        <li><s:property value="#attr.aPageAttribute"/></li>
      </dd>
    </dl>
  </body>
</html>
