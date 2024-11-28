package com.programmerworld.movieapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.programmerworld.movieapp.Activity.DetailActivity;
import com.programmerworld.movieapp.Domain.ListFilm;
import com.programmerworld.movieapp.Domain.Filmitem;
import com.programmerworld.movieapp.R;

import java.text.BreakIterator;
import java.time.Instant;

public class FilmListAdapter extends RecyclerView.Adapter<FilmListAdapter.ViewHolder> {
    ListFilm items;
    Context context;
    private Instant Glide;


    @NonNull
    @Override
    public FilmListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_films,parent,false);
        context=parent.getContext();
        return new ViewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull FilmListAdapter.ViewHolder holder, int position) {
        holder.titletxt.setText(items.getData().get(position).getTitle());
        holder.Scoretxt.setText(""+items.getData().get(position).getImdbRating());

        Glide.with(holder.itemView.getContext())
                .load(items.getData().get(position).getPoster())
        .into(holder.pic);
        holder.itemView.setOnClickListener(v -> {
            Intent intent=new Intent(holder.itemView.getContext(), DetailActivity.class);
            intent.putExtra("id",items.getData().get(position).getId();
            holder.itemView.getContext().startActivity(intent);


        });
    }

    public FilmListAdapter(ListFilm items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.getData().size() ;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public BreakIterator titletxt;
        public BreakIterator Scoretxt;
        public Object pic;

        public ViewHolder(@NonNull View itemView) {
            TextView Tittletxt,Scoretxt;
            ImageView pic;


            super(itemView);
            Tittletxt=itemView.findViewById(R.id.titletxt);
            Scoretxt=itemView.findViewById(R.id.Scoretxt);
            pic=itemView.findViewById(R.id.pic);

        }
    }
}
