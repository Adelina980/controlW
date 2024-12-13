<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ошибка</title>
</head>
<body>
<h1>Ошибка</h1>
<#if errorMessage??>
    <p>Подробности ошибки: ${errorMessage}</p>
<#else>
    <p>Произошла ошибка. Пожалуйста, попробуйте снова.</p>
</#if>
</body>
</html>