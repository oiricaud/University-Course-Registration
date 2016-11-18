<?php
/*
*  A summary informing the user what the associated class does.
*
*   Login Class is the back end of the android application for the University Registration System.
*   This class allows the android app to make connections with the database: narped5_RegisterSystemOOV3
*   but before any of that happens the @param selects the appropriate column of the username and password for 
*   for the $statement variable.
*   The while fetches basic information of the user and once out it echos the responses in a JSON format.
*  @author Oscar I. Ricaud
*  @version 1.0 Build November 16, 2016
*/
    $con =  mysqli_connect("localhost", "YOUR username goes here ", "YOUR Password goes here", "The name of your database");
    
    $username = $_POST["username"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $name, $age, $username, $password);
    
    $response = array();
    $response["success"] = false; 
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["name"] = $name;
        $response["age"] = $age;
        $response["username"] = $username;
        $response["password"] = $password;
    }
    
    echo json_encode($response);
?>