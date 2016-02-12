<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>Using jQuery to Add onclick Handlers</title>
    <link rel="stylesheet" href="<s:url value='/css/main.css'/>" type="text/css" />
    <script type="text/javascript" src="<s:url value="/jquery/jquery-1.2.6.js"/>"></script>
  </head>

  <body>
    <h1>Using jQuery to Add onclick Handlers</h1>

    <p>
      We'll use jQuery to add functionality to links that have the "notify" class; the
      first three links. The onclick functionality is handled <em>after</em> the page
      is loaded: the link's HTML markup contains <em>no</em> funtionality!
    </p>

    <p>
      Clicking on the first three links will bring up alert boxes. Clicking the last link,
      which does not have the "notify" class, won't. CSS classes can be used to indicate
      functionality as well as appearance.
    </p>

    <ul>
      <s:iterator value="{'Link 1', 'Link 2', 'Link 3'}" var="linkText" status="stat">
        <li>
          <a href="#" class="notify">${linkText}</a>
        </li>
      </s:iterator>

      <li><a href="#">We don't care about this link</a></li>
    </ul>

    <script type="text/javascript">
      /**
       * The JavaScript "module" for this page.
       */
      var MOD = {
        title: "Module MOD",

        buildLinkClickHandler: function (i) {
          var that = this;
          return function () {
            alert("You clicked link #" + (i+1) + " from " + that.title);
          };
        }
      }

      /**
       * Passing a function to jQuery's $() method will
       * run that function when the page's DOM is loaded.
       */
      $(function () {
        $("a.notify").each(function (i, el) {
          el.onclick = MOD.buildLinkClickHandler(i);
        })
      });
    </script>
  </body>
</html>
