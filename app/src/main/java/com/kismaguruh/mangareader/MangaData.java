package com.kismaguruh.mangareader;

public class MangaData {

    private String mangaName;
    private Integer mangaImage;

    public MangaData(String mangaName, Integer mangaImage) {
        this.mangaName = mangaName;
        this.mangaImage = mangaImage;
    }

    public String getMangaName() {
        return mangaName;
    }

    public void setMangaName(String mangaName) {
        this.mangaName = mangaName;
    }


    public Integer getMangaImage() {
        return mangaImage;
    }

    public void setMangaImage(Integer mangaImage) {
        this.mangaImage = mangaImage;
    }
}
