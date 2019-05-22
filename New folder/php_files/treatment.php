<?php

include 'DatabaseConnection.php';

 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $clicense = $_POST['license'];
 $ctreatment = $_POST['treatment'];
 $ccost = $_POST['cost'];
 
$Sql_Query="insert into tbl_treatment(h_lic_no ,treatment,cost) VALUES ('$clicense','$ctreatment','$ccost')";
 
// $Sql_Query = "INSERT INTO `finder`(`license`, `treatmet`, `cost`) VALUES ('$clicense','$ctreatment','$ccost')";
 
 if(mysqli_query($con,$Sql_Query)){
 
 echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
?>