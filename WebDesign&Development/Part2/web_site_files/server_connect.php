<?php

$server = 'localhost';
$database = '40512375';
$username = '40512375';
$password = '123';

$connect = mysqli_connect($server, $username, $password, $database);

if (mysqli_connect_errno())  {
   die('Could not connect: ' . mysqli_connect_error());
}
?> 