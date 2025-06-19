<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form class="row g-3" action="register" method="POST">
    <div class="col-md-6">
        <label for="nameId" class="form-label">User Name:</label>
        <input type="text" class="form-control" name="nameName" id="nameId" value=${dto.name}>
    </div>
    <div class="col-md-6">
        <label for="mobileNoId" class="form-label">Mobile No.:</label>
        <input type="number" class="form-control" name="moblieNoName" id="mobileNoId">
    </div>
    <div class="col-md-6">
        <label for="emailId" class="form-label">Email:</label>
        <input type="email" id="emailId" name="emailName" class="form-select">

    </div>
    <div class="col-md-6">
        <label for="passwordId" class="form-label">Password:</label>
        <input type="text" class="form-control" name="passwordName" id="passwordId">
    </div>
    <div class="col-12">
        <button type="submit" name="submit" class="btn btn-primary">Register</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>