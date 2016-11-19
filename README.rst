Description
======
This respiratory builds an android application with the following activities and xml files, LogIn, RegisterRequest and Register. 
The purpose of this assignment is to allow new or existing users to create accounts and be able to sign up for their college courses.

How does it work?
======

The android application launches and takes the user to the @see LoginActivity.java and gives an opportunity to the user to log in if they have an existing account, else to register for a new account. This works very well because of the files that are in the backend folder, @see Login.php & 
Register.php. You see these 2 files are stored in my domain and talk to the database. For now the database contains a simple table called user, which
is where the information of the user is stored, i.e user_id (which auto increments each time a new account is created), name, username, age and
finally password.  

Once the user creates an account they can input their credentials with the help of @see Login.php and @see LoginActivity.java and @see LoginRequest verifies if the user credentials are correct. If the credentials are correct @see HomeActivity.java displays with a simple welcome home page.

Screenshots
======
User can Log in 
(https://github.com/oiricaud/University-Course-Registration/blob/master/Screenshots/Login.png "Log in")

Or User can Register
(https://github.com/oiricaud/University-Course-Registration/blob/master/Screenshots/Register.png "Register")

Assignment 4 Advanced OO Programing
======

Javadoc & Unit Tests

Due November 17th by end of day on Blackboard

In this assignment, you are going to improve your project by providing more feature implementation, improve documentation using Javadoc, and improve code quality by writing unit test cases using Junit.

Task 1: Javadoc Refer to the Javadoc lecture notes, and Javadoc help and examples available online (for example: http://www.oracle.com/technetwork/articles/java/index-137868.html). Add Javadoc features to your project and satisfy the following:

For each class, document the author, the version For each method, document parameter details. Describe the return value for methods that have a return value (other than void return type) Document Packages and Class usage Use @see to refer to another method or class, as appropriate Submission Guidelines 1. Java source code with Javadoc annotations. 2. Generated Javadoc documentation.

Task 2: Junit tests Refer to the Junit topic discussed in class, and to Junit best practices available online (for example: http://www.kyleblaney.com/junit-best-practices/). Add Junit test cases to your project satisfying the following.

At minimum, utilize the following assert statements as appropriate: 
a. assertEquals(a,b) 
b. assertFalse(a)
c. assertNotSame(a, b) 
d. assertNull(a) 
e. assertSame(a,b) 
f. assertTrue(a) 

 At minimum, each method should be tested using two assert statements. At minimum, each implemented use case should be tested using two Junit test cases. Submission Guidelines 

 1. Java source code with Junit tests. 
 2. Sample runs showing Junit test results.

Task 3: Implement 3 use cases you have identified for your project.

Chose three use cases that you have identified for your project and implement them in Java. Include the implemented use cases in your submission.
