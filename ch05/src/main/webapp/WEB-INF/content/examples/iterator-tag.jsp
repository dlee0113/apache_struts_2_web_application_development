<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Iterator Tag Examples</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  </head>

  <body>
    <h1>Iterator Tag Examples</h1>
    <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.IteratorTagAction</span></h2>

    <dl>
      <dt>Iterate over list with &lt;s:property/></dt>
      <dd>
        <ul>
          <s:iterator value="listOfStrings">
            <li><s:property/></li>
          </s:iterator>
        </ul>
      </dd>

      <dt>Iterate over list through stack context value set with "var" attribute:</dt>
      <dd>
        <ul>
          <s:iterator value="listOfStrings" var="foo">
            <li><s:property value="foo"/></li>
          </s:iterator>
        </ul>
      </dd>

      <dt>Iterate over map without stack context value:</dt>
      <dd>
        <ul>
          <s:iterator value="mapStringString">
            <li>
              <s:property value="key"/> : <s:property value="value"/>
            </li>
          </s:iterator>
        </ul>
      </dd>

      <dt>Iterate over map with stack context value:</dt>
      <dd>
        <ul>
          <s:iterator value="mapStringString" var="sse">
            <li>
              <s:property value="#sse.key"/> : <s:property value="#sse.value"/>
            </li>
          </s:iterator>
        </ul>
      </dd>

      <dt>Iterate over list with simple object:</dt>
      <dd>
        <ul>
          <s:iterator value="simpleList" var="sl">
            <li><s:property value="#sl.s"/></li>
          </s:iterator>
        </ul>
      </dd>

      <dt>Track iteration status:</dt>
      <dd>
        <table>
          <tr>
            <th>List value</th>
            <th>Index</th>
            <th>Count</th>
            <th>Even?</th>
            <th>Odd?</th>
            <th>First?</th>
            <th>Last?</th>
            <th>modulus(2)</th>
            <th>modulus(4)</th>
            <th>count % 4</th>
          </tr>

          <s:iterator value="list1" status="stat">
            <tr>
              <td><s:property /></td>
              <td><s:property value="#stat.index"/></td>
              <td><s:property value="#stat.count"/></td>
              <td><s:property value="#stat.even"/></td>
              <td><s:property value="#stat.odd"/></td>
              <td><s:property value="#stat.first"/></td>
              <td><s:property value="#stat.last"/></td>
              <td><s:property value="#stat.modulus(2)"/></td>
              <td><s:property value="#stat.modulus(4)"/></td>
              <td><s:property value="#stat.count % 4"/></td>
            </tr>
          </s:iterator>
        </table>
      </dd>
    </dl>
  </body>
</html>
