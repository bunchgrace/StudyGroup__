package edu.fsu.cs.mobile.studygroup_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button joinGroup;
    Button createGroup;
    Button createEvent;
    Button joinEvent;
    Button groupPage;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        createEvent = (Button) findViewById(R.id.create_event_button);
        createGroup = (Button) findViewById(R.id.create_group_button);

        createEvent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent = new Intent(MainActivity.this, Create_Event.class);
                startActivity(intent);
            }
        });

        createGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, create_group.class);
                startActivity(intent);
            }
        });

        groupPage = (Button) findViewById(R.id.group_page);
        groupPage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, groupPage.class);
                startActivity(intent);
            }
        });

    }







}
