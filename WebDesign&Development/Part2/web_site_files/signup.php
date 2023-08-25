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
include 'client-side_validation.php';
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
<br>
		<div class="search">
			<div class="s-0">
				<input class="s-1 type="text" placeholder="Search..." name="search">
			</div>
			<div class="s-2">
				<button><img src="images/Search.png"/></button>
			</div>
			<div>
				<button><a href="login.php"><img src="images/login.png"/></a></button>
			</div>
			<div>
				<button><a href="basket_button.php"><img src="images/cart.png"/></a></button>
			</div>
			<div>
			<?php include 'logout_button.php';?>
			</div>
		</div>
		<div class="menu">
			<a href="#Lager">Lager</a>
			<a href="#Weissbier">Weissbier</a>
			<a href="#IPA">IPA</a>
			<a href="#Pilsner">Pilsner</a>
			<a href="#Scotch ale">Scotch ale</a>
			<a href="#Blond ale">Blond ale</a>
			<a href="#Red ale">Red ale</a>
			<a a href="fix page.php">Dunkel</a>
		</div>
<div class="signupform">
					<h1>Sign Up</h1>
					<p><b>Please fill in the form below to start your brewing journey with us.</b></p>
				</div>
<?php
  include 'signupform.php';
?>
<div class="signupform">
					<h3>Already a member?<a class="signup" href="login.php"><b>Login!<b></a></h3>
</div>
<hr/>
		<div class="footer">
			<div class="col-1">
				<ul><b>Help and Support</b></ul>
				<ul><a href="Brewholic.php">Live Help</a></ul>
				<ul><a href="Brewholic.php">Track Your Order</a></ul>
				<ul><a href="Brewholic.php">FAQs</a></ul>
			</div>
			<div class="col-2">
				<ul><b>Contact Us</b></ul>
				<ul><a href="Brewholic.php">Sales Department</a></ul>
				<ul><a href="Brewholic.php">Marketing Department</a></ul>
				<ul><a href="Brewholic.php">General Queries</a></ul>
			</div>
			<div class="col-3">
				<ul><b>About Us</b></ul>
				<ul><a href="Brewholic.php">Our Company</a></ul>
				<ul><a href="Brewholic.php">Our History</a></ul>
				<ul><a href="Brewholic.php">Our Products</a></ul>
			</div>
			<div class="col-4">
				<ul><b>Social Media</b></ul>
				<ul><a href="Brewholic.php">Facebook</a></ul>
				<ul><a href="Brewholic.php">Instagram</a></ul>
				<ul><a href="Brewholic.php">Twitter</a></ul>
			</div>
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