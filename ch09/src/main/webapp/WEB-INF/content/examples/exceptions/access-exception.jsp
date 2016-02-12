<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>User Access Exception</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
  </head>

  <body>
    <h1>User Access Exception</h1>

    <h2>See <span class="code">com.packt.s2wad.ch09.examples.exceptions.UserAccessExample</span></h2>

    <h2>See <span class="code">com.packt.s2wad.ch09.examples.exceptions.UserAccessException</span></h2>

    <div style="background-color: #aa3300; border: 1px solid #660000; color: #ccc; padding: 1em;">
      <span style="font-size: 1.5em; font-weight: bold">User Access Exception</span>
      <ul style="list-style: none;">
        <li><strong>User:</strong> ${exception.user.fname} ${exception.user.lname}</li>
        <li><strong>Reason:</strong> ${exception.reason.message}</li>
      </ul>
    </div>
  </body>
</html>
