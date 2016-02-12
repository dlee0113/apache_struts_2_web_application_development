<h2>See <span class="code">c.p.s.ch08.interceptors.struts-interceptors.xml</span></h2>

<h2>See <span class="code">c.p.s.ch08.interceptors.CrazyResultNames</span></h2>

<p>
  The <span class="code">CrazyResultNames</span> returns non-standard result
  names. For whatever reason (like we have pre-defined results we want to use
  or something) we want to map the action's result names to our own. Picture
  a case where we can't modify the action and don't want to write a wrapper action.
</p>

<p>
  This action uses the <span class="code">ResultMappingInterceptor</span> to map
  the action's result names to ones of our own choosing: the result names we're
  using in the config file are <strong>NOT</strong> the ones the action returns!
</p>

<p>
  The "notmapped" method's result is <strong>NOT</strong> remapped with the
  interceptor, so the configuration maps the original action's result name
  for that method only.
</p>
