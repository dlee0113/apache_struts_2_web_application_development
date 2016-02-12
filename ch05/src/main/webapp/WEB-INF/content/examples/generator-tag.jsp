<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Generator tag</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>" />
  </head>

  <body>
    <h1>Generator tag</h1>

    <dl>
      <dt>Generator with immediate string-split list:</dt>
      <dd>
        <s:generator val="'1, 2, 3, 4'" separator=",">
          <ul>
            <s:iterator>
              <li><s:property /></li>
            </s:iterator>
          </ul>
        </s:generator>
      </dd>

      <dt>Generator with immediate string-split list, given a var:</dt>
      <dd>
        <s:generator val="'1, 2, 3, 4'" separator="," var="to4list" />
        <ul>
          <s:iterator value="to4list">
            <li><s:property /></li>
          </s:iterator>
        </ul>

        <%--
          This iterator produces no output: to4list has already been
          iterated over and has nothing left to give.
        --%>
        <p>
          Note that after a generated list is iterated over, it's done:
          <br />
          Nothing here&mdash;to4list is spent! [&nbsp;<s:iterator value="to4list"><s:property /></s:iterator>&nbsp;]
        </p>
      </dd>

      <dt>Silent OGNL Death</dt>
      <dd>
        <p>Messing up your OGNL can produce... silence. Check out the JSP source. There is, however, a warning in the
          log.</p>
        <s:generator separator="," val="'1, 2, 3, 4">
          <ul>
            <s:iterator>
              <li><s:property /></li>
            </s:iterator>
          </ul>
        </s:generator>
        <p>(If the OGNL hadn't been broken there'd be stuff inbetween these paragraphs!)</p>
      </dd>
    </dl>
  </body>
</html>
