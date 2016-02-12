<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Test Classification Validator</title>
    <s:head />
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>Test Classification Validator</h1>

    <h2>See <span class="code">c.p.s.ch07.actions.examples.TestClassificationAction</span></h2>

    <h2>See <span class="code">c.p.s.ch07.examples.ClassificationService</span></h2>

    <h2>See <span class="code">c.p.s.ch07.examples.ClassificationValidator</span></h2>

    <p>As described in the book, valid classifications follow two rules:</p>
    <ul>
      <li>Classifications are 3- or 4-digit numbers</li>
      <li>4-digit classifications must begin with a 1 or 2</li>
    </ul>

    <s:form action="test-classification-process">
      <s:textfield key="classification" />
      <s:submit />
    </s:form>
  </body>
</html>
