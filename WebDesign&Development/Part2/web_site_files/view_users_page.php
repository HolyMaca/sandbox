<?php
include 'server_connect.php';
?>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>Brewholic - Home page</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div class="top">
			<div class="logo"><a href="Brewholic.php"><img src="images/Brewholic_logo.png" alt="Brewholic logo"/></a></div>
		</div>
		<h2>Users details</h2>
		<p>
<?php
$userID=$_GET['userID'];

$query = "select * from userstable where userID=$userID";
$result = mysqli_query($connect, $query);

$row = mysqli_fetch_assoc($result);
echo "User name: $row[userName]"."<br/>";
echo "First Name: $row[fname]"."<br/>";
echo "Last Name: $row[lname]"."<br/>";
echo "Date of birth: $row[dob]"."<br/>";
echo "Address: $row[address]"."<br/>";
echo "Postcode: $row[postcode]"."<br/>";
echo "e-mail: $row[email]"."<br/>";
echo "Password: $row[password]"."<br/>";

?>
</p>		
		
		
		
		
		<div>
		<p>
<a href="http://jigsaw.w3.org/css-validator/check/referer">
    <img style="border:0;width:88px;height:31px"
        src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
        alt="Valid CSS!" />
    </a>
</p>
    </div>
	</body>
</html>