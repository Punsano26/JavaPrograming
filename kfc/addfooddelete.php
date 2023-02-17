<html> <head>
<title> <table> food menu</table></title>
</head>
<body>
<?php
require "connect.php";
$sql = "SELECT * FROM tbl_food";
$stmt = $conn->prepare($sql);
$stmt->execute();
?>

<table width="800" border="1">
  <tr>
    <th width="120"> <div align="center">รหัสอาหาร </th>
    <th width="90"> <div align="center">ชื่ออาหาร</th>
    <th width="70"> <div align="center">ราคา </th>
    <th width="140"> <div align="center">รายละเอียด </th>
    
  </tr>

<?php
  while ($result = $stmt->fetch(PDO::FETCH_ASSOC)) {
?>

  <tr>
    

  
    <td>   
    <a href="delete.php?FoodID=<?php echo $result["FoodID"];?>">
                      <?php echo $result["FoodID"]; ?>
    </a>     
    </td>
   <td><?php echo $result["FoodName"]; ?></div></td>
   <td><?php echo $result["FoodPrice"]; ?></td>
    <td><?php echo $result["FoodDescription"]; ?></td>
    
    
    
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