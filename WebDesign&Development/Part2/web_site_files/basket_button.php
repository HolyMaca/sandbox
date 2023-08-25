<?php

if (isset($_SESSION['userName'])){
			header('location: user_basket.php');
		}else{
			header('location: login.php');
		}
?>