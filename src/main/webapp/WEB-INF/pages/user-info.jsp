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
    <br><br>
    Name<form:input path="name"/>
    <br><br>

    Age<form:input path="age"/>
    <br><br>
    Email<form:input path="email"/>

    <br><br>
    <input type="submit" value="OK">

</form:form>


</html>


