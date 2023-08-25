<?php

$userName = $password = "";
$userName_err = $password_err = $log_error = "";

if($_SERVER["REQUEST_METHOD"] == "POST"){
	
	if(empty($_POST["userName"])){
		$userName_err = "*Enter your Username";
	}else{
		$userName = test_input($_POST["userName"]);
	}
	
	if(empty($_POST["password"])){
		$password_err = "*Enter your Password";
	}else{
		$password = test_input($_POST["password"]);
	}
	
	if(empty($userName_err) && empty($password_err)){
		
		$query = "select * from userstable where userName='$userName' and password=md5('$password')";
		
		$result = mysqli_query($connect, $query);
		$count=mysqli_num_rows($result);
		if($count>0){
			$row=mysqli_fetch_assoc($result);
		$_SESSION['type']=$row['type'];
			$_SESSION['userName']=$userName;
			$_SESSION['is_login']='yes';
			if($row['type']==1){
				header('location:admin_page.php');
			}if($row['type']==0){
				header('location:fix page.php');
			}
		
		}
		
		
	}
}
function test_input($data){
	$data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
}  
?>