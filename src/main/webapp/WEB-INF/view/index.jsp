<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accidents</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container pt-3">
    <div>
        Login as : ${user.username}
    </div>
    <a href="<c:url value='/create'/>">Добавить инцидент</a>
    <table class="table" id='table'>
        <thead>
        <tr>
            <th scope="col">Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${accidents}" var="item">
        <tr>
            <td>${item.name}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>