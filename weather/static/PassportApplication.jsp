<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form class="row g-3" action="passport">
    <div class="col-md-6">
        <label for="nameId" class="form-label">Applicant Name:</label>
        <input type="text" class="form-control" id="nameId">
    </div>
    <div class="col-md-6">
        <label for="adharId" class="form-label">Adhar No:</label>
        <input type="text" class="form-control" id="adharId">
    </div>
    <div class="col-md-6">
        <label for="addressId" class="form-label">Address:</label>
        <input type="text" class="form-control" id="addressId">
    </div>
    <div class="col-md-6">
        <label for="panId" class="form-label">Pan No:</label>
        <input type="text" class="form-control" id="panId">
    </div>
    <div class="col-md-6">
        <label for="stateId" class="form-label">State:</label>
        <input type="text" class="form-control" id="stateId">
    </div>
    <div class="col-md-6">
        <label for="cityId" class="form-label">City:</label>
        <input type="text" class="form-control" id="cityId">
    </div>
    <div class="col-md-6">
        <label for="pincodeId" class="form-label">Pincode:</label>
        <input type="text" class="form-control" id="pincodeId">
    </div>
    <div class="col-md-4">
        <label for="passporttype" class="form-label">Passport Type:</label>
        <select id="passporttype" class="form-select">
            <option selected>select</option>
            <option>Regular Passport</option>
            <option>Diplomatic Passport</option>
            <option>Official Passport</option>
            <option>Emergency Passport</option>
            <option>Other types</option>
        </select>
    </div>
    <div class="col-md-6">
        <label for="paymentId" class="form-label">Payment Reference No:</label>
        <input type="text" class="form-control" id="paymentId">
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>