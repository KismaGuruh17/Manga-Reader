package com.kismaguruh.mangareader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder> {

        MangaData[] MangaData;
        Context context;

        public MangaAdapter(MangaData[] MangaData, MainActivity activity) {
            this.MangaData = MangaData;
            this.context = activity;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.manga_item_list,parent,false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final MangaData mangadata = MangaData[position];
            holder.MangaName.setText(mangadata.getMangaName());
            holder.MangaImage.setImageResource(mangadata.getMangaImage());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, mangadata.getMangaName(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return MangaData.length;
        }


        public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView MangaImage;
            TextView MangaName;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                MangaImage = itemView.findViewById(R.id.imageview);
                MangaName = itemView.findViewById(R.id.textName);

            }
        }

    }

