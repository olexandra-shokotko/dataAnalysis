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

        <div class="jumbotron">
            <div class="mb-1">Введіть свій текст</div>

            <form action="/count" method="post">
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Текст:</label>
                    <div class="col-sm-6">
                        <textarea type="text" name="text" class="form-control" placeholder="Текст"></textarea>
                    </div>
                </div>

                <button class="btn btn-primary" type="submit">Порахувати</button>
            </form>
        </div>

    </div>
</body>
</html>
