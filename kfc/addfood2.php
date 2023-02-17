<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add food</title>
</head>
<body>
    <h1>Add Food</h1>
    <form action = "addfood.php"method = "POST">

    <input type="text"placeholder='เพิ่มรหัสอาหาร' name="FoodID">
    <br><br>
    <input type="text" placeholder='เพิ่มรายชื่ออาหาร' name ="FoodName">
    <br><br>
    <input type="text" placeholder='เพิ่มราคาอาหาร' name ="FoodPrice">
    <br><br>
    <textarea placeholder='เพิ่มรายละเอียดอาหาร' id="address" name="FoodDescription"
          rows="5" cols="33"></textarea>
    <br><br>
    <input type="text" placeholder='ใส่เมนูประเภทอาหาร' name ="MenuID">
    <br><br>
    <input type="submit">
    </form>
</body>
</html>

<?php 
require 'connect,php';
   $sql_select = "select*from tbl_food oder by MenuID";
   $stmt_s=$sonn->prepare($sql_select);
   $stmt_s->execute();
   if(!empty($_POST)) 
        ?>