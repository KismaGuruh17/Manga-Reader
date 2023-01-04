package com.kismaguruh.mangareader;

import android.os.Parcel;
import android.os.Parcelable;

public class MangaEntity implements Parcelable {
    private String Manganame;
    private String mangagenre;
    private String mangaauthor;
    private String mangasinopsis;
    private int mangagambar;

    protected MangaEntity(Parcel in) {
        Manganame = in.readString();
        mangagenre = in.readString();
        mangaauthor = in.readString();
        mangasinopsis = in.readString();
        mangagambar = in.readInt();
    }

    public static final Creator<MangaEntity> CREATOR = new Creator<MangaEntity>() {
        @Override
        public MangaEntity createFromParcel(Parcel in) {
            return new MangaEntity(in);
        }

        @Override
        public MangaEntity[] newArray(int size) {
            return new MangaEntity[size];
        }
    };

    public MangaEntity() {

    }

    public String getManganame() {return Manganame;}
    public void setName(String name) { this.Manganame = name;}
    public String getMangagenre() {return mangagenre;}
    public void setMangagenre(String mangagenre) {this.mangagenre = mangagenre;}
    public String getMangaauthor() {return mangaauthor;}
    public void setMangaauthor (String mangaauthor) {this.mangaauthor = mangaauthor;}
    public String getMangasinopsis() {return  mangasinopsis;}
    public void setMangasinopsis (String mangasinopsis) {this.mangasinopsis = mangasinopsis;}
    public int getMangagambar() {return mangagambar;}
    public void setMangagambar(int mangagambar) {this.mangagambar = mangagambar;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Manganame);
        parcel.writeString(mangagenre);
        parcel.writeString(mangaauthor);
        parcel.writeString(mangasinopsis);
        parcel.writeInt(mangagambar);
    }
}
