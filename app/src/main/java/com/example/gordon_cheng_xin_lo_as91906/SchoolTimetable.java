package com.example.gordon_cheng_xin_lo_as91906;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class SchoolTimetable extends AppCompatActivity {

    GridView gridView;

    String[] names = {"Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo"};

    int[] image = {R.drawable.img8458,R.drawable.img8460,R.drawable.img8461,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8479,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8486,R.drawable.img8487,R.drawable.img8488,R.drawable.img8490,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495,R.drawable.img8458,R.drawable.img8460,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8479,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8486,R.drawable.img8487,R.drawable.img8488,R.drawable.img8490,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_timetable);
        gridView = findViewById(R.id.SchoolTimeTbale_GridView);

        CustomerAdapter customerAdapter = new CustomerAdapter(names,image,this);
        gridView.setAdapter(customerAdapter);
    }

    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this,NewSchoolTimeTable.class);
        startActivity(New_Homework_Function);
    }

    public class CustomerAdapter extends BaseAdapter {
        private String[] ClassName;
        private int[] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomerAdapter(String[] ClassName, int[] imagesPhoto, Context context) {
            this.ClassName = ClassName;
            this.imagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return imagesPhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if( view == null) {
                view = layoutInflater.inflate(R.layout.schooltimetable_girdview,viewGroup,false);
            }

            TextView ClassNameView = view.findViewById(R.id.ClassNameGirdView);
            ImageView imageView = view.findViewById(R.id.imageView);

            ClassNameView.setText(ClassName[i]);
            imageView.setImageResource(imagesPhoto[i]);

            return view;
        }
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