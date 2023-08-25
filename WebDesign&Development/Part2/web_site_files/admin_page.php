<?php 
session_start();
?>

<?php
include 'server_connect.php';
?>

<?php

include 'create_users_table.php';
?>

<?php

include 'create_form_validation.php';

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
			<br> <h1>Administartor Page</h1>
		</div>
		<h2>Add a user</h2>
		<?php include 'create_user_form.php';?>
		<hr/>
<div>
		<h2>User's list</h2>
		<?php include 'users_table.php';?>
		</div>
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