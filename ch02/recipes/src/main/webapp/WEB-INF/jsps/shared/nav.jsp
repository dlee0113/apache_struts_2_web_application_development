<%@ taglib prefix="s" uri="/struts-tags" %>

<ul>
  <li>
    <a href="<s:url namespace="/" action="home"/>">
      Home
    </a>
  </li>

  <li>
    <a href="<s:url namespace="/recipe" action="list"/>">
      List Recipes
    </a>
  </li>

  <li>
    <a href="<s:url namespace="/recipe" action="search"/>">
      Search Recipes
    </a>
  </li>

  <li>
    <a href="<s:url namespace="/recipe" action="new"/>">
      Create Recipe
    </a>
  </li>

  <li>
    <a href="<s:url namespace="/shopping" action="list"/>">
      Shopping List
    </a>
  </li>
</ul>
