<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
  <head>
    <title>Dojo Anchor Tag Examples</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
    <s:head />
    <sx:head debug="true" />
  </head>

  <body>
    <h1>Dojo Anchor Tag Examples</h1>

    <s:url action="simple1" var="simple1" />
    <s:url action="simple2" var="simple2" />
    <s:url action="slow" var="slow" />

    <ul>
      <li><sx:a href="%{simple1}" targets="results">Simple #1</sx:a></li>
      <li><sx:a href="%{simple2}" targets="results">Simple #2</sx:a></li>
      <li><sx:a href="%{simple2}" targets="results" highlightColor="#c99"
                highlightDuration="1000">Simple #2, with Web 2.0 bona fides</sx:a></li>
      <li><sx:a href="%{slow}" targets="results" indicator="lookHere">Long-running action with indicator DIV</sx:a></li>
      <li><sx:a href="%{slow}" targets="results"
                showLoadingText="true">Long-running action with loading text</sx:a></li>
    </ul>

    <p><em>NOTE:</em> The long-running actions <span class="code">Thread.sleep(4000)</span>, so just hang out and enjoy
      the Web 2.0 show!</p>

    <h2>Results go in the following div</h2>

    <div id="results_container" style="border: 1px solid darkblue; padding: 1em;">
      <div id="lookHere" style="display: none;"><img src="<s:url value="/img/ajax-loader.gif"/>" /></div>
      <div id="results"></div>
    </div>
  </body>
</html>
