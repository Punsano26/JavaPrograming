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
    // if (!empty($_POST['FoodID'])&& !empty($_POST['FoodName'])&& !empty($_POST['FoodPrice'])&& !empty($_POST['FoodDescription'])&& !empty($_POST['MenuID'])):
        require'connect.php';
            $sql_insert="insert into tbl_food values (:FoodID,:FoodName,:FoodDescription,:FoodPrice,:MenuID)";

            $stmt = $conn->prepare($sql_insert);
            $stmt->bindParam(':FoodID',$_POST['FoodID']);
            $stmt->bindParam(':FoodName',$_POST['FoodName']);
            $stmt->bindParam(':FoodPrice',$_POST['FoodPrice']);
            $stmt->bindParam(':FoodDescription',$_POST['FoodDescription']);
            $stmt->bindParam(':MenuID',$_POST['MenuID']);

            if($stmt->execute()):
                $message = 'Sucessfully add new food';

                header("Location:/kfc/addfood.php");

            else:
                    $message='Fail to add new food';
            endif;
            echo $message;
            $conn=null;
        // endif;
        ?>