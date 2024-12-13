<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
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
    <#list schedules as schedule>
        <li>
            <a href="/checking_war_exploded/scheduleDetail?id=${schedule.id}">${schedule.id}</a>
        </li>
    </#list>
</ul>
</body>
</html>