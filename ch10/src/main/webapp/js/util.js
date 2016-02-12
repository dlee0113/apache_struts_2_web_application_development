function w(s)   { document.write(s); }
function wln(s) { w(s); w("<br/>");  }

function code(s) {
    return "<span class='code'>" + s + "</span>";
}

function printAndEval(s) {
    w(code(s) + ": " + eval(s));
}

function t() {
    w("<table>");
    for (var i = 0; i < arguments.length; i++) {
        w(arguments[i]);
    }
    w("</table>");
}

function tr() {
    var s = "<tr>";
    for (var i = 0; i < arguments.length; i++) {
        s += arguments[i];
    }
    return s + "</tr>";
}

function tc(which, args) {
    var s = "<" + which + ">";
    for (var i = 0; i < args.length; i++) {
        s += args[i];
    }
    return s + "</" + which.split(" ")[0] + ">";
}

function td() {
    return tc("td", arguments);
}

function th() {
    return tc("th align='left'", arguments);
}
