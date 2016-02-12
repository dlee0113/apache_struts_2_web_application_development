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
      This example contains the same functionality as the first example, but uses
      a function and immediate execution to build the module, providing a bit more
      encapsulation.
    </p>

    <p>
      Plus it's just cool.
    </p>

    <ul>
      <s:iterator value="{'Link 1', 'Link 2', 'Link 3'}" var="linkText" status="stat">
        <li>
          <a href="#" class="notify">${linkText}</a>
        </li>
      </s:iterator>

      <li><a href="#">We don't care about this link</a></li>
    </ul>

    <h2>The Code</h2>
    
    <pre class="code">
      var MOD = function () {
        var title = "Module MOD";

        return {

          buildLinkClickHandler: function (i) {
            return function () {
              alert("You clicked link #" + (i + 1) + " from " + title);
            };
          }
        };
      }();
    </pre>

    <p>
      See that last line with the <span class="code">()</span> (the parentheses)? That means
      that function will be executed. It returns an anonymous object with a single value,
      <span class="code">buildLinkClickHandler</span>, which is itself a function.
    </p>

    <p>
      This means we can execute <span class="code">MOD.buildLinkClickHandler()</span>, and amaze our friends.
    </p>

    <p>The ones we have left.</p>

    <script type="text/javascript">
      /**
       * The JavaScript "module" for this page.
       */
      var MOD = function () {
        var title = "Module MOD";

        return {

          buildLinkClickHandler: function (i) {
            return function () {
              alert("You clicked link #" + (i + 1) + " from " + title);
            };
          }
        };
      }();

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
