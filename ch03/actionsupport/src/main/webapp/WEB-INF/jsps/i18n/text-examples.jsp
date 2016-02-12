<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <style type="text/css">
      dt {
        font-weight: bold;
      }
    </style>
  </head>
  <body>
    <h1>I18N Examples</h1>
    <dl>
      <dt>From TextExamplesAction.properties via property tag,
          using getText(...):</dt>
      <dd>
        <s:property value="getText('from.class.props')"/>
      </dd>

      <dt>From TextExamplesAction.properties via property tag,
          using an action property through getter:</dt>

      <dd><s:property value="text1"/></dd>

      <dt>Same, but using JSP EL \${text1}:</dt>
      <dd>${text1}</dd>

      <dt>Same, but using s:text tag:</dt>
      <dd><s:text name="from.class.props"/></dd>

      <dt>Demonstrates default text when missing message resource:</dt>
      <dd><s:text name="unlikely.message.name">Message not found!</s:text></dd>

      <dt>Demonstrates sub-class override of message (key=overridden.msg):</dt>
      <dd><s:text name="overridden.msg"/></dd>

      <dt>From superclass's properties:</dt>
      <dd><s:text name="superclass.msg"/></dd>

      <dt>From defined root-level global messages:</dt>
      <dd><s:text name="from.root.global"/></dd>

      <dt>From defined global messages down in hierarchy:</dt>
      <dd><s:text name="from.misc"/></dd>

      <dt>Parameterized message from Java:</dt>
      <dd>${params1}</dd>
      
      <dt>Parameterized via s:text tag:</dt>
      <dd>
        <s:text name="params.msg1">
          <s:param>Foo (tag)</s:param>
          <s:param>Bar (tag)</s:param>
        </s:text>
      </dd>

      <dt>Parameterized via s:text tag, value attr:</dt>
      <dd>
        <s:text name="params.msg1">
          <s:param value="'Foo (tag, attr)'"/>
          <s:param value="'Bar (tag, attr)'"/>
        </s:text>
      </dd>

      <dt>Parameterized with action properties:</dt>
      <dd>
        <s:text name="params.msg1">
          <s:param value="foo"/>
          <s:param value="bar"/>
        </s:text>
      </dd>

      <dt>Message includes action properties directly:</dt>
      <dd><s:text name="params.from.action"/></dd>
    </dl>
  </body>
</html>
