package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class EditHomeWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_home_work);
    }


    public void Save_change(View aView) {
        /*
        * up data the setting by the get value and update to the list by showing the text view
        * */
        AlertDialog.Builder Check = new AlertDialog.Builder(EditHomeWork.this);
        Check.setMessage("Please make sure the value is correct below");
        Check.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        Check.show();
    }

    public void Leave(View aView) {
        AlertDialog.Builder Warning = new AlertDialog.Builder(EditHomeWork.this);
        Warning.setMessage("Is that you want to leave and Not save the change");
        Warning.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        Warning.show();
    }

}