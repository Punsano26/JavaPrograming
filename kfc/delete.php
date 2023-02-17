<?php
    require "connect.php";
$sql = "delete from tbl_food WHERE FoodID =:FoodID";
$stmt = $conn->prepare($sql);
$stmt->bindParam(':FoodID',$_GET['FoodID']);
if
($stmt->execute()){
    $message = "Successfully delete food".$_GET['FoodID'].".";
     header("Location:/kfc/namefood.php");
}else{
    $message = "Fail to delete food information.";
}
echo $message;
$conn = null;
?>
