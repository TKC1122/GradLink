package com.example.gradlink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CourseChecklistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_checklist);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);
    }
}
