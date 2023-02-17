<html>
<head>
<title>Search Phonenumber customer</title>
</head>
<body>
    <h1>Search PhoneNumber 0......</h1>
    <form action="form.php" method="GET">
ใส่หมายเลขโทรศัพท์ <br>
        <input type="text" placeholder="Enter phonenumber" name="PhoneNumber">

        <br> <br>

        <input type="submit">
    </form>
</body>
</html>

<?php
$count=0;
require "connect.php";


if(isset($_GET["PhoneNumber"]))

{

    $Phone = $_GET["PhoneNumber"];
    echo "<br>"."PhoneNumber =".$Phone;
    $sql="SELECT * 
            FROM tbl_customer
            WHERE CustomerID AND PhoneNumber Like CONCAT('%', :PhoneNumber, '%')";

    // echo "<br>" . "sql=".$sql."<br>";
    $stmt = $conn->prepare($sql);
    $stmt ->bindParam(':PhoneNumber',$_GET['PhoneNumber']);
    $stmt->execute();
   
?>
    <table width="300" border="1">
  <tr>
    <th width="325">รหัสลูกค้า</th>
    <th width="130">ชื่อจริง</th>
    <th width="130">นามสกุล</th>
    <th width="130">เบอร์โทร</th>
  </tr>

 
<?php
    echo "<br>******************<br>";

    while ($result = $stmt->fetch(PDO::FETCH_NUM)) {
        //echo $row['P_name']. '&nbsp' . $row['P_debt'] ."<br>";
        
        
?>
  <tr>
    <td><?php echo $result[0]; ?></div></td>
    <td><?php echo $result[1]; ?></div></td>
    <td><?php echo $result[2]; ?></div></td>
    <td><?php echo $result[3]; ?></div></td>
  </tr>

<?php
        
    }
    $count++;
    //echo "count ... ".$count;
    if($count==0)
    echo "<br> No data ... <br>";

}

?>


 
  
<?php
$conn = null;
?></table>