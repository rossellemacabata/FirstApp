package com.example.rosselle.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class home_menu extends AppCompatActivity {
    public Button calendarButton;
    public Button coursesButton;

    public Button testButton;


    public void init(){
        calendarButton = (Button)findViewById(R.id.calendar);
        calendarButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(home_menu.this, view_page1.class);
                startActivity(intent1);
            }
        });

        coursesButton = (Button)findViewById(R.id.cscourses);
        coursesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(home_menu.this, view_page2.class);
                startActivity(intent2);
            }
        });

        testButton = (Button)findViewById(R.id.testbutton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(home_menu.this, event_info.class);
                startActivity(intent3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
        init();
    }
}
