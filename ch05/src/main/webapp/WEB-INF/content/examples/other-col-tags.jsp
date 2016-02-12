<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Other Collection Tags</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>" />
  </head>

  <body>
    <h1>Other Collection Tags</h1>

    <dl>
      <dt>Append tag (immediate lists)</dt>
      <dd>
        <s:append var="append1">
          <s:param value="{1, 2, 3}" />
          <s:param value="{'a', 'b', 'c'}" />
        </s:append>

        <s:iterator value="append1">
          <s:property />&nbsp;
        </s:iterator>
      </dd>

      <dt>Append tag (one list from generator)</dt>
      <dd>
        <s:generator val="'1, 2, 3, 4'" separator="," var="to4list" />
        <s:append var="append2">
          <s:param value="to4list" />
          <s:param value="{'a', 'b', 'c'}" />
        </s:append>

        <s:iterator value="append2">
          <s:property />&nbsp;
        </s:iterator>
      </dd>

      <dt>Merge tag (immediate lists)</dt>
      <dd>
        <s:merge var="merge1">
          <s:param value="{1, 2, 3}" />
          <s:param value="{'a', 'b', 'c', 'd', 'e', 'f'}" />
        </s:merge>

        <s:iterator value="merge1">
          <s:property />&nbsp;
        </s:iterator>
      </dd>

      <dt>Subset tag, "start" and "count" examples (immediate lists)</dt>
      <dd>
        <s:subset source="{1, 2, 3, 4, 5, 6, 7, 8}" start="3">
          <s:iterator> <s:property /> </s:iterator>
        </s:subset>
        <br />
        <s:subset source="{1, 2, 3, 4, 5, 6, 7, 8}" count="3">
          <s:iterator> <s:property /> </s:iterator>
        </s:subset>
        <br />
        <s:subset source="{1, 2, 3, 4, 5, 6, 7, 8}"
                  start="3" count="3">
          <s:iterator> <s:property /> </s:iterator>
        </s:subset>
        <br />
        <s:generator separator="," val="%{'1, 2, 3, 4, 5, 6, 7, 8'}">
          <s:subset start="3" count="3">
            <s:iterator>
              <s:property />
            </s:iterator>
          </s:subset>
        </s:generator>
        <br />
        (Fine, I'll type it in for you.)
        <br />
        <s:subset source="{1, 2, 3, 4, 5, 6, 7, 8}" start="3" count="3">
          <s:iterator> <s:property /> - <s:property value="class.name" /><br /> </s:iterator>
        </s:subset>
        <s:generator separator="," val="%{'1, 2, 3, 4, 5, 6, 7, 8'}">
          <s:subset start="3" count="3">
            <s:iterator>
              <s:property /> - <s:property value="class.name" /><br />
            </s:iterator>
          </s:subset>
        </s:generator>
        (Oh snap!)
      </dd>

      <dt>Sort tag, using CASE_INSENSITIVE_ORDER</dt>
      <dd>
        <s:generator separator="," val="%{'f, d, C, a, E, B'}">
          <s:sort
              comparator="@java.lang.String@CASE_INSENSITIVE_ORDER">
            <s:iterator>
              <s:property />
            </s:iterator>
          </s:sort>
        </s:generator>
      </dd>
    </dl>
  </body>
</html>
