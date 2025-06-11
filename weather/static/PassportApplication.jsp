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
        <a class="navbar-brand" href="index.jsp">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link "  href="BirthCertificate.jsp">Birth Certificate</a>
                <a class="nav-link" href="DeathCertificate.jsp">Death certificate</a>
                <a class="nav-link" href="DrivingLicense.jsp">Driving License</a>
                <a class="nav-link" href="JobApplication.jsp">Job Application</a>
                <a class="nav-link" href="MarriageCertificate.jsp">Marriage Certificate</a>
                <a class="nav-link active" href="PassportApplication.jsp">Passport Application</a>
            </div>
        </div>
    </div>
</nav>
<form class="row g-3" action="passport" method="POST">
    <div class="col-md-6">
        <label for="nameId" class="form-label">Applicant Name:</label>
        <input type="text" class="form-control" name="name" id="nameId">
    </div>
    <div class="col-md-6">
        <label for="adharId" class="form-label">Adhar No:</label>
        <input type="text" class="form-control" name="adharNo" id="adharId">
    </div>
    <div class="col-md-6">
        <label for="addressId" class="form-label">Address:</label>
        <input type="text" class="form-control" name="address" id="addressId">
    </div>
    <div class="col-md-6">
        <label for="panId" class="form-label">Pan No:</label>
        <input type="text" class="form-control" name="panNo" id="panId">
    </div>
    <div class="col-md-6">
        <label for="stateId" class="form-label">State:</label>
        <input type="text" class="form-control" name="state" id="stateId">
    </div>
    <div class="col-md-6">
        <label for="cityId" class="form-label">City:</label>
        <input type="text" class="form-control" name="city" id="cityId">
    </div>
    <div class="col-md-6">
        <label for="pincodeId" class="form-label">Pincode:</label>
        <input type="text" class="form-control" name="pincode" id="pincodeId">
    </div>
    <div class="col-md-4">
        <label for="passporttype" class="form-label">Passport Type:</label>
        <select id="passporttype" name="passportType" class="form-select">
            <option selected>select</option>
            <option value="Regular Passport">Regular Passport</option>
            <option value="Diplomatic Passport">Diplomatic Passport</option>
            <option value="Official Passport">Official Passport</option>
            <option value="Emergency Passport">Emergency Passport</option>
            <option value="Other types">Other types</option>
        </select>
    </div>
    <div class="col-md-6">
        <label for="paymentId" class="form-label">Payment Reference No:</label>
        <input type="text" class="form-control" name="payment" id="paymentId">
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>