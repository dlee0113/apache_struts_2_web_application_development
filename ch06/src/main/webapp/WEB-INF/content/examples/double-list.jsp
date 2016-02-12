<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <s:head/>
  </head>

  <body>
    <s:form>
      <s:doubleselect
          name="dsel"
          doubleName="dsel2"
          list="{'one', 'two', 'three'}"
          doubleList="top == 'one' ? {'1a', '1b'}
                                   : top == 'two' ? {'2a', '2b'}
                                                  : {'3a', '3b'}"/>
    </s:form>
  </body>
</html>
