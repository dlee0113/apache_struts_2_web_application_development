<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Trim Interceptor Test</title>
    <s:head/>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Trim Interceptor Test</h1>

    <h2>See <span class="code">c.p.s.ch08.interceptors.struts-interceptors.xml</span></h2>

    <h2>See <span class="code">c.p.s.ch08.interceptors.XmlTrimAction</span></h2>

    <p>
      Both these fields are BigDecimal action properties. If you're running the
      'trim' action, the interceptor is configured to trim all input parameters:
      entering spaces before and/or after both BigDecimal inputs, which would
      normally break the BigDecimal type conversion, will work for both fields.
    </p>

    <p>
      If you're running the 'trim2' action then the trimming interceptor is configured
      to ignore the 'excluded' parameter: entering spaces before and/or after both
      BigDecimal inputs will return an error for the 'excluded' input.
    </p>

    <p style="padding: 2em; background-color: #ddd; font-style: italic;">
      Note also that on a validation error the 'included' value is re-filled without
      spaces, and that both a type conversion and 'required' error are reported.
    </p>

    <s:form>
      <s:textfield name="includedVal" label="Included Long" />
      <s:textfield name="excludedVal" label="Excluded Long" />
      <s:submit/>
    </s:form>
  </body>
</html>
