<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Forms</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-black navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Forms</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active "  href="PgForm.jsp">Pg Form</a>
            </div>
        </div>
    </div>
</nav>
<form class="row g-3" action="pg" method="POST">
    <div class="col-md-6">
        <label for="nameId" class="form-label">Name:</label>
        <input type="text" class="form-control" name="nameName" id="nameId">
    </div>
    <div class="col-md-6">
        <label for="occupationId" class="form-label">Occupation:</label>
        <select id="occupationId" name="occupationName" class="form-select">
            <option selected>select</option>
            <option value="Student">Student</option>
            <option value="Worker">Worker</option>
            <option value="Others">Others</option>
        </select>
    </div>
    <div class="col-md-6">
        <label for="fatherNameId" class="form-label">Father Name:</label>
        <input type="text" class="form-control" name="fatherName" id="fatherNameId">
    </div>
    <div class="col-md-6">
        <label for="motherNameId" class="form-label">Mother Name:</label>
        <input type="text" class="form-control" name="motherName" id="motherNameId">
    </div>
    <div class="col-md-4">
        <label for="dateofBirthId" class="form-label">Date of Birth:</label>
        <input type="date" class="form-control" name="dateOfBirthName" id="dateofBirthId">
    </div>
    <div class="col-md-6">
        <label for="addressId" class="form-label">Address:</label>
        <input type="text" class="form-control" name="addressName" id="addressId">
    </div>
    <div class="col-md-6">
        <div class="form-check">
            <input type="checkbox" class="form-check-input" name="checkBoxName" id="checkBoxId">
            <label for="checkBoxId" class="form-check-label">Agreed</label>
        </div>
    </div>
    <div class="col-12">
        <button type="submit" name="submit" class="btn btn-primary">Submit</button>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>



