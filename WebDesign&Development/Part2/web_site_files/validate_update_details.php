<?php

$fname = $lname = $dob = $address = $postcode = $phonenumber = $email = "";
$fname_err = $lname_err = $dob_err = $address_err = $postcode_err = $phonenumber_err = $email_err = "";

if(isset($_POST["userID"]) && !empty($_POST["userID"])){
    
    $userID = $_POST["userID"];
	
	$input_fname = trim($_POST["fname"]);
    if(empty($input_fname)){
        $fname_err = "*Enter a First Name.";
    } elseif(!filter_var($input_fname, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z\s]+$/")))){
        $name_err = "Please enter a valid First name.";
    } else{
        $fname = $input_fname;
    }
	
	$input_lname = trim($_POST["lname"]);
    if(empty($input_lname)){
        $lname_err = "*Enter a Last Name.";
    } elseif(!filter_var($input_lname, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z\s]+$/")))){
        $lname_err = "Please enter a valid Last name.";
    } else{
        $lname = $input_lname;
    }
	
	$input_dob = trim($_POST["dob"]);
    if(empty($input_dob)){
        $dob_err = "*Enter a Date Of Birth.";
    } elseif(!filter_var($input_dob, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\d\d^")))){
        $dob_err = "Please enter a valid Date Of Birth.";
    } else{
        $dob = $input_dob;
    }
	
	$input_address = trim($_POST["address"]);
    if(empty($input_dob)){
        $dob_err = "*Enter an Address.";
    } else{
        $address = $input_address;
    }
	
	$input_postcode = trim($_POST["postcode"]);
    if(empty($input_postcode)){
        $postcode_err = "*Enter a Postcode.";
    } elseif(!filter_var($input_postcode, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"^[A-Za-z]{1,2}[0-9Rr][0-9A-Za-z]? [0-9][ABD-HJLNP-UW-Zabd-hjlnp-uw-z]{2}^")))){
        $postcode_err = "Please enter a valid Postcode.";
    } else{
        $postcode = $input_postcode;
    }
	
	$input_phonenumber = trim($_POST["phonenumber"]);
    if(empty($input_phonenumber)){
        $phonenumber_err = "*Enter a Phonenumber.";
    } elseif(!filter_var($input_phonenumber, FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"^\s*\(?(020[7,8]{1}\)?[ ]?[1-9]{1}[0-9{2}[ ]?[0-9]{4})|(0[1-8]{1}[0-9]{3}\)?[ ]?[1-9]{1}[0-9]{2}[ ]?[0-9]{3})\s*$^")))){
        $phonenumber_err = "Please enter a valid Phonenumber.";
    } else{
        $phonenumber = $input_phonenumber;
    }
	
	$input_email = trim($_POST["email"]);
    if(empty($input_email)){
        $email_err = "*Enter an e-mail.";
    } elseif(!filter_var($input_email, FILTER_VALIDATE_EMAIL)){
        $email_err = "Please enter a valid e-mail.";
    } else{
        $email = $input_email;
    }
	
	if(empty($fname_err) && empty($lname_err) && empty($dob_err) && empty($address_err) && empty($postcode_err) && empty($phonenumber_err) && empty($email_err)){
		$query = "UPDATE userstable SET fname ='$fname', lname='$lname', dob='$dob', address='$address', postcode='$postcode', phonenumber='$phonenumber', email='$email'WHERE userID='$userID'";
		
		if($stmt = mysqli_prepare($connect, $query)){
            
            mysqli_stmt_bind_param($stmt, "sssssssi", $param_fname, $param_lname, $param_dob, $param_address, $param_postcode, $param_phonenumber, $param_email, $param_userID);
            
            $param_fname = $fname;
            $param_lname = $lname;
            $param_dob = $dob;
            $param_address = $address;
			$param_postcode = $postcode;
			$param_phonenumber = $phonenumber;
			$param_email = $email;
			$param_userID = $userID;
            
            if(mysqli_stmt_execute($stmt)){
                
                header("location: admin_page.php");
                exit();
            } else{
                echo "Please try again later.";
            }
        }
         
        
        mysqli_stmt_close($stmt);
    }
    
    
    mysqli_close($connect);
} 
else{
    
    if(isset($_GET["userID"]) && !empty(trim($_GET["userID"]))){
        
        $userID =  trim($_GET["userID"]);
        
        
        $query = "SELECT * FROM userstable WHERE userID = ?";
        if($stmt = mysqli_prepare($connect, $query)){
            
            mysqli_stmt_bind_param($stmt, "i", $param_userID);
            
            
            $param_userID = $userID;
            
            
            if(mysqli_stmt_execute($stmt)){
                $result = mysqli_stmt_get_result($stmt);
    
                if(mysqli_num_rows($result) == 1){
                    
                    $row = mysqli_fetch_array($result, MYSQLI_ASSOC);
                    
                    
                    $fname = $row["fname"];
					$lname = $row["lname"];
					$dob = $row["dob"];
                    $address = $row["address"];
                    $postcode = $row["postcode"];
					$phonenumber = $row["phonenumber"];
					$email = $row["email"];
                } else{
                    
                    header("location: error.php");
                    exit();
                }
                
            } else{
                echo "Please try again later.";
            }
        }
        
        
        mysqli_stmt_close($stmt);
        
        
        mysqli_close($connect);
    }  else{
        
        header("location: admin_page.php");
        exit();
    }
}
?>