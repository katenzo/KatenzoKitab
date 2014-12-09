package com.example.katenzo.models;


import com.google.gson.annotations.Expose;


public class ImageLinks {

    @Expose
    private String smallThumbnail;
    @Expose
    private String thumbnail;

    /**
     *
     * @return
     * The smallThumbnail
     */
    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    /**
     *
     * @param smallThumbnail
     * The smallThumbnail
     */
    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    /**
     *
     * @return
     * The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}