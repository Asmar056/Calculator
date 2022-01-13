<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2/24/20
  Time: 7:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
    <h1>Enter numbers</h1>
    <form action="calc" method="get">
      First number: <input type="text" name="first"/> <br>
      Second number:<input type="text" name="second"> <br>

      <input type="radio" name="operation" value="plus"> + <br>
      <input type="radio" name="operation" value="minus"> - <br>
      <input type="radio" name="operation" value="mult"> * <br>
      <input type="radio" name="operation" value="divide"> / <br>
      <input type="radio" name="operation" value="percent"> % <br>

      <input type="submit" value="Calculate">
      <input type="reset" value="Reset">
    </form>
  </body>
</html>
