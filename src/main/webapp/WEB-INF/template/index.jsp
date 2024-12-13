<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Список расписаний</title>
    <style>
        body {
            font-family: sans-serif;
        }
        .schedule-list {
            list-style: none;
            padding: 0;
        }
        .schedule-list li {
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h1>Список расписаний</h1>

<ul class="schedule-list">
    <c:forEach var="schedule" items="${schedules}">
        <li>
            <a href="scheduleDetail/${schedule.id}">${schedule.name}</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>

