package com.kismaguruh.mangareader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MangaData[] mangaData = new MangaData[]{
                new MangaData("One Piece",R.drawable.image),
                new MangaData("Black Clover",R.drawable.image1),
                new MangaData("One Punch Man",R.drawable.image2),
        };
        MangaAdapter mangaAdapter = new MangaAdapter(mangaData, MainActivity.this);
            recyclerView.setAdapter(mangaAdapter);
    }
}