package com.example.valentine.securityalertcentre.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.valentine.securityalertcentre.R;

import java.util.ArrayList;

/**
 * Created by valentine on 9/13/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> alerts;

    public DataAdapter(ArrayList<String> alerts) {
        this.alerts = alerts;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_emergency.setText(alerts.get(i));
    }

    @Override
    public int getItemCount() {
        return alerts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_emergency;
        public ViewHolder(View view) {
            super(view);

            tv_emergency = (TextView)view.findViewById(R.id.tv_emergency);
        }
    }
}
