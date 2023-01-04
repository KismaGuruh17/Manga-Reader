package com.kismaguruh.mangareader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvManga;
    private ArrayList<MangaEntity>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvManga = findViewById(R.id.recyclerView);
        rvManga.setHasFixedSize(true);

        list.addAll(MangaData.getListManga());
        showRecyclerList();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (rvManga.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible", true);
        }
    }

    private void showRecyclerList(){
        rvManga.setLayoutManager(new LinearLayoutManager(this));
        MangaAdapter mangaAdapter = new MangaAdapter(list);
        rvManga.setAdapter(mangaAdapter);
    }
}