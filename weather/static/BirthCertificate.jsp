<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form class="row g-3" action="birth" method="POST">
    <div class="col-md-6">
        <label for="birthId" class="form-label">Birth Id:</label>
        <input type="text" class="form-control" name="birthName" id="birthId">
    </div>
    <div class="col-md-6">
        <label for="fatherNameId" class="form-label">Father Name:</label>
        <input type="text" class="form-control" name="fatherName" id="fatherNameId">
    </div>
    <div class="col-md-6">
        <label for="motherNameId" class="form-label">Mother Name:</label>
        <input type="text" class="form-control" name="motherName" id="motherNameId">
    </div>
    <div class="col-md-6">
        <label for="doctorNameId" class="form-label">Doctor Name:</label>
        <input type="text" class="form-control" name="doctorName" id="doctorNameId">
    </div>
    <div class="col-md-6">
        <label for="nurseNameId" class="form-label">Nurse Name:</label>
        <input type="text" class="form-control" name="nurseName" id="nurseNameId">
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
    <div class="col-md-4">
        <label for="hospitalTypeId" class="form-label">Hospital Type:</label>
        <select id="hospitalTypeId" name="hospitalType" class="form-select">
            <option selected>select</option>
            <option value="Multispeciality Hospital">Multispeciality Hospital</option>
            <option value="Gynecology">Gynecology</option>
            <option value="arthralgia">arthralgia</option>
            <option value="Obstetrician">Obstetrician</option>
            <option value="Ayurveda">Ayurveda</option>
        </select>
    </div>
    <div class="col-12">
        <button type="submit" name="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>