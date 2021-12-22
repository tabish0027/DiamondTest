package com.ozgur.DiamondTest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter_size extends RecyclerView.Adapter<adapter_size.sizesViewHolder> {

    private double[] from;
    private double[] to;


    public static class sizesViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_to_size_from;
        private final TextView tv_to_size_to;
        public sizesViewHolder(View view) {
            super(view);
            tv_to_size_from = (TextView) view.findViewById(R.id.tv_to_size_from);
            tv_to_size_to = (TextView) view.findViewById(R.id.tv_to_size_to);
        }
    }

    public adapter_size(double[] from,double[] to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public sizesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.gi_sizes, viewGroup, false);
        return new sizesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sizesViewHolder holder, int position) {
        double from = this.from[position];
        double to   = this.to[position];

        holder.tv_to_size_from.setText(Double.toString(from));
        holder.tv_to_size_to.setText(Double.toString(to));
    }

    @Override
    public int getItemCount() {
        return from.length;
    }
}