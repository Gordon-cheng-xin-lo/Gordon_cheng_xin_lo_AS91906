package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class kamarwebvivew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamarwebvivew);
        WebView KamarWeb = findViewById(R.id.KamarWebView);
        KamarWeb.loadUrl("https://kamarportal.mrgs.school.nz/index.php");
    }

    public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void Return (View aView) {
        finish();
    }
}