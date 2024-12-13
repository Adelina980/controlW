<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Детали расписания</title>
</head>
<body>
<h1>Детали расписания ${schedule.name}</h1>

<p><b>ID:</b> ${schedule.id}</p>
<p><b>Описание:</b> ${schedule.description}</p>
<!-- Добавьте другие поля, которые нужно отобразить -->
<p><b>Дата:</b> ${schedule.date}</p>
<p><b>Предмет:</b> ${schedule.subject}</p>
<p><b>Группа:</b> ${schedule.group}</p>

<a href="index.jsp">Назад к списку</a>

</body>
</html>

