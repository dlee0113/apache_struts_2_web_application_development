<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" version="4.0" encoding="iso-8859-1" indent="yes"/>
  <xsl:template match="result">
    <html>
      <head>
        <title>
          <xsl:value-of select="headerText"/>
        </title>
      </head>
      <body>
        <h1><xsl:value-of select="headerText"/></h1>
        <table>
          <tr><th>String from list</th></tr>

          <xsl:for-each select="listProperty/*">
            <tr>
              <td><xsl:value-of select="."/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
