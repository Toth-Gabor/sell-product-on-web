<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Main</title>
    </head>
    <body>
        <div class="data">
            <h1>Thank you for visiting</h1>

            <c:forEach var="u" items="${users}">
                <h1><c:out value="${u.getEmail()}"></c:out></h1>
            </c:forEach>
            <a href="index.jsp">Click here to return index</a>
        </div>

        <img class="image" src="thank-you.jpg" alt="Something went wrong!" align="left" >
    </body>
</html>
