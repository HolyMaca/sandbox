<?php
include 'server_connect.php';
?>

<?php
include 'validate_update_details.php';
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
			<div class="logo"><a href="Brewholic.html"><img src="images/Brewholic_logo.png" alt="Brewholic logo"/></a></div>
			<br> <h1>Update User's Details</h1>
		</div>
<br>
		
		<div>
			<div class="signupform">
<form action="<?php echo htmlspecialchars(basename($_SERVER['REQUEST_URI'])); ?>" method="post">
				
<hr>

					<span class = "error"> <?php echo $fname_err;?></span>
<br>
					<label for="fname"><b>First Name:<b></label><br>
					<input type="text" name="fname" <?php echo (!empty($fname_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $fname; ?>">
<br>
					<span class = "error"> <?php echo $lname_err;?></span>
<br>
					<label for="lname"><b>Last Name:<b></label><br>
					<input type="text" name="lname" <?php echo (!empty($lname_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $lname; ?>">
<br>
					<span class = "error"> <?php echo $dob_err;?></span>
<br>
					<label for="dob"><b>Date of Birth:<b></label><br>
					<input type="text" name="dob" <?php echo (!empty($dob_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $dob; ?>">
<br>
					<span class = "error"> <?php echo $address_err;?></span>
<br>
					<label for="address"><b>Address:<b></label><br>
					<input type="text" name="address" <?php echo (!empty($address_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $address; ?>">
<br>
					<span class = "error"> <?php echo $postcode_err;?></span>
<br>
					<label for="postcode"><b>Postcode:<b></label><br>
					<input type="text" name="postcode" <?php echo (!empty($postcode_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $postcode; ?>">
<br>
					<span class = "error"> <?php echo $email_err;?></span>
<br>
					<label for="email"><b>EMAIL:<b></label><br>
					<input type="text" name="email" <?php echo (!empty($email_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $email; ?>">
<br>
					<span class = "error"> <?php echo $phonenumber_err;?></span>
<br>
					<label for="phonenumber"><b>Phone number:<b></label><br>
					<input type="text" name="phonenumber" <?php echo (!empty($phonenumber_err)) ? 'is-invalid' : ''; ?>" placeholder="<?php echo $phonenumber; ?>">
<br>
					<input type="hidden" name="userID" value="<?php echo $userID; ?>"/>
					<div class="submit">
						<input type="submit" name="submit" id="submit" value="Update" />
					</div>
				</div>
			</form>
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