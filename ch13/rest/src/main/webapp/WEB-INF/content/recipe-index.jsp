<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <link rel="stylesheet" type="text/css" href="<s:url value='/ext-2.2/resources/css/ext-all.css' />"/>
    <script type="text/javascript" src="<s:url value='/ext-2.2/adapter/ext/ext-base.js'/>"></script>
    <script type="text/javascript" src="<s:url value='/ext-2.2/ext-all-debug.js'/>"></script>
  </head>

  <body>
    <div id="example-grid"></div>
  </body>

  <script type="text/javascript">
    Ext.onReady(function() {
        var store = new Ext.data.Store({
            url: '<s:url value="/recipe"/>',
            reader: new Ext.data.XmlReader({
                          record: "com.packt.s2wad.ch13.models.Recipe",
                          id: 'id'
                      }, [ 'name', 'description' ])
        });

        var grid = new Ext.grid.GridPanel({
            store: store,
            columns: [
                { header: "Name", width: 110, dataIndex: 'name', sortable: true },
                { header: "Description", width: 410, dataIndex: 'description', sortable: true }
            ],
            renderTo: 'example-grid',
            width: 540,
            height: 200,
            frame:true,
            title:'Recipe List'
        });

        store.load();
    });
  </script>
</html>
