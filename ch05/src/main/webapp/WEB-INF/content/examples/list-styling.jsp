<%@ taglib prefix="s" uri="/struts-tags" %>

<head>
  <title>List Styling CSS Detour</title>
  <link type="text/css" rel="stylesheet" href="<s:url value='/css/main.css'/>"/>
  <style>
    .firsttrue {
      border-top: 2px solid black;
    }

    .lasttrue {
      border-bottom: 2px solid black;
    }

    .firstfalse {
    }

    .lastfalse {
    }

    .row0 {
      background: #fff;
    }

    .row1 {
      background: #aaa;
    }

    .row2 {
      background: #555;
      color: white;
    }

    .row3 {
      background: #000;
      color: white;
    }
  </style>
</head>

<body>
  <h1>List Styling CSS Detour</h1>
  <h2>See <span class="code">com.packt.s2wad.ch05.actions.examples.ListStylingAction</span></h2>

  <table>
    <tr><th colspan="3">List from action</th></tr>
    <s:iterator value="list1" status="stat">
      <tr class="row${stat.count % 2} first${stat.first} last${stat.last}">
        <td>${stat.count}</td>
        <td><s:property/></td>
        <td class="row${stat.count % 4}">${stat.count % 4}</td>
      </tr>
    </s:iterator>
  </table>

  <br/>

  <table>
    <tr><th colspan="3">Immediate list</th></tr>
    <s:generator separator="," val="'lorem, ipsum, dolor, sit'">
      <s:iterator status="stat">
        <tr class="row${stat.count % 2} first${stat.first} last${stat.last}">
          <td>${stat.count}</td>
          <td><s:property/></td>
          <td class="row${stat.count % 4}">${stat.count % 4}</td>
        </tr>
      </s:iterator>
    </s:generator>
  </table>

  <br/>

  <table>
    <tr><th colspan="5">"Maintainable" Tag-based Version</th></tr>
    <s:generator separator="," val="'lorem, ipsum, dolor, sit'">
      <s:iterator status="stat">
        <%-- Is a double ternary "maintainable"? Consider the alternative, shown below... --%>
        <s:set var="trFl" value="%{#stat.first ? 'firsttrue' : #stat.last ? 'lasttrue' : ''}"/>

        <%-- Using tags is "maintainable", but wildly verbose. This functionality could --%>
        <%-- almost live in a utility method, or in a custom tag. But there are easy    --%>
        <%-- options--if you're brave and accept the nature of the beast.               --%>
        <s:if test="#stat.first">
          <s:set var="trFl2" value="'firsttrue'"/>
        </s:if>
        <s:elseif test="#stat.last">
          <s:set var="trFl2" value="'lasttrue'"/>
        </s:elseif>
        <s:else>
          <s:set var="trFl2" value="''"/>
        </s:else>

        <tr class="row${stat.count % 2} ${trFl} ${trFl2}">
          <td>trFl=${trFl}</td>
          <td>trFl2=${trFl2}</td>
          <td>${stat.count}</td>
          <td><s:property/></td>
          <td class="row${stat.count % 4}">${stat.count % 4}</td>
        </tr>
      </s:iterator>
    </s:generator>
  </table>
</body>
