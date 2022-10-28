<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Users</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Email</th>
        <th>Operations</th>

    </tr>

    <c:forEach var="us" items="${allUs}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="usId" value="${us.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteUser">
            <c:param name="usId" value="${us.id}"/>
        </c:url>

        <tr>
            <td>${us.name}</td>
            <td>${us.age}</td>
            <td>${us.email}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href= '${updateButton}'"/>


                <input type="button" value="Delete"
                       onclick="window.location.href= '${deleteButton}'"/>
            </td>


        </tr>

    </c:forEach>

</table>
<br>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewUser'"/>

</body>


</html>