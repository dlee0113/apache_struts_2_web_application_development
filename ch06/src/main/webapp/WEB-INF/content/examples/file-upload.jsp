<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>File Upload</title>
    <s:head/>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css"/>
  </head>

  <body>
    <h1>File Upload</h1>
    <h2>See <span class="code">c.p.s.ch06.actions.examples.FileUploadAction</span></h2>

    <s:form action="file-upload-process" method="post" enctype="multipart/form-data">
      <s:file key="file1"/>
      <s:submit/>
    </s:form>
  </body>
</html>
