<?php
$serverName = 'localhost';
$userName = 'root';
$userPassword = ''; 
$dbname = 'kfc';

try {
    $conn = new PDO(
        "mysql:host=localhost;dbname=kfc;charset=UTF8",
         $userName,
         $userPassword 
    );

    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo 'You are now connecting to database!';

} catch (PDOException $e) {
    echo 'Sorry! You cannot connect to database: ' . $e->getMessage();
}
?>