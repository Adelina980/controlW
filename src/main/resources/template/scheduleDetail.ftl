<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Детали расписания</title>
</head>
<body>
<h1>Детали расписания ${schedule.id}</h1>

<p>ID: ${schedule.id}</p>
<p>Номер аудитории: ${schedule.nclassroom}</p>
<p>Время: ${schedule.starttime} - ${schedule.endtime}</p>
<p>День недели: ${schedule.dayofweek}</p>
<p>Преподаватель: ${schedule.teacher}</p>
<p>Группа: ${schedule.ngroup}</p>


<a href="/checking_war_exploded/index">Назад к списку</a>

</body>
</html>