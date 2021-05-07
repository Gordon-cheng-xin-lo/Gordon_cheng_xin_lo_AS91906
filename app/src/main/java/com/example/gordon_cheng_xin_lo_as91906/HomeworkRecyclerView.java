package com.example.gordon_cheng_xin_lo_as91906;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeworkRecyclerView extends RecyclerView.Adapter<HomeworkRecyclerView.ViewHolder>
{
    HomeworkList[] data;
    Context context;

    public HomeworkRecyclerView(Context context, HomeworkList[] data) {
        this.data = data;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.homework_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeworkRecyclerView.ViewHolder holder, int position)
    {
        /*Got problem showing the content on the list solve it later on at school day
        *        *
        * setText is the correct function for the call but the call detail is having problem
        * */

        holder.DataView_Date.setText(String.valueOf(data[position]));
        holder.DataView_ClassName.setText(String.valueOf(data[position]));
        holder.DataView_Name.setText(String.valueOf(data[position]));
        holder.DataView_Information.setText(String.valueOf(data[position]));
        holder.DataView_Date_Label.setText("Data");
        holder.DataView_ClassName_Label.setText("Class");
        holder.DataView_Name_Label.setText("Name");
        holder.DataView_Information_Label.setText("Detail");
        holder.Editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click","Click");
                Intent Edit = new Intent(context,EditHomeWork.class);
                /*Edit.putExtra()*/
                context.startActivity(Edit);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length ;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView DataView_Date;
        TextView DataView_Date_Label;
        TextView DataView_ClassName;
        TextView DataView_ClassName_Label;
        TextView DataView_Name;
        TextView DataView_Name_Label;
        TextView DataView_Information;
        TextView DataView_Information_Label;
        Button Editbutton;

        
        ViewHolder(View itemView)
        {
            super(itemView);
            DataView_Date= itemView.findViewById(R.id.HM_Date);
            DataView_Date_Label= itemView.findViewById(R.id.HM_Date_Label);
            DataView_ClassName= itemView.findViewById(R.id.HM_Class);
            DataView_ClassName_Label= itemView.findViewById(R.id.HM_Class_Label);
            DataView_Name= itemView.findViewById(R.id.HM_Title);
            DataView_Name_Label= itemView.findViewById(R.id.HM_Title_Label);
            DataView_Information= itemView.findViewById(R.id.HM_Information);
            DataView_Information_Label= itemView.findViewById(R.id.HM_Information_Label);
            Editbutton=itemView.findViewById(R.id.EditButton);
        }


    }






}

