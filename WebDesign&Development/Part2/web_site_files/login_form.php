<div class="signupform">
<form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="post">
				
<hr>
					<h2><span class = "error"><b> <?php echo $log_error;?><b></span></h2>				
					<span class = "error"><b> <?php echo $userName_err;?><b></span>
<br>
					<label for="userName"><b>Username:<b></label><br>
					<input type="text" placeholder="Enter your Username" name="userName" id="userName" autofocus />
<br>
					<span class = "error"> <?php echo $password_err;?></span>
<br>
					<label for="pass"><b>Password:<b></label><br>
					<input type="password" placeholder="Enter your Password" name="password" id="password"/>
<br>
<br>
					<div class="submit">
						<input type="submit" name="Login" id="Login" value="Login" />
					</div>
				</div>
			</form>