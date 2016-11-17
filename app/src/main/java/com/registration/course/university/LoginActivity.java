package com.registration.course.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/** The LoginActivity class allows existing users to login in with their credentials, view
 *  Login.php which verifies with the database if the credentials are accurate,
 *  if so the @see HomeActivity loads up so the user can choose classes from the given list.
 *  @author Oscar I. Ricaud
 *  @version 1.0 Build November 16, 2016
 */
public class LoginActivity extends AppCompatActivity {

    /** This is the first method that gets called when the LoginActivity gets created.
     * This is where all the static set up is done, i.e etUserName, etPassword, bLogin
     * and a registerLink.
     * It first creates a layout, activity_login and take in as arguments the username and password
     * from the user. Then verifies if the credentials are correct.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
