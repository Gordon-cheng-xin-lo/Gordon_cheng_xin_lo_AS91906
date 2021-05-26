package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {

    Button HomeButton;
    Button Accountbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        HomeButton = findViewById(R.id.Timetable_home_button);
        Accountbutton = findViewById(R.id.Timetable_account_button);
    }

    @SuppressLint("LongLogTag")
    public void Return (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Return Function Button Pressure");
        finishAffinity();
    }

    @SuppressLint("LongLogTag")
    public void Scooltimetable (View aView) {
        Intent Schooltimetable_function = new Intent(this,SchoolTimetable.class);
        startActivity(Schooltimetable_function);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Schooltimetable Function Button Pressure");
    }


    @SuppressLint("LongLogTag")
    public void Homework (View aView) {
        Intent Homework_function = new Intent (this,Homework.class);
        startActivity(Homework_function);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Homework Function Button Pressure");
    }
}