<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab</title>

    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">

        <h3 class="display-6">Результат</h3>
        <h5 class="display-10">Загальна кількість символів: ${size}</h5>
        <h6 class="display-10">Найбільший екстремум: ${biggest}</h6>
        <h6 class="display-10">Найменший екстремум: ${smallest}</h6>

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

        <div>
            <canvas id="myChart"></canvas>
        </div>

    </div>
</body>
</html>

<script>
    const labels = "[[${stringKeys}]]";
    <#--const labels = ${stringKeys}-->
    // const labels = [
    //     'January',
    //     'February',
    //     'March',
    //     'April',
    //     'May',
    //     'June',
    // ];
    const data = {
        labels: labels,
        datasets: [{
            label: 'My First dataset',
            backgroundColor: 'rgb(255, 99, 132)',
            borderColor: 'rgb(255, 99, 132)',
            data: "[[${intValues}]]",
            <#--data: ${intValues},-->
        }]
    };

    const config = {
        type: 'line',
        data: data,
        options: {}
    };

    var myChart = new Chart(
        document.getElementById('myChart'),
        config
    );
</script>
