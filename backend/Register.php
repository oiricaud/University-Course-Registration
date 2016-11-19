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
    
    $name = $_POST["name"];
    $age = $_POST["age"];
    $username = $_POST["username"];
    $password = $_POST["password"];
     
    /**
     * This method registers the User with the predefined table I have created on myPhpAdmin.
     * @see mysqli_stmt_bind_param sends safe queries to the database from @see mysqli_prepare.
     * In other words @see mysqli_stm_bind_param are placeholders for the input. 
     */

    function registerUser() {
        global $connect, $name, $age, $username, $password;
        $statement = mysqli_prepare($connect, "INSERT INTO user (name, age, username, password) VALUES (?, ?, ?, ?)");
        mysqli_stmt_bind_param($statement, "siss", $name, $age, $username, $password);
        mysqli_stmt_execute($statement);
        mysqli_stmt_close($statement);     
    }

    /**
     * This method checks if the username is avaliable from the database.
     */
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