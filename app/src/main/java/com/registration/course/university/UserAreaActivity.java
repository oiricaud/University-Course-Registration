package com.registration.course.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 *  This UserAreaActivity gets called from the LoginActivity once the user has successfully logged in
 *  In other words this is the activity that will soon in the future contain the list of courses where
 *  the user can select from and register through the database. This will speed up the process of adding
 *  deleting or removing courses without touching the code. How? Well the database is the brain and
 *  I will use this class as a way to handle the brain.
 *
 *  In the meantime it prints a simple welcome message and the username of the user.
 *  @author Oscar I. Ricaud
 *  @version 1.0 Build November 16, 2016
 */
public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);


        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        String message = name + " welcome!";
        welcomeMessage.setText(message);
        etUsername.setText(username);
    }
}
