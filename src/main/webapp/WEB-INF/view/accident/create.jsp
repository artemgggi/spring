<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Accident</title>
</head>
<body>
<div class="container pt-3">
    <form  action="<c:url value='/save'/>" method='POST'>
        <table>
            <tr>
                <td>Название:</td>
                <td><input type='text' name='name'></td>
            </tr>
            <tr>
                <td>Тип:</td>
                <td>
                    <select name="type.id">
                        <c:forEach var="type" items="${types}" >
                            <option value="${type.id}">${type.name}</option>
                        </c:forEach>
                    </select>
            </tr>
            <tr>
                <td>Статьи:</td>
                <td>
                    <select name="rIds" multiple>
                        <c:forEach var="rule" items="${rules}" >
                            <option value="${rule.id}">${rule.name}</option>
                        </c:forEach>
                    </select>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit" value="Сохранить" /></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>