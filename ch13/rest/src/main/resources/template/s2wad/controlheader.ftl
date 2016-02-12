<#include "/${parameters.templateDir}/${parameters.theme}/controlheader-core.ftl" />
<td
  <#if hasFieldErrors>
    class="hasErrors"<#t/>
  </#if>
  <#if parameters.align?exists>
    align="${parameters.align?html}"<#t/>
  </#if>
><#t/>
