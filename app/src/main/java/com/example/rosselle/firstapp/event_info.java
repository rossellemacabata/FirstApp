package com.example.rosselle.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class event_info extends AppCompatActivity {
    public EditText editEvent;
    public TextView displayText;
    public Button submitButton;
    public Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_info);

        editEvent = (EditText)findViewById(R.id.eventName);
        displayText = (TextView)findViewById(R.id.eventText);
        submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editEvent.getText().toString();
                displayText.setText(name);

                // still need to test on description

            }
        });

        homeButton = (Button)findViewById(R.id.homemenu);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(event_info.this, home_menu.class);
                startActivity(intent);
            }
        });
    }
}
