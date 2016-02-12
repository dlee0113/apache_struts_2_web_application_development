<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Combo Form Tags</title>
    <s:head/>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
    <style type="text/css">
      select {
        width: 10em;
      }
      th {
        background-color: #ccc;
      }
    </style>
  </head>

  <body>
    <h1>Combo Form Tags</h1>

    <s:form action="foo" name="foo">
      <tr><th colspan="2">s:combobox</th></tr>
      <s:combobox name="hellos" list="{'Hello', 'Howdy', 'Sup', 'Yo'}"/>
      <tr><th colspan="2">s:updownselect</th></tr>
      <s:updownselect name="goodbyes" list="{'Goodbye', 'Later', 'Outta here'}"/>
      <tr><th colspan="2">s:optiontransferselect</th></tr>
      <s:optiontransferselect doubleList="{}" doubleName="rightList" list="{'lorem', 'ipsum', 'dolar', 'sit', 'all', 'our', 'samples', 'look', 'like', '... gold!'}"/>
      <tr><th colspan="2">s:doubleselect</th></tr>
      <s:doubleselect doubleName="dsel2"
                      list="{'one', 'two', 'three'}"
                      doubleList="top=='one' ? {'1a', '1b'} : top=='two' ? {'2a', '2b'} : {'3a', '3b'}"
          />
      <s:submit/>
    </s:form>
  </body>
</html>
