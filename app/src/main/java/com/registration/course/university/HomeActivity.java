package com.registration.course.university;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by oscarricaud on 11/16/16.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        populateListView();
    }

    private void populateListView(){
        String [] courses = {"Discrete Math", "Intro to CS", "Data Structures"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_home, courses);
        ListView list = (ListView) findViewById(R.id.courseView);
        list.setAdapter(adapter);

    }

}
