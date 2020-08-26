package com.anyang.alcoholapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlcAdapter extends RecyclerView.Adapter<AlcAdapter.ViewHolder>
                            implements OnAlcItemClickListener {
    ArrayList<AlcInfo> items = new ArrayList<AlcInfo>();

    OnAlcItemClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.alc_item, viewGroup, false);

        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        AlcInfo item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(AlcInfo item) {
        items.add(item);
    }

    public void setItems(ArrayList<AlcInfo> items) {
        this.items = items;
    }

    public AlcInfo getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, AlcInfo item) {
        items.set(position, item);
    }

    public void setOnItemClickListener(OnAlcItemClickListener listener) {
        this.listener = listener;
    }



    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if (listener != null) {
            listener.onItemClick(holder, view, position);
        }
    }




    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView3;
        TextView textView5;
        TextView textView6;
        ImageView imageView;

        public ViewHolder(View itemView, final OnAlcItemClickListener listener) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.textView1);
            textView3 = itemView.findViewById(R.id.textView3);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    if (listener != null) {
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            });
        }

        public void setItem(AlcInfo item) {
            textView1.setText(item.getDate());
            textView3.setText(item.getSoju());
            textView5.setText(item.getBeer());
            textView6.setText(item.getSymptom());
        }

    }

}
