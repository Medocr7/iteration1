package com.example.iteration1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // This button will view all the Plans/Task that the user has added into the Agenda
    Button ViewTask = findViewById(R.id.Agenda);
    ViewTask.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, AgendaViewing.class));
        }
    });
    /* This button will pop up a menu that will allow the user to add items into a date. Which will then be recorded and pulled up should the user ever
    exit the application.
    */
    Button AddPlans = findViewById(R.id.AgendaAdd);
    AddPlans.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, AgendaAdd.class));
        }
    });
    // This button will pop up a view of the calender of the month ***TRACKS BASED ON REAL TIME***
    Button CalenderView = findViewById(R.id.CalenderView);
    CalenderView.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, ViewCalender.class));
        }
    } );

    // Exits the App and pops with an error code of 0.
    Button ExitApp =findViewById(R.id.ExitApp);
    ExitApp.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
            System.exit(0);
        }
    });
    }
}
