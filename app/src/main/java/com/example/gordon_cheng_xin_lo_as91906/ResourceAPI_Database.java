package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ResourceAPI_Database extends AppCompatActivity {



    private static final String LOGCAT_TAG = "weather";
    // Constants:
    final String Base_URL = "http://api.openweathermap.org/data/2.5/weather";
    // App ID to use OpenWeather data
    final String APP_ID = "70e7f48b946f9057bd9d44a4a31c2e04";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_api_database);

    }
}