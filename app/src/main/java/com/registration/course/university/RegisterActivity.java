package com.registration.course.university;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * The RegisterActivity Class sets up the editViews for Name, Username, Password and the Age.
 * In layman terms this is the class that connects to the activity_register.xml to build the register
 * layout of the Android application. It allows the user to create an account.
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class RegisterActivity extends AppCompatActivity {

    /** This is the activity that is called when the user presses the register button from @see
     *  LogInActivity class. It calls the 3 Textviews that I had defined
     *  in the GUI, etName, etUsername, etAge, and bRegister and creates final editText holders to
     *  take input from the user and send it to the database. And finally has a button, register
     *  that calls the class @see RegisterRequest and sends the request from that class to the database.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText etFirstname = (EditText) findViewById(R.id.etFirstname);
        final EditText etLastname = (EditText) findViewById(R.id.etLastname);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        // Listen to the user input.
        bRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final String firstname = etFirstname.getText().toString();
                final String lastname = etLastname.getText().toString();
                final String email = etEmail.getText().toString();
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());


                // startActivity(new Intent(RegisterActivity.this, LoginActivity.class));

                // Verifies if the user login input is correct with the database I created
                // If the input log in successfully it allows the user to go to the next activity,
                // @see HomeActivity and this is where the user can select classes it wants to register for
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success){
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed").setNegativeButton("Retry", null).create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };


                // The next 3 lines calls the @see RegisterRequest class.
                RegisterRequest registerRequest = new RegisterRequest(firstname, lastname, email,
                                                      username, password, age, responseListener);

                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);

            }
        });
    }
}
