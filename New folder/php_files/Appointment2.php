<?php

//$con = mysqli_connect(`localhost`,`root`,``,`hospital`);
	
	define('HostName','localhost');
	define('DatabaseName', 'check_db');
	define('HostUser', 'root');
	define('HostPass', '');
 
 $cname = $_POST['name'];
 $cage = $_POST['age'];
 $cphone = $_POST['phone_no'];
 $chospital = $_POST['h_lic_no'];
 $cappointment = $_POST['appoinment_date'];
 $caddress = $_POST['address'];
 $cpermission = $_POST['permision'];

 $con = mysqli_connect(HostName,HostUser,HostPass,DatabaseName);
 
 if($con->connect_error){echo 'NOCON';}
 $Sql_Query = "INSERT INTO tbl_appointment(user_id,pass_key)VALUES('$HostUser','$HostPass');";
 $val = mysqli_query($con,$Sql_Query); 
 
 if($val){
 		$add_user = "INSERT INTO tbl_appointment(user_id,name,age,phone_no,h_lic_no,appoinment_date,address,permision)
 		VALUES('$HostUser','$cname','$cage','$cphone','$chospital','$cappointment','$caddress','$cpermision');";
 		$ex = mysql_query($con,$add_user);

 }
 if (mysqli_affected_rows($con) > 0 ) {echo "SUCCES";}
 else{echo "FAILED";}
 mysqli_close($con);
?>