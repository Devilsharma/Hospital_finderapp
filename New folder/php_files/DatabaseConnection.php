<?php
$HostName = "localhost";
$HostUser = "root";
$HostPass = "";
$DatabaseName = "hospital";


$conn = new mysqli($HostName, $HostUser, $HostPass,$DatabaseName);
// Check connection
if ($conn->connect_error) {
   die("Connection failed: " . $conn->connect_error);
}
  echo "Connected successfully";
?>