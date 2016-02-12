<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Sanity check JSP page</title>
    <s:head/>
    <style type="text/css">
      th {
        padding-bottom: 2em;
      }
      td {
        padding-bottom: 1em;
      }
      #combo_tags_rightList {
        width: 10em;
      }
    </style>
  </head>
  
  <body>
    <h1>Sanity check JSP page</h1>

    <p>
      If this page was reached via the <b>sanity.action</b> and
      the project is configured correctly we should see a string
      between these brackets: [<s:property value="sanityCheck" />].
      If the page was reached by directly addressing <b>sanity.jsp</b>
      then nothing will appear.
    </p>

    <s:form>
      <s:textfield name="foo" value="hello"/>
      <s:textfield key="foo2"/>

      <s:select name="ERA1" id="ERA1" value="%{'S&P'}" list="{'Select', 'S&P', 'Moodys', 'Fitch', 'Others'}"/>

      <s:submit/>
    </s:form>
    <hr/>
    <s:property value="[0]"/>
    <hr/>
    <s:property value="[1]"/>
    <hr/>
    <s:property value="[2]"/>
  </body>
</html>
