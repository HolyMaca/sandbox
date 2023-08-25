

<div class="signupform">
<form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="post">
				
<hr>
					<span class = "error"><b> <?php echo $userName_err;?><b></span>
<br>
					<label for="userName"><b>Username:<b></label><br>
					<input type="text" placeholder="Enter your Username" name="userName" id="userName" autofocus />
<br>
					<span class = "error"> <?php echo $fname_err;?></span>
<br>
					<label for="fname"><b>First Name:<b></label><br>
					<input type="text" placeholder="Enter your First Name" id="fname" name="fname"/>
<br>
					<span class = "error"> <?php echo $lname_err;?></span>
<br>
					<label for="lname"><b>Last Name:<b></label><br>
					<input type="text" placeholder="Enter your Last Name" id="lname" name="lname"/>
<br>
					<span class = "error"> <?php echo $dob_err;?></span>
<br>
					<label for="dob"><b>Date of Birth:<b></label><br>
					<input type="text" placeholder="MM/DD/YYYY" id="dob" name="dob"/>
<br>
					<span class = "error"> <?php echo $address_err;?></span>
<br>
					<label for="address"><b>Address:<b></label><br>
					<input type="text" placeholder="Enter your Address" id="address" name="address"/>
<br>
					<span class = "error"> <?php echo $postcode_err;?></span>
<br>
					<label for="postcode"><b>Postcode:<b></label><br>
					<input type="text" placeholder="Enter your Postcode" id="postcode" name="postcode"/>
<br>
					<span class = "error"> <?php echo $email_err;?></span>
<br>
					<label for="email"><b>EMAIL:<b></label><br>
					<input type="text" placeholder="Enter your email" id="email" name="email"/>
<br>
					<span class = "error"> <?php echo $phonenumber_err;?></span>
<br>
					<label for="phonenumber"><b>Phone number:<b></label><br>
					<input type="text" placeholder="Enter your Phone Number" id="phonenumber" name="phonenumber"/>
<br>
					<span class = "error"> <?php echo $password_err;?></span>
<br>
					<label for="pass"><b>Password:<b></label><br>
					<input type="password" placeholder="Enter your Password" name="password" id="password"/>
<br>
					<span class = "error"> <?php echo $reppass_err;?></span>
<br>
					<label for="reppass"><b>Repeat Password:<b></label><br>
					<input type="password" placeholder="Repeat your Password" name="reppass" id="reppass"/>
<br>
<br>					
					<div class="submit">
						<input type="submit" name="submit" id="submit" value="Create" />
					</div>
				</div>
			</form>