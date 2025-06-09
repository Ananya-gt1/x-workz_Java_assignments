<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contacts</title>
</head>
<body>

<form action="contact" method="POST" >
    <label>Full Name:</label>
    <div class="name-fields">
        <input type="text" name="firstName" placeholder="First Name" required>
        <input type="text" name="lastName" placeholder="Last Name" required>
    </div>
    <label>Email:</label>
    <input type="email" name="email" placeholder="Enter valid Email" required>
    <label>Phone Number:</label>
    <input type="number" name="num" placeholder="Enter valid number" required>
    <label>Comments:</label>
    <input type="text" name="comments" placeholder="Enter comments" required>
    <button type="submit">Submit</button>
</form>
</body>
</html>