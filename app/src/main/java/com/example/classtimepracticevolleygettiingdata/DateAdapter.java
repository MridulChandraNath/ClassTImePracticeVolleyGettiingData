package com.example.classtimepracticevolleygettiingdata;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DateAdapter extends RecyclerView.Adapter<DateAdapter.MyViewHolder> {
    Context context;
    List<date_list> list;


    public DateAdapter(Context context, List<date_list> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_date, parent, false);
        return new MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        date_list log = list.get(position);

        holder.tvDate.setText(log.getDate());
        /*holder.textRating.setText(String.valueOf(log.getDate()));
        holder.textYear.setText(String.valueOf(log.getTotalFAbsent()));
        holder.textYear.setText(String.valueOf(log.getTotalMAbsent()));
        holder.textYear.setText(String.valueOf(log.getTotalMalePresent()));
        holder.textYear.setText(String.valueOf(log.getTotalFemalePresent()));*/
//        holder.textYear.setText(String.valueOf(log.getTotalFAbsent()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvDate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvDate);
        }
    }
}
