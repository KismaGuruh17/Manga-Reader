package com.kismaguruh.mangareader;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Detail_Activity extends AppCompatActivity {
    TextView txtAuthor, txtGenre, txtSynopsis;
    ImageView imgManga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_manga);

        txtAuthor = findViewById(R.id.textAuthor);
        txtGenre = findViewById(R.id.textGenre);
        txtSynopsis = findViewById(R.id.sinopsis);

        imgManga = findViewById(R.id.imageDetail);

        MangaEntity manga = getIntent()
                .getParcelableExtra("MANGA");

        txtAuthor.setText(manga.getMangaauthor());
        txtGenre.setText(manga.getMangagenre());
        txtSynopsis.setText(manga.getMangasinopsis());
        Glide.with(Detail_Activity.this)
                .load(manga.getMangagambar())
                .into(imgManga);
        getSupportActionBar().setTitle(manga.getManganame());
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));
    }

}
