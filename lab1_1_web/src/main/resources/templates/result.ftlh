<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">

        <h3 class="display-6">Результат</h3>
        <h5 class="display-10">Загальна кількість символів: ${size}</h5>

        <table>
            <tr>
                <th>Символ</th>
                <th>Кількість</th>
                <th>Частота (Pn)</th>
            </tr>
            <tr>

            </tr>
            <#list result?keys as key>
                <tr>
                    <td>${key}</td>
                    <td>${result[key]}</td>
                    <td>${result[key] / size}</td>
                </tr>
            </#list>

        </table>
<#--
        <#list result?keys as key>
            <p>${key} = ${result[key]}; Рn = </p>
        </#list>
-->

    </div>
</body>
</html>
