<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accident</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container pt-3">
    <a href="<c:url value='/create'/>">Добавить инцидент</a>
    <table class="table" id='table'>
        <thead>
        <tr>
            <th scope="col">Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="item">
        <tr>
            <td>${item}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    Accidents
    <c:forEach items="${accidents}" var="accident">
        <div>
        <span>
            <c:out value="${accident.name}"/>
        </span>
            <span>
             <a href="<c:url value='/update?id=${accident.id}'/>">Добавить инцидент</a>
        </span>
        </div>
    </c:forEach>
</div>
</body>
</html>