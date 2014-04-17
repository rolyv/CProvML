<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="utf-8" indent="yes"/>

<xsl:template match="/">
	<environments>				    
	<xsl:for-each select="//environments">
  		<environment Name="{@Name}">
    		<instances>
    		<xsl:for-each select="instances">
		      <instance 
		        Name="{@Name}" 
		        NumVCPUs="{@NumVCPUs}"
		        CPUSize="{@CPUSize}" 
		        NetworkPerformance="{@NetworkPerformance}"
		        Memory="{@Memory}"
		        Storage="{@Storage}"
		        OperatingSystem="{@OperatingSystem}"
		        Architecture="{@Architecture}">
	        	<applications>
		        <xsl:for-each select="Applications">
		          <application><xsl:value-of select="."/></application>
		        </xsl:for-each>
		        </applications>
		      </instance>
		    </xsl:for-each>
    		</instances>
		</environment>
	</xsl:for-each>
</environments>					 
</xsl:template>
</xsl:stylesheet>						