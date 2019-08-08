package com.example.gradlink;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MyAchievementsActivity extends NavigationActivity {

    private static Button questionbutton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_achievements, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.myachievementsnav);
        OnClickButtonListener();

    }


    public void OnClickButtonListener() {
        questionbutton1 = (Button)findViewById(R.id.questionbutton1);
        questionbutton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.gradlink.MyAchievementsSecond");
                        startActivity(intent);
                    }
                }
        );
    }

}
