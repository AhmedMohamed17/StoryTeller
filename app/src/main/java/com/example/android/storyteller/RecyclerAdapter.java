package com.example.android.storyteller;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    Context activity;
    ArrayList<story> story;

    public RecyclerAdapter(Context activity, ArrayList<com.example.android.storyteller.story> story) {
        this.activity = activity;
        this.story = story;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view=inflater.inflate(R.layout.cardview_item,null);
         return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final  int i) {
        holder.img.setImageResource((story.get(i)).getImg());
        holder.titl.setText((story.get(i)).getStroy());
        holder.reference.setText((story.get(i)).getReference());
        holder.cardView.setOnClickListener(
                new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,the_story.class);
                intent.putExtra("title",story.get(i).getStroy());
                intent.putExtra("content",story.get(i).getContent());
                intent.putExtra("mg",story.get(i).getImg());
                activity.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView titl;
        TextView reference;
        CardView cardView;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
              img = itemView.findViewById(R.id.img);
              titl = itemView.findViewById(R.id.ttl);
              reference = itemView.findViewById(R.id.rf);
              cardView=itemView.findViewById(R.id.card);

        }
    }
}
