<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Работники компании</title>
</head>
<body>
    <h2>Работники компании</h2>
    <c:forEach items="${employees}" var="employee">
    <h3>Работник:</h3>
        <p>Имя: ${employee.fullName}</p>
        <p>Должность: ${employee.post}</p>
        <p>ЗП: ${employee.salary}</p>
    </c:forEach>
</body>
</html>