<?php
$HostName = "localhost";
$HostUser = "root";
$HostPass = "";
$DatabaseName = "minor_project";
$con = mysqli_connect("118.185.43.122","0187cs161071","sistec","0187cs161071");
if (mysqli_connect_errno())
{
	echo "Failed to connect to MySQL: " . mysqli_connect_error();
}
?>