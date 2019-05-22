
<?php

include 'DatabaseConnection.php';

 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $cname = $_POST['name'];
 $cpassword = $_POST['password'];
 $cspeciality = $_POST['speciality'];
 $cstate = $_POST['state'];
 $ccity = $_POST['city'];
 $caddress = $_POST['address'];
 $cpincode = $_POST['pincode'];
 
 $Sql_Query = "INSERT INTO `finder`(`name`, `pass`, `speciality`, `state`, `city`, `address`,`pincode`) VALUES ('$cname','$cpassword','$cspeciality','$cstate','$ccity','$caddress','$cpincode')";
 
 if(mysqli_query($con,$Sql_Query)){
 
 echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
?>