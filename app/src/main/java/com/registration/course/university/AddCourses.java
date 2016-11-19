package com.registration.course.university;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 *  This AddCourse activity where the user can choose a variety of courses it
 *  can select to register for the Spring Semester. This class gets called from @see UserAreaActivity.
 *  @author Oscar I. Ricaud
 *  @version 1.0 Build November 16, 2016
 */
public class AddCourses extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourses);

    }
}
