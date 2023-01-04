package com.kismaguruh.mangareader;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ListViewHolder> {
    private ArrayList<MangaEntity> listManga;

    public MangaAdapter(ArrayList<MangaEntity>list) {this.listManga = list;}

    @NonNull
    @Override
    public MangaAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.manga_item_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final MangaEntity mangaEntity = listManga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mangaEntity.getMangagambar())
                .into(holder.imgManga);
        holder.tvname.setText(mangaEntity.getManganame());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), Detail_Activity.class);
                intent.putExtra("MANGA",mangaEntity);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listManga.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgManga;
        TextView tvname;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgManga = itemView.findViewById(R.id.imagemanga);
            tvname = itemView.findViewById(R.id.textNamemanga);
        }
    }
}
