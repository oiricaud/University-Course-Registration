<?php
/*
*  A summary informing the user what the associated class does.
*
*   Register Class is the back end of the android application for the University Registration System.
*   This class allows the android app to make connections with the database: narped5_RegisterSystemOOV3
*   It allows new users to register for accounts and checks if the username is available.
*  @author Oscar I. Ricaud
*  @version 1.0 Build November 16, 2016
 
*/
    $con =  mysqli_connect("localhost", "YOUR username goes here ", "YOUR Password goes here", "The name of your database");

    $firstname = $_POST["firstname"];
    $lastname = $_POST["lastname"];
    $email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $age = $_POST["age"];

     function registerUser() {
        global $connect, $firstname, $lastname, $email, $username, $password, $age;
        $statement = mysqli_prepare($connect, "INSERT INTO user (firstname, lastname, email, username, password, age) VALUES (?, ?, ?, ?, ?, ?)");
        mysqli_stmt_bind_param($statement, "sssssi", $firstname, $lastname, $email, $username, $password, $age);
        mysqli_stmt_execute($statement);
        mysqli_stmt_close($statement);     
    }
    function usernameAvailable() {
        global $connect, $username;
        $statement = mysqli_prepare($connect, "SELECT * FROM user WHERE username = ?"); 
        mysqli_stmt_bind_param($statement, "s", $username);
        mysqli_stmt_execute($statement);
        mysqli_stmt_store_result($statement);
        $count = mysqli_stmt_num_rows($statement);
        mysqli_stmt_close($statement); 
        if ($count < 1){
            return true; 
        }else {
            return false; 
        }
    }
    $response = array();
    $response["success"] = false;  
    if (usernameAvailable()){
        registerUser();
        $response["success"] = true;  
    }
    echo json_encode($response)
?>