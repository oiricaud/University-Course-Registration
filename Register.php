<?php
    $con = mysqli_connect("127.0.0.1", "my_user", "my_password", "my_db");
    
    $name = $_POST["name"];
    $age = $_POST["age"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $statement = mysqli_prepare($con, "INSERT INTO user(name, username, age, password) VALUES (name, username, age, password)");
    mysqli_stmt_bind_param($statement, "ssis", $name, $username, $age, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    print(json_encode($response));

?>