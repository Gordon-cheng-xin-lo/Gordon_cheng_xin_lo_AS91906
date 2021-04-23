package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.List;

public class Homework extends AppCompatActivity {
    RecyclerView HomeworkRecyclerView;
    HomeworkRecyclerView adapter;

    HomeworkList[] Homework_Information ={
            new HomeworkList("3/6/2021","CSC","Programming","20 Credits"),
            new HomeworkList("4/6/2021","CAL","Complex Number","Test"),
            new HomeworkList("5/5/2021","PHY","MACH","Test"),
            new HomeworkList("6/8/2021","PHT","Platelle","Internal"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        getSupportActionBar();


        HomeworkRecyclerView= findViewById(R.id.Homewok_Recycleview);
        HomeworkRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HomeworkRecyclerView(this,Homework_Information);
        HomeworkRecyclerView.setAdapter(adapter);


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