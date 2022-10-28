<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>


<html>
<body>

<h2>User Info</h2>
<br>
</body>

<form:form action="saveUser" modelAttribute="user1">

    <form:hidden path="id"/>


    <label for="name">name</label>
    <input type="text" name="name" id="name">
    <br><br>
    <label for="age">age</label>
    <input type="text" name="age" id="age">
    <br><br>
    <label for="email">email</label>
    <input type="text" name="email" id="email">
    <br><br>
    <input type="submit" value="OK">
</form:form>
</html>


