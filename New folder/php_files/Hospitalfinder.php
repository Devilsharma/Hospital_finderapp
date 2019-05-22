<?php

include 'DatabaseConnection.php';

// $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);


 $hname = $_POST['name'];
 $hlicence = $_POST['licence'];
 $hemail = $_POST['email'];
 $haddress = $_POST['address'];
 $hstate = $_POST['state'];
 $hdistrict = $_POST['district'];
 $hpin = $_POST['pin_code'];
 $hphoneno = $_POST['phone_no'];
 $hpassword = $_POST['password'];
 $howner = $_POST['owner'];
 $hstdyear = $_POST['std_year'];
 $q1 = $_POST['q1'];
 

$Sql_Query="insert into tblhosp (name,licence,email,address,state,district,pin_code,phone_no,password,owner,std_year,q1) VALUES ('$hname','$hlicence','$hemail','$haddress','$hstate','$hdistrict','$hpin','$hphoneno','$hpassword','$howner','$hstdyear','$q1')";

 if(mysqli_query($conn,$Sql_Query)){
 
 echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($conn);

?>
