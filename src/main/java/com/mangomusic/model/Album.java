package com.mangomusic.model;

public class Album {

    private Integer albumId;
    private Integer artistId;
    private String title;
    private Integer releaseYear;
    private String artistName;
    private Integer totalPlays;

    public Album() {
    }

    public Album(Integer albumId, String title, String artistName, Integer totalPlays) {
        this.albumId = albumId;
        this.title = title;
        this.artistName = artistName;
        this.totalPlays = totalPlays;
    }

    public Album(Integer albumId, Integer artistId, String title, Integer releaseYear, String artistName, Integer totalPlays) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.artistName = artistName;
        this.totalPlays = totalPlays;
    }

    public Integer getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(Integer totalPlays) {
        this.totalPlays = totalPlays;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Album{" +
                "' albumId=" + albumId +
                ", artistId=" + artistId +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", artistName='" + artistName + '\'' +
                ",TotalPlays='" + totalPlays +
                '}';
    }
}