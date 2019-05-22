<?php

include 'DatabaseConnection.php';
 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $cname = $_POST['name'];
 $cage = $_POST['age'];
 $cphone = $_POST['phone_no'];
 $chospital = $_POST['h_lic_no'];
 $cappointment = $_POST['appoinment_date'];
 $caddress = $_POST['address'];
 $cpermision = $_POST['permision'];


 $Sql_Query = "INSERT INTO tblapp (`name`, `age`, `phone_no`, `h_lic_no`, `appoinment_date`, `address`, `permision`) VALUES ('$cname','$cage','$cphone','$chospital','$cappointment','$caddress','$cpermision')";
 
 
 
 if(mysqli_query($con,$Sql_Query)) {
 
   echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
?>