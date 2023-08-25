<div>
<?php

$query = "select * from userstable order by userName asc";
$result = mysqli_query($connect, $query);
$num = mysqli_num_rows($result); 

if ($num > 0){
  echo "<p><big>There are $num users in the database</big></p>";
  echo '<table>
	  <tr>
		<td><b>Username</b></td>
	    <td><b>First Name</b></td>
	    <td><b>Last Name</b></td>
		<td><b>Date Of Birth</b></td>
		<td><b>Address</b></td>
		<td><b>Postcode</b></td>
		<td><b>Phonenumber</b></td>
		<td><b>email</b></td>
		<td><b>Password</b></td>
	    <td></td>
            <td></td>
	  </tr>';
	
  while ($row = mysqli_fetch_assoc($result)){
    echo "<tr>
		<td>$row[userName]</td>
	    <td>$row[fname]</td>
	    <td>$row[lname]</td>
		<td>$row[dob]</td>
		<td>$row[address]</td>
		<td>$row[postcode]</td>
		<td>$row[phonenumber]</td>
		<td>$row[email]</td>
		<td>$row[password]</td>
            <td>
              <a href=\"view_users_page.php?userID=$row[userID]\">view</a>
            </td>
            <td>
              <a href=\"admin_page.php?removeID=$row[userID]\">remove</a>
            </td>
			<td>
              <a href=\"update_details_page.php?userID=$row[userID]\">update details</a>
            </td>
	  </tr>";
  }
  echo '</table>';
  mysqli_free_result($result);
} 	
?>

</div>