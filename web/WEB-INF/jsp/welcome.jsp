<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Eugene
  Date: 04.12.2010
  Time: 11:22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Simple jsp page</title></head>
  <body>

  <c:if test="${not empty login}">
      <c:if test="${form.success}">
          You have just logged in!
      </c:if>
      <h1> ${login}! Welcome to Spring MVC website</h1>
      <a href="/logout.html">Logout</a>
  </c:if>
  <c:if test="${empty login}">
      <h1>Welcome to Spring MVC website</h1>

      <form action="/login.html" method="POST">
          Login: <input type="text" name="login"/> <br/>
          Password: <input type="password" name="password"/> <br/>
          <input type="input" name="department.id"/>
          <input type="submit" value="Login"/>
      </form>      
  </c:if>
  </body>
</html>