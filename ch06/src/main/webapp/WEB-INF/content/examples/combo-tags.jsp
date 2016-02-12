<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
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
    <s:form>
      <tr><th colspan="2"/></tr>
      <s:radio label="Gender" name="gender" list="{'male', 'female', 'other'}"/>
      <tr><th colspan="2"/></tr>
      <s:combobox label="Combo Box" name="combo1" list="{'lorem', 'ipsum', 'dolor', 'sit'}"/>
      <tr><th colspan="2"/></tr>
      <s:updownselect label="Updown Select" key="updown1" list="{'lorem', 'ipsum', 'dolor', 'sit'}" />
      <tr><th colspan="2"/></tr>
      <s:generator var="ots" separator="," val="%{'lorem, ipsum, dolar, sit, all, our, examples, look, like, gold'}"/>
      <s:optiontransferselect label="Transfer" list="#ots"
                      doubleList="{}" doubleName="rightList"
                      size="8" doubleSize="8"/>
      <tr><th colspan="2"/></tr>
      <s:submit/>
    </s:form>
  </body>
</html>