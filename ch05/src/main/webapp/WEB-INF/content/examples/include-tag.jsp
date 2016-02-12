<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Including Actions</title>
    <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>" />
  </head>

  <body>
    <h1>Including Actions</h1>

    <div>
      <p>Nothing else will show up here even though I'm using the action tag: I didn't <span
          class="code">executeResult</span>.</p>

      <div style="background-color: #ccc;">
        <s:action name="included" namespace="/examples" />
      </div>
      <p>(See? Nothing.)</p>
    </div>

    <hr />

    <div>
      <p>Here, though, we'll see <span class="code">IncludedAction</span>'s JSP:</p>

      <div style="background-color: #ccc;">
        <s:action name="included" namespace="/examples" executeResult="true" />
      </div>
      <p>Sweet!</p>
    </div>

    <hr />

    <div>
      <p>Now we <em>won't</em> execute the result, but we <em>will</em> put the action
        into a variable, and use that variable to access one of the action's properties.
        Madness, I tell you. Madness.</p>
      <s:action name="included" namespace="/examples" var="daAction" />
      <p>Here's something from daAction: ${daAction.propertyOfAction}</p>

      <p>Re-sweet.</p>
    </div>

    <hr />

    <div>
      <p>Now we'll pass in a string and a real-live Java list to an action. That's actually
        kinda cool, although it's unlikely to get you a date.</p>
      <s:action name="included-with-params" namespace="/examples" executeResult="true">
        <s:param name="foo">I'm a simple string.</s:param>
        <s:param name="list1" value="{'11', '22', '33', '44'}" />
      </s:action>
    </div>
  </body>
</html>
