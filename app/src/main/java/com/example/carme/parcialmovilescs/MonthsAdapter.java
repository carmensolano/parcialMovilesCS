package com.example.carme.parcialmovilescs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MonthsAdapter extends RecyclerView.Adapter<MonthsAdapter.MonthsViewHolder> {
    Context mCtx;
    List<Months> monthsList;

    public MonthsAdapter(Context mCtx, List<Months> monthsList){
        this.mCtx = mCtx;
        this.monthsList = monthsList;
    }

    @Override
    public MonthsViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.activity_prueba_design, parent, false);

        return new MonthsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MonthsViewHolder holder, int position){

        holder.textmonth.setText(monthsList.get(position).getNameMonth());
    }

    @Override
    public int getItemCount(){return monthsList.size();}

    protected class MonthsViewHolder extends RecyclerView.ViewHolder{
        TextView textmonth;

        public MonthsViewHolder(View itemView){
            super(itemView);

            textmonth = itemView.findViewById(R.id.textmonth);
        }
    }


}








