<xsl:template match="result" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <html>
    <head>
      <title>
        <xsl:value-of select="title"/>
      </title>
    </head>
    <body>
      <h1>
        <xsl:value-of select="title"/>
      </h1>
      <table>
        <tr>
          <th>Quantity</th>
          <th>Item</th>
        </tr>
        <xsl:for-each select="items/*">
          <tr>
            <td>
              <xsl:value-of select="quantity"/>
            </td>
            <td>
              <xsl:value-of select="name"/>
            </td>
          </tr>
        </xsl:for-each>
      </table>
    </body>
  </html>
</xsl:template>
