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

    <h2>See <span class="code">c.p.s.ch08.actions.examples.AnnotationTrimAction</span></h2>

    <p>
      Both these fields are BigDecimal action properties. The
      <span class="code">AnnotationTrimAction</span> class is configured to use the interceptor
      stack defined in the <span class="code">interceptor-examples</span> package, and configures
      the 'trim' interceptor to exclude the 'excluded' parameter from trimming: entering spaces
      before and/or after both BigDecimal inputs will return an error for the 'excluded' input.
    </p>

    <s:form action="trim-process">
      <s:textfield name="includedVal" label="Included Long" />
      <s:textfield name="excludedVal" label="Excluded Long" />
      <s:submit/>
    </s:form>
  </body>
</html>
