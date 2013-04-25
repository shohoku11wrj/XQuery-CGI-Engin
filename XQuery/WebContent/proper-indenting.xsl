<!-- <?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		TODO: Auto-generated template
	</xsl:template>
</xsl:stylesheet> -->
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt">
<xsl:output method="xml" encoding="utf-8" indent="yes" xalan:indent-amount="4" />
<xsl:strip-space elements="*"/>
<xsl:template match="@*|node()|comment()|processing-instruction()">
    <xsl:copy>
        <xsl:apply-templates select="@*|node()|comment()|processing-instruction()"/>
    </xsl:copy>
</xsl:template>
<xsl:template match="text()">
    <xsl:value-of select="normalize-space()" />
</xsl:template>
</xsl:stylesheet>