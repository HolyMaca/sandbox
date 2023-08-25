<?php

$userName = $fname = $lname = $dob = $address = $postcode = $phonenumber = $email = $password = $reppass = $ckeckbox = $type = "";
$userName_err = $fname_err = $lname_err = $dob_err = $address_err = $postcode_err = $phonenumber_err = $email_err = $password_err = $reppass_err = $ckeckbox_err = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    
	if (empty($_POST["userName"])) {
        $userName_err = "*Username is required";
    }else {
        $userName = test_input($_POST["userName"]);
		
		if (!preg_match("^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$^",$userName)){
			$userName_err = "*Invalid username";
		}
    }
	
	if (empty($_POST["fname"])) {
        $fname_err = "*First name is required";
    }else {
        $fname = test_input($_POST["fname"]);
		if (!preg_match("^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$^",$fname)){
			$fname_err = "*Invalid First name";
		}
    }
	
	if (empty($_POST["lname"])) {
        $lname_err = "*Last name is required";
    }else {
        $lname = test_input($_POST["lname"]);
		if (!preg_match("^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$^",$lname)){
			$lname_err = "*Invalid Last name";
		}
    }
	
	if (empty($_POST["dob"])) {
        $dob_err = "*Date of birth is required";
    }else {
        $dob = test_input($_POST["dob"]);
		
		if(!preg_match("^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\d\d^",$dob)){
			$dob_err = "Invalid date";
		}
    }
	
	if (empty($_POST["address"])) {
        $address_err = "*Address is required";
    }else {
        $address = test_input($_POST["address"]);
	}
	
	if (empty($_POST["postcode"])) {
        $postcode_err = "*Postcode is required";
    }else {
        $postcode = test_input($_POST["postcode"]);
		
		if(!preg_match("^[A-Za-z]{1,2}[0-9Rr][0-9A-Za-z]? [0-9][ABD-HJLNP-UW-Zabd-hjlnp-uw-z]{2}^",$postcode)){
			$postcode_err = "*Invalid postcode";
		}
	}
	
	if (empty($_POST["phonenumber"])) {
        $phonenumber_err = "*Postcode is required";
    }else {
        $phonenumber = test_input($_POST["phonenumber"]);
		
		if(!preg_match("^\s*\(?(020[7,8]{1}\)?[ ]?[1-9]{1}[0-9{2}[ ]?[0-9]{4})|(0[1-8]{1}[0-9]{3}\)?[ ]?[1-9]{1}[0-9]{2}[ ]?[0-9]{3})\s*$^",$phonenumber)){
			$phonenumber_err = "*Invalid phonenumber";
		}
	}
	
	if (empty($_POST["email"])) {
        $email_err = "*Email is required";
    }else {
        $email = test_input($_POST["email"]);
		
		if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {
                  $emailErr = "*Invalid email format";
		}
	}
	
	if (empty($_POST["password"])) {
        $password_err = "*Password is required";
    }else {
        $password = test_input($_POST["password"]);
		
		if(strlen($_POST["password"]) < 6){
			$password_err = "*Password must have at least 6 characters.";
		}
		elseif(!preg_match("^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$^",$password)){
			$password_err = "*Password must contain 1 Uppercase, 1 Lowercase and 1 number";
		}
	}
	
	if(empty($_POST["reppass"])){
		$reppass_err = "*Please confirm password";
	}else{
		$reppass = $_POST["reppass"];
		if(empty($reppass_err) && ($password != $reppass)){
			$reppass_err = "*Password did not match.";
		}
	}

	if(empty($userName_err) && empty($fname_err) && empty($lname_err) && empty($dob_err) && empty($address_err) && empty($postcode_err) && empty($phonenumber_err) && empty($email_err) && empty($password_err) && empty($reppass_err) && empty($checkbox_err)){
		
		$query = "insert into userstable (userName, fname, lname, dob, address, postcode, phonenumber, email, password) values ('$userName', '$fname', '$lname', '$dob', '$address', '$postcode', '$phonenumber', '$email', md5('$password'))";
  
		mysqli_query($connect, $query);
	}
}
function test_input($data){
	$data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
}  

if (isset($_GET['removeID'])){
  $id = $_GET['removeID'];
 
  mysqli_query($connect, "DELETE FROM userstable WHERE userID=$id");
}  



?>	