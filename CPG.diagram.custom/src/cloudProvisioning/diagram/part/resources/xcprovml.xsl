<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="utf-8" indent="yes"/>

<xsl:template match="/">
	<environments>				    
	<xsl:for-each select="//environments">
  		<environment>
  			<xsl:attribute name="Name">
  				<xsl:choose>
  				<xsl:when test="@Name!=''">
  					<xsl:value-of select="@Name" />
  				</xsl:when>
  				<xsl:otherwise>env0</xsl:otherwise>
  			</xsl:choose>
  			</xsl:attribute>
    		<instances>    		
    		<xsl:for-each select="instances">
		      <instance 
		        Name="{@Name}">
		        <xsl:attribute name="NumVCPUs">
		        	<xsl:choose>
		        		<xsl:when test="@NumVCPUs!=''">
		        			<xsl:value-of select="@NumVCPUs" />
		        		</xsl:when>
		        		<xsl:otherwise>0</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="CPUSize">
		        	<xsl:choose>
		        		<xsl:when test="@CPUSize!=''">
		        			<xsl:value-of select="@CPUSize" />
		        		</xsl:when>
		        		<xsl:otherwise>Small</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="NetworkPerformance">
		        	<xsl:choose>
		        		<xsl:when test="@NetworkPerformance!=''">
		        			<xsl:value-of select="@NetworkPerformance" />
		        		</xsl:when>
		        		<xsl:otherwise>VeryLow</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="Memory">
		        	<xsl:choose>
		        		<xsl:when test="@Memory!=''">
		        			<xsl:value-of select="@Memory" />
		        		</xsl:when>
		        		<xsl:otherwise>0.0</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="Storage">
		        	<xsl:choose>
		        		<xsl:when test="@Storage!=''">
		        			<xsl:value-of select="@Storage" />
		        		</xsl:when>
		        		<xsl:otherwise>0.0</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="OperatingSystem">
		        	<xsl:choose>
		        		<xsl:when test="@OperatingSystem!=''">
		        			<xsl:value-of select="@OperatingSystem" />
		        		</xsl:when>
		        		<xsl:otherwise>WindowsServer2008</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
		        <xsl:attribute name="Architecture">
		        	<xsl:choose>
		        		<xsl:when test="@Architecture!=''">
		        			<xsl:value-of select="@Architecture" />		        			
	        			</xsl:when>
	        			<xsl:otherwise>x86</xsl:otherwise>
		        	</xsl:choose>
		        </xsl:attribute>
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