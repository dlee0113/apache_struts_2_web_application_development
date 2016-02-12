<#assign hasFieldErrors = parameters.name?? && fieldErrors?? && fieldErrors[parameters.name]??/>
<#assign trClass="trInput"/>
<#assign tdClass="tdLabel"/>
<#assign labelClass="label"/>
<#if hasFieldErrors>
  <#assign labelClass>errorLabel</#assign>
  <#assign trClass>${trClass} hasErrors</#assign>
  <#assign tdClass>${tdClass} hasErrors</#assign>
</#if>
<tr id='tr${parameters.id?html}' class='${trClass}'>
  <td class='${tdClass}'>
    <#if parameters.label?exists>
    <label <#t/>
      <#if parameters.id?exists>
        for="${parameters.id?html}" <#t/>
      </#if>
      class='${labelClass}'
    ><#t/>
      ${parameters.label?html}<#t/>
      <#if parameters.required?default(false)>
        <span class="required">*</span><#t/>
      </#if>
      :<#t/>
      <#include "/${parameters.templateDir}/${parameters.theme}/tooltip.ftl" />
    </label><#t/>
    </#if>
  </td><#lt/>
