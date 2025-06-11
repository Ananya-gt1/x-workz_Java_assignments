
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form class="row g-3" action="marriage" method="POST">
    <div class="col-md-6">
        <label for="groomNameId" class="form-label">Groom Name:</label>
        <input type="text" class="form-control" name="groomName" id="groomNameId">
    </div>
    <div class="col-md-6">
        <label for="brideNameId" class="form-label">Bride Name:</label>
        <input type="text" class="form-control" name="brideName" id="brideNameId">
    </div>
    <div class="col-md-6">
        <label for="locationId" class="form-label">Location:</label>
        <input type="text" class="form-control" name="location" id="locationId">
    </div>
    <div class="col-md-6">
        <label for="addressId" class="form-label">Address:</label>
        <input type="text" class="form-control" name="address" id="addressId">
    </div>
    <div class="col-md-6">
        <label for="religionId" class="form-label">Religion:</label>
        <input type="text" class="form-control" name="religion" id="religionId">
    </div>
    <div class="col-md-6">
        <label for="dateId" class="form-label">Date:</label>
        <input type="date" class="form-control" name="date" id="dateId">
    </div>
    <div class="col-md-6">
        <label for="witness1Id" class="form-label">Witness 1:</label>
        <input type="text" class="form-control" name="witness1" id="witness1Id">
    </div>
    <div class="col-md-6">
        <label for="witness2Id" class="form-label">Witness 2:</label>
        <input type="text" class="form-control" name="witness2" id="witness2Id">
    </div>
    <div class="col-md-6">
        <label for="officerPresentId" class="form-label">Officer Present:</label>
        <input type="text" class="form-control" name="officerPresent" id="officerPresentId">
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>