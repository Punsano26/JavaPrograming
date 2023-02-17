<html> <head>
<title> <table> food menu</table></title>
</head>
<body>
<?php
require "connect.php";
$sql = "SELECT tbl_food.FoodName, tbl_Food.FoodDescription, tbl_menu.MenuName, tbl_food.Foodprice 
        FROM tbl_food, tbl_menu
        WHERE tbl_food.MenuID = tbl_menu.MenuID AND tbl_menu.MenuID = tbl_food.MenuID";
$stmt = $conn->prepare($sql);
$stmt->execute();
?>

<table width="800" border="1">
  <tr>
    <th width="90"> <div align="center">ชื่ออาหาร</th>
    <th width="140"> <div align="center">รายละเอียด </th>
    <th width="120"> <div align="center">เมนู </th>
    <th width="70"> <div align="center">ราคา </th>
  </tr>

<?php
  while ($result = $stmt->fetch(PDO::FETCH_ASSOC)) {
?>

  <tr>
    

  

   <td><?php echo $result["FoodName"]; ?></div></td>
    <td><?php echo $result["FoodDescription"]; ?></td>
    <td><?php echo $result["MenuName"]; ?></div></td>
    <td><?php echo $result["Foodprice"]; ?></td>
    
  </tr>

<?php
  }
?>

</table>

<?php
$conn = null;
?>
</body>  
</html>