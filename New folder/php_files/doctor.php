<?php

include 'DatabaseConnection.php';

 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $clicense = $_POST['license'];
 $cdoctorid = $_POST['doctorid'];
 $cname = $_POST['name'];
 $cemailid = $_POST['emailid'];
 $cmobile = $_POST['mobile'];
 $cspecilization = $_POST['specilization'];

 $Sql_Query = "INSERT INTO  tbldoc (`license`, `doctorid`, `name`, `emailid`, `mobile`, `specilization`) VALUES ('$clicense','$cdoctorid','$cname','$cemailid','$cmobile','$cspecilization')";
 
 if(mysqli_query($con,$Sql_Query)){
 
 echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
?>