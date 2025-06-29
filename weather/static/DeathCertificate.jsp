<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
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
                <a class="nav-link "  href="BirthCertificate.jsp">Birth Certificate</a>
                <a class="nav-link active" href="DeathCertificate.jsp">Death certificate</a>
                <a class="nav-link" href="DrivingLicense.jsp">Driving License</a>
                <a class="nav-link" href="JobApplication.jsp">Job Application</a>
                <a class="nav-link" href="MarriageCertificate.jsp">Marriage Certificate</a>
                <a class="nav-link" href="PassportApplication.jsp">Passport Application</a>
            </div>
        </div>
    </div>
</nav>
<form class="row g-3" action="death" method="POST">
    <div class="col-md-6">
        <label for="nameId" class="form-label">Name:</label>
        <input type="text" class="form-control" name="name" id="nameId">
    </div>
    <div class="col-md-6">
        <label for="causeId" class="form-label">Cause:</label>
        <input type="text" class="form-control" name="cause" id="causeId">
    </div>
    <div class="col-md-6">
        <label for="dateId" class="form-label">Date:</label>
        <input type="date" class="form-control" name="date" id="dateId">
    </div>
    <div class="col-md-6">
        <label for="timeId" class="form-label">Time:</label>
        <input type="time" class="form-control" name="time" id="timeId">
    </div>
    <div class="col-md-6">
        <label for="ageAtDeathId" class="form-label">Age at death:</label>
        <input type="text" class="form-control" name="ageAtDeath" id="ageAtDeathId">
    </div>
    <div class="col-md-6">
        <label for="certifiedById" class="form-label">Certified By:</label>
        <input type="text" class="form-control" name="certifiedBy" id="certifiedById">
    </div>
    <div class="col-md-4">
        <label for="hospitalNameId" class="form-label">Hospital Name:</label>
        <select id="hospitalNameId" name="hospitalName" class="form-select">
            <option selected>select</option>
            <option value="ESCI Hospital">ESCI Hospital</option>
            <option value="Modi Hospital">Modi Hospital</option>
            <option value="Manipal Hospital">Manipal Hospital</option>
            <option value="Apollo Hospital">Apollo Hospital</option>
            <option value="Victoria Hospital">Victoria Hospital</option>
            <option value="Citi Hospital">Citi Hospital</option>
        </select>
    </div>
    <div class="col-md-6">
        <label for="mannerOfDeathId" class="form-label">Manner of Death:</label>
        <input type="text" class="form-control" name="mannerOfDeath" id="mannerOfDeathId">
    </div>
    <div class="col-md-6">
        <label for="genderId" class="form-label">Gender:</label>
        <input type="text" class="form-control" name="gender" id="genderId">
    </div>
    <div class="col-md-6">
        <label for="marksId" class="form-label">Marks:</label>
        <input type="text" class="form-control" name="marks" id="marksId">
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>