package com.example.kidsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    Model model=new Model();
    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        int pos=position;
        Glide.with(context).load(model.thumb[pos]).into(holder.image1);
        holder.text1.setText(model.title[pos]);
        holder.text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentvideo=new Intent(context, VideoPlayer.class);
                intentvideo.putExtra("ind",model.index[pos]);
                intentvideo.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intentvideo);
            }
        });


    }


    @Override
    public int getItemCount() {
        return model.index.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView image1;
        public TextView text1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.image);
            text1 = itemView.findViewById(R.id.title);
        }
    }

}
