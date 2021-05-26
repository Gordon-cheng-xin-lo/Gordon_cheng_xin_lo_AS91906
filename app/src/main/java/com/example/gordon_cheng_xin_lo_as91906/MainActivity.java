package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button TimeTableButton;
    Button ContentShareButton;
    Button RevisionButton;
    Button KamarButton;
    Button AccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimeTableButton = findViewById(R.id.TimeTable_button);
        ContentShareButton = findViewById(R.id.ContentShare_button);
        RevisionButton = findViewById(R.id.Revision_button);
        KamarButton = findViewById(R.id.Kamar_button);
        AccountButton = findViewById(R.id.Account_button);



    }


    @SuppressLint("LongLogTag")
    public void Timetable_layer (View aView) {
        Intent Timetable = new Intent(this,Timetable.class);
        startActivity(Timetable);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Timetable Layout Button Pressure");
    }

    @SuppressLint("LongLogTag")
    public void Resource_layer (View aView) {
        Intent Resource = new Intent(this,Resource.class);
        startActivity(Resource);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Resource layout Button Pressure");
    }

    @SuppressLint("LongLogTag")
    public void Revision_layer (View aView) {
        Intent Revision = new Intent(this,Revision.class);
        startActivity(Revision);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Revision layout Button Pressure");
    }

    @SuppressLint("LongLogTag")
    public void Kamar_layer (View aView) {
        Intent Kamar = new Intent(this,Kamar.class);
        startActivity(Kamar);
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Kamar layout Button Pressure");
    }

/*    public void Account_setting (View aView) {
        Intent AccountSetting = new Intent(this,AccountSetting.class);
        startActivity(AccountSetting);
        finish();
        Log.d("Function success Button Pressed===>>>>>>>>>>>>>>>>>>","Setting Button Pressure");
    }*/

}