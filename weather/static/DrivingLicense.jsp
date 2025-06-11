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
                <a class="nav-link" href="DeathCertificate.jsp">Death certificate</a>
                <a class="nav-link active" href="DrivingLicense.jsp">Driving License</a>
                <a class="nav-link" href="JobApplication.jsp">Job Application</a>
                <a class="nav-link" href="MarriageCertificate.jsp">Marriage Certificate</a>
                <a class="nav-link" href="PassportApplication.jsp">Passport Application</a>
            </div>
        </div>
    </div>
</nav>
<form class="row g-3" action="drive" method="POST">
    <div class="col-md-6">
        <label for="nameId" class="form-label">Name:</label>
        <input type="text" class="form-control" name="name" id="nameId">
    </div>
    <div class="col-md-6">
        <label for="addressId" class="form-label">Address:</label>
        <input type="text" class="form-control" name="address" id="addressId">
    </div>
    <div class="col-md-6">
        <label for="mobileNoId" class="form-label">Mobile No:</label>
        <input type="number" class="form-control" name="mobileNo" id="mobileNoId">
    </div>
    <div class="col-md-6">
        <label for="appliedDateId" class="form-label">Applied Date:</label>
        <input type="date" class="form-control" name="appliedDate" id="appliedDateId">
    </div>
    <div class="col-md-4">
        <label for="vehicleTypeId" class="form-label">Vehicle Type:</label>
        <select id="vehicleTypeId" name="vehicleType" class="form-select">
            <option selected>select</option>
            <option value="Motorcycle">Motorcycle</option>
            <option value="Van">Van</option>
            <option value="Bus">Bus</option>
            <option value="Car">Car</option>
            <option value="Truck">Truck</option>
            <option value="Sports Car">Sports Car</option>
        </select>
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>