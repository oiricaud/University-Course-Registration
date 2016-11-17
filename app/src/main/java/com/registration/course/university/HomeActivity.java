package com.registration.course.university;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/** This activity is where the User can view the classes it can register for.
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class HomeActivity extends AppCompatActivity {

    /** Calls the @see populateListView recall that the onCreate is the very first thing that gets
     * called when this activity is called.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        populateListView();
    }

    /**
     * This method is straightforward it populates the list view I had defined in the @see activity_home.xml
     */
    private void populateListView(){
        String [] courses = {"Discrete Math", "Intro to CS", "Data Structures", "Numerical Analysis" +
                "Ethics", "Elementary Data Structures"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_home, courses);
        ListView list = (ListView) findViewById(R.id.courseView);
        list.setAdapter(adapter);

    }

}
