package com.example.rosselle.firstapp;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                //Intent intent3 = new Intent(home_menu.this, event_info.class);
                //startActivity(intent3);


                View views = getLayoutInflater().inflate(R.layout.dialog_event_task, null);
                final EditText task = (EditText) views.findViewById(R.id.task_nameID);
                final EditText desc = (EditText) views.findViewById(R.id.desc_nameID);


                AlertDialog.Builder b = new AlertDialog.Builder(home_menu.this);



                // inflated layout?
                // find views in the layout inside views of xml
                // try to reference ui view
                // views.asjkdfhajsd -> going through views trying to reference the layout we just inflated





                Button submit = (Button) views.findViewById(R.id.ok_butt);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!task.getText().toString().isEmpty() && !desc.getText().toString().isEmpty()) {

                            String task_name = task.getText().toString();
                            String desc_name = desc.getText().toString();

                            Priority priority = new Task(task_name, desc_name);

                            String name = priority.getName();
                            // System.out.println(name);
                            // Log.d("hiiiiiii", name);

                            Toast.makeText(home_menu.this,
                                    R.string.success_msg,
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(home_menu.this,
                                    R.string.error_msg,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }


                });



                Button cancel = (Button) views.findViewById(R.id.cancel_button);
                cancel.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        // do nothing
                    }


                });

                // set view for layout
                // reference builder
                b.setView(views);
                AlertDialog dialog = b.create();
                dialog.show();
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
