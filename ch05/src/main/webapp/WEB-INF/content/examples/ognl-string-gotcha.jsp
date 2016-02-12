<%@ taglib prefix="s" uri="/struts-tags" %>

<head>
  <title>OGNL String Gotcha</title>
  <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
</head>

<body>
  <h1>OGNL String Gotcha</h1>
  <h2>See <span class="code">com.packt.s2wad.actions.examples.OgnlStringGotchaAction</span></h2>

  <dl>
    <dt>Test against single-quoted 'A' fails:</dt>
    <dd>
      <s:if test="testMe == 'A'">
        We want this to print, but it won't.
      </s:if>
      <s:else>
        This prints because we're testing against a character, not a string.
      </s:else>
    </dd>

    <dt>Test against double-quoted "A" succeeds:</dt>
    <dd>
      <s:if test='testMe == "A"'>
        We want this to print, and it does.
      </s:if>
      <s:else>
        I know less about OGNL than I thought.
      </s:else>
    </dd>

    <dt>Test using .equals() against single-quoted 'A' also fails:</dt>
    <dd>
      <s:if test="testMe.equals('A')">
        We want this to print, but it won't.
      </s:if>
      <s:else>
        This prints because we're testing against a character, not a string.
      </s:else>
    </dd>
  </dl>
</body>
