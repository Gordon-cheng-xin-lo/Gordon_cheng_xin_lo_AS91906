package com.example.gordon_cheng_xin_lo_as91906;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull HomeworkRecyclerView.ViewHolder holder, int position)
    {
        /*holder.DataView_Date.setText((CharSequence) data[position]);
        holder.DataView_ClassName.setText((CharSequence) data[position]);
        holder.DataView_Name.setText((CharSequence) data[position]);
        holder.DataView_Information.setText((CharSequence) data[position]);*/

        holder.DataView_Date.setText(HomeworkList.Data);
    }

    @Override
    public int getItemCount() {
        return data.length ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView DataView_Date;
        TextView DataView_ClassName;
        TextView DataView_Name;
        TextView DataView_Information;
        ViewHolder(View itemView)
        {
            super(itemView);
            DataView_Date= itemView.findViewById(R.id.HM_Date);
            DataView_ClassName= itemView.findViewById(R.id.HM_Class);
            DataView_Name= itemView.findViewById(R.id.HM_Title);
            DataView_Information= itemView.findViewById(R.id.HM_Information);
        }
    }
}

